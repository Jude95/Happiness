package com.jude.happiness.module.trends;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.jude.beam.nucleus.manager.Presenter;
import com.jude.library.imageprovider.ImageProvider;
import com.jude.library.imageprovider.OnImageSelectListener;

/**
 * Created by Mr.Jude on 2015/8/9.
 */
public class TrendsWritePresenter extends Presenter<TrendsWriteActivity> {
    private ImageProvider provider;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        provider = new ImageProvider(getView());
    }

    public void editFace(int style){
        OnImageSelectListener listener = new OnImageSelectListener() {
            @Override
            public void onImageSelect() {
                getView().showProgress("加载中");
            }

            @Override
            public void onImageLoaded(Uri uri) {
                getView().dismissProgress();
                //开始裁剪
                provider.corpImage(uri, 300, 300, new OnImageSelectListener() {
                    @Override
                    public void onImageSelect() {

                    }

                    @Override
                    public void onImageLoaded(Uri uri) {
                        getView().addImageAddedView(uri);
                    }

                    @Override
                    public void onError() {

                    }
                });
            }

            @Override
            public void onError() {
                getView().dismissProgress();
            }
        };
        switch (style){
            case 0:
                provider.getImageFromCamera(listener);
                break;
            case 1:
                provider.getImageFromAlbum(listener);
                break;
            case 2:
                provider.getImageFromNet(listener);
                break;
        }
    }

    @Override
    protected void onResult(int requestCode, int resultCode, Intent data) {
        super.onResult(requestCode, resultCode, data);
        provider.onActivityResult(requestCode, resultCode, data);
    }
}
