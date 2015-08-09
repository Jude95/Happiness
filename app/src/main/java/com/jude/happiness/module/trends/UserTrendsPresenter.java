package com.jude.happiness.module.trends;

import android.os.Bundle;

import com.jude.beam.nucleus.manager.Presenter;
import com.jude.happiness.model.TrendsModel;
import com.jude.happiness.model.bean.Trends;
import com.jude.happiness.model.callback.DataCallback;

/**
 * Created by Mr.Jude on 2015/8/9.
 */
public class UserTrendsPresenter extends Presenter<UserTrendsActivity> {

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        TrendsModel.getInstance().getTrends(0, new DataCallback<Trends[]>() {
            @Override
            public void success(String info, Trends[] data) {
                getView().setTrends(data);
            }
        });
    }
}
