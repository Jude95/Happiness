package com.jude.happiness.module.gift;

import android.os.Bundle;

import com.jude.beam.nucleus.manager.Presenter;
import com.jude.happiness.model.GiftModel;
import com.jude.happiness.model.bean.Gift;
import com.jude.happiness.model.callback.DataCallback;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Mr.Jude on 2015/8/7.
 */
public class GiftPresenter extends Presenter<GiftFragment> {

    private int page = 0;
    private ArrayList<Gift> mDateArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        refresh();
    }

    @Override
    protected void onTakeView(GiftFragment view) {
        super.onTakeView(view);
        if (mDateArrayList.size()!=0){
            getView().stopRefresh();
            getView().addDate(mDateArrayList.toArray(new Gift[0]));
        }
    }

    public void refresh(){
        GiftModel.getInstance().getGift(0, new DataCallback<Gift[]>() {
            @Override
            public void success(String info, Gift[] actions) {
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
        GiftModel.getInstance().getGift(page, new DataCallback<Gift[]>() {
            @Override
            public void success(String info, Gift[] actions) {
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
