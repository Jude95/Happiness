package com.jude.happiness.module.person;

import android.net.Uri;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.happiness.R;
import com.jude.happiness.model.bean.User;

import butterknife.ButterKnife;
import butterknife.InjectView;

class PersonBriefViewHolder extends BaseViewHolder<User> {


    @InjectView(R.id.face)
    SimpleDraweeView face;
    @InjectView(R.id.name)
    TextView name;
    @InjectView(R.id.sign)
    TextView sign;

    /**
     * 重载构造方法
     *
     * @param parent
     */
    public PersonBriefViewHolder(ViewGroup parent) {
        super(parent, R.layout.person_item_main);
        ButterKnife.inject(this, itemView);
    }

    @Override
    public void setData(User data) {
        super.setData(data);
        face.setImageURI(Uri.parse(data.getFace()));
        name.setText(data.getName());
        sign.setText(data.getSign());
    }
}
