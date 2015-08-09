package com.jude.happiness.module.trends;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.happiness.R;
import com.jude.happiness.app.BaseActivity;
import com.jude.happiness.model.bean.Trends;

/**
 * Created by Mr.Jude on 2015/8/9.
 */

@RequiresPresenter(UserTrendsPresenter.class)
public class UserTrendsActivity extends BaseActivity<UserTrendsPresenter> {
    private EasyRecyclerView mRecyclerView;
    private TrendsAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        mRecyclerView = (EasyRecyclerView) findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapterWithProgress(mAdapter = new TrendsAdapter(this));
    }

    public void setTrends(Trends[] data){
        mAdapter.addAll(data);
    }
}
