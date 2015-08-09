package com.jude.happiness.module.gift;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.beam.nucleus.view.NucleusFragment;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.happiness.R;
import com.jude.happiness.model.bean.Gift;

/**
 * Created by Mr.Jude on 2015/8/7.
 */
@RequiresPresenter(GiftPresenter.class)
public class GiftFragment extends NucleusFragment<GiftPresenter> {
    private EasyRecyclerView mRecyclerView;
    private GiftAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.include_recyclerview,container,false);
        mRecyclerView = (EasyRecyclerView) view.findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapterWithProgress(mAdapter = new GiftAdapter(getActivity()));
        mRecyclerView.setRefreshListener(() -> getPresenter().refresh());
        mAdapter.setMore(R.layout.view_list_more, () -> getPresenter().loadMore());
        return view;
    }

    public void stopRefresh(){
        mAdapter.clear();
    }

    public void addDate(Gift[] actions){
        mAdapter.addAll(actions);
    }

    public void stopLoadMore(){
        mAdapter.stopMore();
    }
}
