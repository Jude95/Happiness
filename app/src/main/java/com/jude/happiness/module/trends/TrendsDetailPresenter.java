package com.jude.happiness.module.trends;

import android.os.Bundle;

import com.jude.beam.nucleus.manager.Presenter;
import com.jude.happiness.model.bean.Trends;

/**
 * Created by Mr.Jude on 2015/8/9.
 */
public class TrendsDetailPresenter extends Presenter<TrendsDetailActivity> {
    private Trends trends;
    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        trends = (Trends) getView().getIntent().getSerializableExtra("trends");
    }

    @Override
    protected void onCreateView(TrendsDetailActivity view) {
        super.onCreateView(view);
        getView().setTrends(trends);
    }
}
