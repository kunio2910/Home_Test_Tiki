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
import com.letran.home_test_tiki.models.BannerWrapper;
import com.letran.home_test_tiki.utils.AppConfig;
import com.letran.home_test_tiki.utils.AppController;

import dmax.dialog.SpotsDialog;

public class Banner_Presenter implements Handle_Presenter_Banner.Presenter {

    private Handle_Presenter_Banner.View mView;
    private AlertDialog alertDialog;
    private Context context;
    private final Gson gson = new Gson();

    public Banner_Presenter(Handle_Presenter_Banner.View mView, Context context) {
        this.mView = mView;
        this.context = context;
    }

    @Override
    public void GetData() {

        // Tag used to cancel the request
        String tag_string_req = "req_getdata";

        alertDialog = new SpotsDialog.Builder()
                .setContext(context)
                .setTheme(R.style.Custom)
                .setCancelable(false).build();
        alertDialog.show();

        StringRequest strReqCar_1 = new StringRequest(Request.Method.GET, AppConfig.BANNER_API, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                convertJsonToObjectBanner(response);
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
        AppController.getInstance(context).addToRequestQueue(strReqCar_1, tag_string_req);
    }

    public void convertJsonToObjectBanner(String response) {
        BannerWrapper bannerWrapper = gson.fromJson(response, BannerWrapper.class);
        mView.GetDataSuccessBanner(bannerWrapper.getData());
    }
}
