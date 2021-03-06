package com.letran.home_test_tiki.presenter;

import com.letran.home_test_tiki.models.Banner;

import java.util.List;

public class Handle_Presenter_Banner {

    public interface View{
        void GetDataBannerSuccess(List<Banner> lstBanner);
        void GetDataFail(String error);
    }

    public interface Presenter{
        void GetDataJsonFromAPI();
    }
}
