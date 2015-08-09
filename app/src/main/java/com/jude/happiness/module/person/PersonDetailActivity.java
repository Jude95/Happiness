package com.jude.happiness.module.person;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.happiness.R;
import com.jude.happiness.app.BaseActivity;
import com.jude.happiness.model.bean.UserDetail;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Mr.Jude on 2015/8/8.
 */
@RequiresPresenter(PersonDetailPresenter.class)
public class PersonDetailActivity extends BaseActivity<PersonDetailPresenter> {
    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    @InjectView(R.id.face)
    SimpleDraweeView face;
    @InjectView(R.id.name)
    TextView name;
    @InjectView(R.id.real_name)
    TextView realName;
    @InjectView(R.id.gender)
    TextView gender;
    @InjectView(R.id.height)
    TextView height;
    @InjectView(R.id.weight)
    TextView weight;
    @InjectView(R.id.hobby)
    TextView hobby;
    @InjectView(R.id.emotion)
    TextView emotion;
    @InjectView(R.id.manifesto)
    TextView manifesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_activity_detail);
        ButterKnife.inject(this);
    }

    public void setUserDetail(UserDetail userDetail){
        face.setImageURI(Uri.parse(userDetail.getFace()));
        name.setText(userDetail.getName());
        realName.setText(userDetail.getRealName());
        gender.setText(userDetail.getGender());
        height.setText(userDetail.getHeight());
        weight.setText(userDetail.getWeight());
        hobby.setText(userDetail.getHobby());
        emotion.setText(userDetail.getEmotion());
        manifesto.setText(userDetail.getManifesto());
    }


}
