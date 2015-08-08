package com.jude.happiness.module.main;

import android.support.v4.app.Fragment;

import com.jude.beam.nucleus.manager.Presenter;
import com.jude.happiness.module.gift.GiftFragment;
import com.jude.happiness.module.person.PersonFragment;
import com.jude.happiness.module.trends.TrendsFragment;
import com.jude.happiness.module.wedding.WeddingFragment;

/**
 * Created by Mr.Jude on 2015/8/7.
 */
public class MainPresenter extends Presenter<MainActivity> {
    private Fragment mDateFragment;
    private Fragment mActionFragment;
    private Fragment mMessageFragment;
    private Fragment mUserFragment;

    @Override
    protected void onCreateView(MainActivity view) {
        super.onCreateView(view);
        showTrendsFragment();
    }

    public void showTrendsFragment(){
        if (mDateFragment==null){
            mDateFragment = new TrendsFragment();
        }
        getView().showFragment(mDateFragment);
    }
    public void showWeddingFragment(){
        if (mActionFragment==null){
            mActionFragment = new WeddingFragment();
        }
        getView().showFragment(mActionFragment);
    }
    public void showGiftFragment(){
        if (mMessageFragment==null){
            mMessageFragment = new GiftFragment();
        }
        getView().showFragment(mMessageFragment);
    }
    public void showPersonFragment(){
        if (mUserFragment==null){
            mUserFragment = new PersonFragment();
        }
        getView().showFragment(mUserFragment);
    }

}
