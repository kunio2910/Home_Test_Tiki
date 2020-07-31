package com.letran.home_test_tiki.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.letran.home_test_tiki.R;
import com.letran.home_test_tiki.adapter.QuickLink_Recycleview_Adapter;
import com.letran.home_test_tiki.models.Item;
import com.letran.home_test_tiki.presenter.Handle_Presenter_QuickLink;
import com.letran.home_test_tiki.presenter.QuickLink_Presenter;
import com.letran.home_test_tiki.utils.RecyclerTouchListener;

import java.util.List;

public class QuickLink_Fragment extends Fragment implements Handle_Presenter_QuickLink.View {

    private View contentView;
    private RecyclerView recyclerView;
    private QuickLink_Presenter quickLink_presenter;
    private QuickLink_Recycleview_Adapter quickLink_recycleview_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        contentView= inflater.inflate(R.layout.fragment_quicklink, container, false);

        Initialization();
        return contentView;
    }

    private void Initialization(){
        recyclerView = (RecyclerView)contentView.findViewById(R.id.recycleview);
        quickLink_presenter = new QuickLink_Presenter(this,getContext());
        quickLink_presenter.GetDataJsonFromAPI();
    }

    @Override
    public void GetDataQuickLinkSuccess(final List<Item> lstQuickLink) {
        //Show data in recyclerview and get event touch
        quickLink_recycleview_adapter = new QuickLink_Recycleview_Adapter(lstQuickLink,getContext());
        GridLayoutManager mLayoutManager = new GridLayoutManager(getContext(),2, GridLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(quickLink_recycleview_adapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(lstQuickLink.get(position).getUrl()));
                startActivity(browserIntent);
            }
        }));
    }

    @Override
    public void GetDataFail(String error) {
        Toast.makeText(getContext(),error,Toast.LENGTH_SHORT).show();
    }
}
