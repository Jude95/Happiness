package com.jude.happiness.module.trends;

import android.os.Bundle;

import com.jude.beam.nucleus.manager.Presenter;
import com.jude.happiness.model.TrendsModel;
import com.jude.happiness.model.bean.Trends;
import com.jude.happiness.model.callback.DataCallback;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Mr.Jude on 2015/8/7.
 */
public class TrendsPresenter extends Presenter<TrendsFragment> {
    private int page = 0;
    private ArrayList<Trends> mDateArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        refresh();
    }

    @Override
    protected void onTakeView(TrendsFragment view) {
        super.onTakeView(view);
        if (mDateArrayList.size()!=0){
            getView().stopRefresh();
            getView().addDate(mDateArrayList.toArray(new Trends[0]));
        }
    }

    public void refresh(){
        TrendsModel.getInstance().getTrends(0, new DataCallback<Trends[]>() {
            @Override
            public void success(String info, Trends[] actions) {
                if (getView() != null) {
                    if (actions == null || actions.length == 0) getView().stopRefresh();
                    else {
                        getView().stopRefresh();
                        getView().addDate(actions);
                        mDateArrayList.clear();
                        mDateArrayList.addAll(Arrays.asList(actions));
                        page = 1;
                    }
                }
            }
        });
    }

    public void loadMore() {
        TrendsModel.getInstance().getTrends(page, new DataCallback<Trends[]>() {
            @Override
            public void success(String info, Trends[] actions) {
                if (getView() != null) {
                    if (actions == null || actions.length == 0) getView().stopLoadMore();
                    else {
                        getView().addDate(actions);
                        mDateArrayList.addAll(Arrays.asList(actions));
                    }
                    page++;
                }
            }
        });
    }
}
