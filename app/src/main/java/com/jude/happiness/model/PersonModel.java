package com.jude.happiness.model;

import android.os.Handler;

import com.jude.beam.model.AbsModel;
import com.jude.happiness.model.bean.User;
import com.jude.happiness.model.bean.UserDetail;
import com.jude.happiness.model.callback.DataCallback;
import com.jude.utils.JUtils;

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

    public UserDetail getUserDetail(){
        return createVirtualUserDetail();
    }

    public void getAttention(DataCallback<User[]> callback){
        JUtils.Log("begin");
        new Handler().postDelayed(() -> callback.success("",createVirtualUsers(10)), 1000);

    }

    private User createVirtualUser(){
        return new User(
                "http://i1.hdslb.com/user/31956/3195605/myface.jpg",
                "帝姬冥月",
                "相爱就要在一起",
                "12","25");
    }

    private User[] createVirtualUsers(int count){
        User[] users = new User[count];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(
                    "http://i1.hdslb.com/user/31956/3195605/myface.jpg",
                    "帝姬冥月",
                    "相爱就要在一起",
                    "12","25");
        }
        return users;
    }


    private UserDetail createVirtualUserDetail(){
        return new UserDetail(
                "帝姬冥月",
                "http://i1.hdslb.com/user/31956/3195605/myface.jpg",
                "吴紫琪",
                "女",
                "172cm",
                "47kg",
                "吃货,运动狂魔",
                "已婚",
                "女人么，在一起要是不八卦这些事情，那才是怪事儿。东拉西扯是女人的天性。");
    }
}
