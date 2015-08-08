package com.jude.happiness.module.trends;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.happiness.model.bean.Trends;

/**
 * Created by Mr.Jude on 2015/8/8.
 */
public class TrendsAdapter extends RecyclerArrayAdapter<Trends> {
    public TrendsAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup viewGroup, int i) {
        return new TrendsViewHolder(viewGroup);
    }
}
