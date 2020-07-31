package com.letran.home_test_tiki.presenter;

import com.letran.home_test_tiki.models.Item;

import java.util.List;

public class Handle_Presenter_QuickLink {
    public interface View{
        void GetDataQuickLinkSuccess(List<Item> lstQuickLink);
        void GetDataFail(String error);
    }

    public interface Presenter{
        void GetDataJsonFromAPI();
    }
}
