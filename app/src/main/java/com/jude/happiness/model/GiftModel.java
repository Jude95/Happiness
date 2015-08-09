package com.jude.happiness.model;

import android.os.Handler;

import com.jude.beam.model.AbsModel;
import com.jude.happiness.model.bean.Gift;
import com.jude.happiness.model.callback.DataCallback;

/**
 * Created by Mr.Jude on 2015/8/9.
 */
public class GiftModel extends AbsModel {
    public static GiftModel getInstance() {
        return getInstance(GiftModel.class);
    }

    public void getGift(int page,DataCallback<Gift[]> callback){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                callback.success("",createVirtualGift(20));
            }
        }, 1000);
    }

    public Gift[] createVirtualGift(int count){
        Gift[] gifts = new Gift[count];
        for (int i = 0; i < gifts.length; i++) {
            gifts[i] = new Gift(i+"","https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3029151206,1632094143&fm=116&gp=0.jpg","璀璨砖石",500,"期盼未来的每一日都是幸福；流线型的轮廓如环抱的双臂，把暖暖的爱融化在钻石的火彩里。");
        }
        return gifts;
    }
}
