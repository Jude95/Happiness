package com.jude.happiness.model;

import com.jude.beam.model.AbsModel;
import com.jude.happiness.R;
import com.jude.happiness.model.bean.WeddingType;
import com.jude.utils.JUtils;

/**
 * Created by Mr.Jude on 2015/8/8.
 */
public class WeddingModel extends AbsModel {

    public static WeddingModel getInstance() {
        return getInstance(WeddingModel.class);
    }

    public WeddingType[] getWeddingType(){
        return new WeddingType[]{
                new WeddingType("中式", JUtils.getUriFromRes(R.drawable.wed_sty_cha)),
                new WeddingType("草坪", JUtils.getUriFromRes(R.drawable.wed_sty_gra)),
                new WeddingType("沙滩", JUtils.getUriFromRes(R.drawable.wed_sty_bea)),
                new WeddingType("酒店", JUtils.getUriFromRes(R.drawable.wed_sty_hot)),
                new WeddingType("罗马", JUtils.getUriFromRes(R.drawable.wed_sty_roma)),
                new WeddingType("教堂", JUtils.getUriFromRes(R.drawable.wed_sty_ch)),
        };
    }

}
