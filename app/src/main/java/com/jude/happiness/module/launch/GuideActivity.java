package com.jude.happiness.module.launch;

import android.os.Bundle;

import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.happiness.app.BaseActivity;

/**
 * Created by Mr.Jude on 2015/8/9.
 */
@RequiresPresenter(GuidePresenter.class)
public class GuideActivity extends BaseActivity<GuidePresenter> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
