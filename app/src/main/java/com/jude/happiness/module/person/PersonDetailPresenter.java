package com.jude.happiness.module.person;

import android.os.Bundle;

import com.jude.beam.nucleus.manager.Presenter;
import com.jude.happiness.model.PersonModel;

/**
 * Created by Mr.Jude on 2015/8/8.
 */
public class PersonDetailPresenter extends Presenter<PersonDetailActivity> {

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
    }

    @Override
    protected void onCreateView(PersonDetailActivity view) {
        super.onCreateView(view);
        getView().setUserDetail(PersonModel.getInstance().getUserDetail());
    }
}
