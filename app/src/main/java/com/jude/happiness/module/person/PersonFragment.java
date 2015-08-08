package com.jude.happiness.module.person;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.beam.nucleus.view.NucleusFragment;
import com.jude.happiness.R;
import com.jude.happiness.model.bean.User;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Mr.Jude on 2015/8/7.
 */
@RequiresPresenter(PersonPresenter.class)
public class PersonFragment extends NucleusFragment<PersonPresenter> {
    @InjectView(R.id.face)
    SimpleDraweeView face;
    @InjectView(R.id.name)
    TextView name;
    @InjectView(R.id.sign)
    TextView sign;
    @InjectView(R.id.head_arrows)
    ImageView headArrows;
    @InjectView(R.id.divider)
    View divider;
    @InjectView(R.id.attention)
    TextView attention;
    @InjectView(R.id.fans)
    TextView fans;
    @InjectView(R.id.view_trends)
    LinearLayout viewTrends;
    @InjectView(R.id.view_gift)
    LinearLayout viewGift;
    @InjectView(R.id.view_address)
    LinearLayout viewAddress;
    @InjectView(R.id.view_feedback)
    LinearLayout viewFeedback;
    @InjectView(R.id.view_out)
    LinearLayout viewOut;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.person_fragment, container, false);
        ButterKnife.inject(this, view);

        return view;
    }

    public void setUser(User user) {
        face.setImageURI(Uri.parse(user.getFace()));
        name.setText(user.getName());
        sign.setText(user.getSign());
        attention.setText(user.getAttentionCount());
        fans.setText(user.getFansCount());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
