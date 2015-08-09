package com.jude.happiness.module.trends;

import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;

import com.afollestad.materialdialogs.MaterialDialog;
import com.jude.beam.nucleus.factory.RequiresPresenter;
import com.jude.happiness.R;
import com.jude.happiness.app.BaseActivity;
import com.jude.happiness.utils.AddedView.AddImagePieceView;
import com.jude.happiness.utils.AddedView.ImagePieceView;
import com.jude.happiness.utils.AddedView.PieceView;
import com.jude.happiness.utils.AddedView.PieceViewGroup;
import com.jude.utils.JUtils;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Mr.Jude on 2015/8/9.
 */
@RequiresPresenter(TrendsWritePresenter.class)
public class TrendsWriteActivity extends BaseActivity<TrendsWritePresenter> {

    @InjectView(R.id.content)
    EditText content;
    @InjectView(R.id.imageviewgroup)
    PieceViewGroup imageviewgroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trends_activity_write);
        ButterKnife.inject(this);
        imageviewgroup.addEnder(initAddImageView());
    }

    private PieceView initAddImageView(){
        PieceView imgAdd = new AddImagePieceView(this);
        imgAdd.setOnClickListener(v -> showImageSelector());
        return imgAdd;
    }

    public ImagePieceView addImageAddedView(Uri uri){
        ImagePieceView view = new ImagePieceView(this);
        view.setImage(uri);
        imageviewgroup.add(view);
        JUtils.Log("Count:" + imageviewgroup.getCount());
        return view;
    }

    private void showImageSelector(){
        new MaterialDialog.Builder(this)
                .title("选择图片来源")
                .items(new String[]{"拍照","相册","网络"})
                .itemsCallback((materialDialog, view, i, charSequence) -> getPresenter().editFace(i)).show();
    }

    @Override
    public void onBackPressed() {
        if (imageviewgroup.isInEditMode()){
            imageviewgroup.finishEdit();
            return;
        }
        super.onBackPressed();
    }
}
