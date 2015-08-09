package com.jude.happiness.module.trends;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.beam.nucleus.view.NucleusFragment;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.happiness.R;
import com.jude.happiness.model.bean.Trends;

/**
 * Created by Mr.Jude on 2015/8/7.
 */
@RequiresPresenter(TrendsPresenter.class)
public class TrendsFragment extends NucleusFragment<TrendsPresenter> {
    private EasyRecyclerView mRecyclerView;
    private TrendsAdapter mAdapter;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.include_recyclerview,container,false);
        mRecyclerView = (EasyRecyclerView) view.findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapterWithProgress(mAdapter = new TrendsAdapter(getActivity()));
        mRecyclerView.setRefreshListener(() -> getPresenter().refresh());
        mAdapter.setMore(R.layout.view_list_more, () -> getPresenter().loadMore());
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_trends,menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.add){
            startActivity(new Intent(getActivity(),TrendsWriteActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    public void stopRefresh(){
        mAdapter.clear();
    }

    public void addDate(Trends[] actions){
        mAdapter.addAll(actions);
    }

    public void stopLoadMore(){
        mAdapter.stopMore();
    }
}
