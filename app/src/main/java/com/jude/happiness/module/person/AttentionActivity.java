package com.jude.happiness.module.person;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.happiness.R;
import com.jude.happiness.app.BaseActivity;
import com.jude.happiness.model.bean.User;

/**
 * Created by Mr.Jude on 2015/8/9.
 */
@RequiresPresenter(AttentionPresenter.class)
public class AttentionActivity extends BaseActivity<AttentionPresenter> {
    private EasyRecyclerView mRecyclerView;
    private PersonBriefAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        mRecyclerView = (EasyRecyclerView) findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapterWithProgress(mAdapter = new PersonBriefAdapter(this));
    }


    public void setUser(User[] data){
        mAdapter.addAll(data);
    }
}
