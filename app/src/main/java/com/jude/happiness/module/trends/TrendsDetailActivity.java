package com.jude.happiness.module.trends;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.happiness.R;
import com.jude.happiness.app.BaseActivity;
import com.jude.happiness.model.bean.Trends;
import com.jude.happiness.utils.RecentDateFormat;
import com.jude.utils.JTimeTransform;
import com.jude.utils.JUtils;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Mr.Jude on 2015/8/9.
 */
@RequiresPresenter(TrendsDetailPresenter.class)
public class TrendsDetailActivity extends BaseActivity<TrendsDetailPresenter> {
    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    @InjectView(R.id.face)
    SimpleDraweeView face;
    @InjectView(R.id.name)
    TextView name;
    @InjectView(R.id.time)
    TextView time;
    @InjectView(R.id.mainContent)
    TextView mainContent;
    @InjectView(R.id.imageList)
    GridView imageList;
    @InjectView(R.id.praise)
    TextView praise;
    @InjectView(R.id.comment)
    TextView comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trends_activity_detail);
        ButterKnife.inject(this);
    }

    public void setTrends(Trends data){
        face.setImageURI(Uri.parse(data.getAuthorFace()));
        name.setText(data.getAuthorNme());
        time.setText(new JTimeTransform(data.getTime()).toString(new RecentDateFormat()));
        mainContent.setText(data.getContent());
        praise.setText(data.getPraiseCount());
        comment.setText(data.getCommentCount());
        imageList.setAdapter(new NetImageListAdapter(this, data.getImages()));
        imageList.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, JUtils.dip2px(84)*((data.getImages().length-1)/4+1)));
    }
}
