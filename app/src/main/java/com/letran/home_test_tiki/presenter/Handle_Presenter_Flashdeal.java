package com.letran.home_test_tiki.presenter;

import com.letran.home_test_tiki.models.FlashDeal;

import java.util.List;

public class Handle_Presenter_Flashdeal {
    public interface View{
        void GetDataFlashdealSuccess(List<FlashDeal> lstFlashdeal);
        void GetDataFail(String error);
    }

    public interface Presenter{
        void GetDataJsonFromAPI();
    }
}
