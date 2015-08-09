package com.jude.happiness.module.gift;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.happiness.model.bean.Gift;

/**
 * Created by Mr.Jude on 2015/8/9.
 */
public class GiftAdapter extends RecyclerArrayAdapter<Gift> {
    public GiftAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup viewGroup, int i) {
        return new GiftViewHolder(viewGroup);
    }
}
