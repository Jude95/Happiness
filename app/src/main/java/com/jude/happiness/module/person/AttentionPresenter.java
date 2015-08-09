package com.jude.happiness.module.person;

import android.os.Bundle;

import com.jude.beam.nucleus.manager.Presenter;
import com.jude.happiness.model.PersonModel;
import com.jude.happiness.model.bean.User;
import com.jude.happiness.model.callback.DataCallback;

/**
 * Created by Mr.Jude on 2015/8/9.
 */
public class AttentionPresenter extends Presenter<AttentionActivity> {

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        PersonModel.getInstance().getAttention(new DataCallback<User[]>() {
            @Override
            public void success(String info, User[] data) {
                getView().setUser(data);
            }
        });
    }
}
