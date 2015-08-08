package com.jude.happiness.module.person;

import android.os.Bundle;

import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.happiness.app.BaseActivity;

/**
 * Created by Mr.Jude on 2015/8/8.
 */
@RequiresPresenter(PersonDetailPresenter.class)
public class PersonDetailActivity extends BaseActivity<PersonDetailPresenter>{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


}
