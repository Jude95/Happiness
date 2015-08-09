package com.jude.happiness.module.person;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.happiness.model.bean.User;

/**
 * Created by alien on 2015/7/10.
 */
public class PersonBriefAdapter extends RecyclerArrayAdapter<User> {


    public PersonBriefAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new PersonBriefViewHolder(parent);
    }

}
