package com.letran.home_test_tiki.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.letran.home_test_tiki.R;
import com.letran.home_test_tiki.adapter.Banner_Recycleview_Adapter;
import com.letran.home_test_tiki.models.Banner;
import com.letran.home_test_tiki.presenter.Handle_Presenter_Banner;
import com.letran.home_test_tiki.presenter.Banner_Presenter;

import java.util.List;

public class Banner_Fragment extends Fragment implements Handle_Presenter_Banner.View {

    private View contentView;
    private RecyclerView recyclerView;
    private Banner_Presenter banner_presenter;
    private Banner_Recycleview_Adapter banner_recycleview_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        contentView= inflater.inflate(R.layout.fragment_banner, container, false);

        Initialization();
        GetDataBanner();
        return contentView;
    }

    private void Initialization(){
        recyclerView = (RecyclerView)contentView.findViewById(R.id.recycleview);
    }

    private void GetDataBanner(){
        banner_presenter = new Banner_Presenter(this,getContext());
        banner_presenter.GetData();
    }

    @Override
    public void GetDataSuccessBanner(List<Banner> lstBanner) {
        banner_recycleview_adapter = new Banner_Recycleview_Adapter(lstBanner,getContext());
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(banner_recycleview_adapter);
    }

    @Override
    public void GetDataFail(String error) {
        Toast.makeText(getContext(),error,Toast.LENGTH_SHORT).show();
    }
}
