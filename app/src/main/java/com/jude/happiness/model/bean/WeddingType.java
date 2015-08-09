package com.jude.happiness.model.bean;

import android.net.Uri;

/**
 * Created by Mr.Jude on 2015/8/8.
 */
public class WeddingType {
    private String name;
    private Uri image;

    public WeddingType(String name, Uri image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Uri getImage() {
        return image;
    }

    public void setImage(Uri image) {
        this.image = image;
    }
}
