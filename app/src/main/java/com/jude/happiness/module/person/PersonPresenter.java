package com.jude.happiness.module.person;

import com.jude.beam.nucleus.manager.Presenter;
import com.jude.happiness.model.PersonModel;

/**
 * Created by Mr.Jude on 2015/8/7.
 */
public class PersonPresenter extends Presenter<PersonFragment> {

    @Override
    protected void onCreateView(PersonFragment view) {
        super.onCreateView(view);
        getView().setUser(PersonModel.getInstance().getUser());
    }
}
