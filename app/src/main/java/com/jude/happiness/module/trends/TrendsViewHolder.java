package com.jude.happiness.module.trends;

import android.net.Uri;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.happiness.R;
import com.jude.happiness.model.bean.Trends;
import com.jude.happiness.utils.RecentDateFormat;
import com.jude.utils.JTimeTransform;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Mr.Jude on 2015/8/8.
 */
public class TrendsViewHolder extends BaseViewHolder<Trends> {
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

    public TrendsViewHolder(ViewGroup parent) {
        super(parent, R.layout.trends_item_main);
        ButterKnife.inject(this,itemView);
    }

    @Override
    public void setData(Trends data) {
        face.setImageURI(Uri.parse(data.getAuthorFace()));
        name.setText(data.getAuthorNme());
        time.setText(new JTimeTransform(data.getTime()).toString(new RecentDateFormat()));
        mainContent.setText(data.getContent());
        praise.setText(data.getPraiseCount());
        comment.setText(data.getCommentCount());
        imageList.setAdapter(new NetImageListAdapter(itemView.getContext(),data.getImages()));
    }

}
