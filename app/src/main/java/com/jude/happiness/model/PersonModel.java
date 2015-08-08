package com.jude.happiness.model;

import com.jude.beam.model.AbsModel;
import com.jude.happiness.model.bean.User;

/**
 * Created by Mr.Jude on 2015/8/8.
 */
public class PersonModel extends AbsModel {

    public static PersonModel getInstance() {
        return getInstance(PersonModel.class);
    }

    public User getUser(){
        return createVirtualUser();
    }

    private User createVirtualUser(){
        return new User(
                "http://i1.hdslb.com/account/face/398510/1826cee5/myface.png",
                "帝姬冥月",
                "相爱就要在一起",
                "12","25");
    }
}
