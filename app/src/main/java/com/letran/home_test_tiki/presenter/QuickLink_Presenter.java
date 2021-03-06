package com.letran.home_test_tiki.presenter;

import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.letran.home_test_tiki.R;
import com.letran.home_test_tiki.models.Item;
import com.letran.home_test_tiki.models.ItemWrapper;
import com.letran.home_test_tiki.utils.AppConfig;
import com.letran.home_test_tiki.utils.AppController;

import java.util.ArrayList;
import java.util.List;

import dmax.dialog.SpotsDialog;

public class QuickLink_Presenter implements Handle_Presenter_QuickLink.Presenter {

    private Handle_Presenter_QuickLink.View mView;
    private AlertDialog alertDialog;
    private Context context;
    private final Gson gson = new Gson();

    public QuickLink_Presenter(Handle_Presenter_QuickLink.View mView, Context context) {
        this.mView = mView;
        this.context = context;
    }

    @Override
    public void GetDataJsonFromAPI() {

        // Tag used to cancel the request
        String tag_string_req = "req_getdata";

        alertDialog = new SpotsDialog.Builder()
                .setContext(context)
                .setTheme(R.style.Custom)
                .setCancelable(false).build();
        alertDialog.show();

        StringRequest strReq = new StringRequest(Request.Method.GET, AppConfig.QUICK_LINK_API, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                convertJsonToObjectQuickLink(response);
                alertDialog.dismiss();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mView.GetDataFail(error.getMessage());
                Log.e("infor", "Get data Error: " + error.getMessage());
            }
        });

        // Adding request to request queue
        AppController.getInstance(context).addToRequestQueue(strReq, tag_string_req);
    }

    public void convertJsonToObjectQuickLink(String response) {
        ItemWrapper itemWrapper = gson.fromJson(response, ItemWrapper.class);
        List<Item> lstItemResult = new ArrayList<Item>();
        List<List<Item>> lstListItem = itemWrapper.getData();

        for (int i = 0; i < lstListItem.size(); i++) {
            List<Item> lstItem = lstListItem.get(i);
            if (lstItem != null && lstItem.size() > 0) {
                for (int j = 0; j < lstItem.size(); j++) {
                    Item item = lstItem.get(j);
                    lstItemResult.add(item);
                }
            }
        }

        mView.GetDataQuickLinkSuccess(lstItemResult);
    }
}
