package com.jude.happiness.module.gift;

import android.net.Uri;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.happiness.R;
import com.jude.happiness.model.bean.Gift;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Mr.Jude on 2015/8/9.
 */
public class GiftViewHolder extends BaseViewHolder<Gift> {
    @InjectView(R.id.image)
    SimpleDraweeView image;
    @InjectView(R.id.name)
    TextView name;
    @InjectView(R.id.cost)
    TextView cost;
    @InjectView(R.id.exchange)
    Button exchange;
    @InjectView(R.id.intro)
    TextView intro;

    public GiftViewHolder(ViewGroup parent) {
        super(parent, R.layout.gift_item_main);
        ButterKnife.inject(this,itemView);
    }

    @Override
    public void setData(Gift data) {
        image.setImageURI(Uri.parse(data.getImage()));
        name.setText(data.getName());
        cost.setText("幸福币:"+data.getCost()+"个");
        intro.setText(data.getIntro());
    }
}
