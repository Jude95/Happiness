package com.jude.happiness.module.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.happiness.R;
import com.jude.happiness.app.BaseActivity;
import com.jude.utils.JUtils;

import butterknife.ButterKnife;
import butterknife.InjectView;

@RequiresPresenter(MainPresenter.class)
public class MainActivity extends BaseActivity<MainPresenter> {


    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    @InjectView(R.id.container)
    FrameLayout container;
    @InjectView(R.id.trends)
    LinearLayout trends;
    @InjectView(R.id.wedding)
    LinearLayout wedding;
    @InjectView(R.id.gift)
    LinearLayout gift;
    @InjectView(R.id.person)
    LinearLayout person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        setSwipeBackEnable(false);
        ButterKnife.inject(this);
        trends.setOnClickListener(v -> getPresenter().showTrendsFragment());
        wedding.setOnClickListener(v -> getPresenter().showWeddingFragment());
        gift.setOnClickListener(v -> getPresenter().showGiftFragment());
        person.setOnClickListener(v -> getPresenter().showPersonFragment());
    }

    public void showFragment(Fragment fragment) {
        JUtils.Log("fragment:" + fragment.getClass().getName());
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }

}
