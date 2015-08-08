package com.jude.happiness.model;

import android.content.Context;
import android.os.Handler;

import com.jude.beam.model.AbsModel;
import com.jude.happiness.model.bean.Trends;
import com.jude.happiness.model.callback.DataCallback;

/**
 * Created by Mr.Jude on 2015/8/8.
 */
public class TrendsModel extends AbsModel {
    public static TrendsModel getInstance() {
        return getInstance(TrendsModel.class);
    }
    @Override
    protected void onAppCreate(Context ctx) {
        super.onAppCreate(ctx);
    }

    public void getTrends(int page ,DataCallback<Trends[]> callback){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                callback.success("",createVirtualTrends(10));
            }
        }, 1000);
    }

    public Trends[] createVirtualTrends(int Count){
        Trends[] trendses = new Trends[Count];
        for (int i = 0; i < trendses.length; i++) {
            trendses[i] = new Trends(
                    "http://i2.hdslb.com/user/1124/112428/myface.jpg",
                    "夏日的一缕清风",
                    "一天，荔枝小姐在宿舍听舍友聊W先生，说是深沉的不得了，人赠外号深沉小王子。于是无意加了QQ，W先生电脑挂着QQ，临时出去办事，室友一看验证消息，是远近闻名的系花，于是和代替W勾搭荔枝，字里行间污言秽语，荔枝一看，怎么这人啊，渣男一枚，鉴定完毕后，想直接拉黑。",
                    1439040229
                    ,new String[]{
                            "http://img1.imgtn.bdimg.com/it/u=4058524767,2016092084&fm=21&gp=0.jpg",
                            "http://img0.imgtn.bdimg.com/it/u=1076196100,481453982&fm=21&gp=0.jpg",
                            "http://img1.imgtn.bdimg.com/it/u=3201006459,3183206078&fm=21&gp=0.jpg",
                            "http://img1.imgtn.bdimg.com/it/u=1511737169,16120538&fm=21&gp=0.jpg",
                            "http://img4.imgtn.bdimg.com/it/u=1614680555,2523749735&fm=21&gp=0.jpg"
                    },
                    "15","23",false
            );
        }
        return trendses;
    }
}
