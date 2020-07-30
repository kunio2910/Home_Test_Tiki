package com.letran.home_test_tiki.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.letran.home_test_tiki.R;
import com.letran.home_test_tiki.adapter.Flashdeal_Recycleview_Adapter;
import com.letran.home_test_tiki.models.FlashDeal;
import com.letran.home_test_tiki.presenter.Flashdeal_Presenter;
import com.letran.home_test_tiki.presenter.Handle_Presenter_Flashdeal;

import java.util.List;

public class Flashdeal_Fragment extends Fragment implements Handle_Presenter_Flashdeal.View {

    private RecyclerView recyclerView;
    private Flashdeal_Presenter flashdeal_presenter;
    private Flashdeal_Recycleview_Adapter flashdeal_recycleview_adapter;
    private View contentView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        contentView= inflater.inflate(R.layout.fragment_flashdeal, container, false);

        Initialization();
        GetDataFlashDeal();

        return contentView;
    }

    private void Initialization(){
        recyclerView = (RecyclerView)contentView.findViewById(R.id.recycleview);
    }

    private void GetDataFlashDeal(){
        flashdeal_presenter = new Flashdeal_Presenter(this,getContext());
        flashdeal_presenter.GetData();
    }

    @Override
    public void GetDataSuccessFlashdeal(List<FlashDeal> lstFlashdeal) {
        flashdeal_recycleview_adapter = new Flashdeal_Recycleview_Adapter(lstFlashdeal,getContext());
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(flashdeal_recycleview_adapter);
    }

    @Override
    public void GetDataFail(String error) {

    }
}
