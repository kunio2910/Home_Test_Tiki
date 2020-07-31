package com.letran.home_test_tiki.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.letran.home_test_tiki.R;
import com.letran.home_test_tiki.adapter.Banner_Recycleview_Adapter;
import com.letran.home_test_tiki.adapter.QuickLink_Recycleview_Adapter;
import com.letran.home_test_tiki.models.Item;
import com.letran.home_test_tiki.models.ItemWrapper;
import com.letran.home_test_tiki.models.ListItemDrapper;
import com.letran.home_test_tiki.presenter.Handle_Presenter_QuickLink;
import com.letran.home_test_tiki.presenter.QuickLink_Presenter;

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
        GetDataQuickLink();
        return contentView;
    }

    private void Initialization(){
        recyclerView = (RecyclerView)contentView.findViewById(R.id.recycleview);
    }

    private void GetDataQuickLink(){
        quickLink_presenter = new QuickLink_Presenter(this,getContext());
        quickLink_presenter.GetData();
    }

    @Override
    public void GetDataSuccessQuickLink(List<Item> lstQuickLink) {
        quickLink_recycleview_adapter = new QuickLink_Recycleview_Adapter(lstQuickLink,getContext());
        GridLayoutManager mLayoutManager = new GridLayoutManager(getContext(),2, GridLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(quickLink_recycleview_adapter);
    }

    @Override
    public void GetDataFail(String error) {

    }
}
