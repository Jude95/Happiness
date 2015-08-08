package com.jude.happiness.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.jude.beam.Beam;
import com.jude.happiness.BuildConfig;
import com.jude.happiness.config.Dir;
import com.jude.http.RequestManager;
import com.jude.utils.JFileManager;
import com.jude.utils.JUtils;

/**
 * Created by zhuchenxi on 15/8/2.
 */
public class APP extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        JUtils.initialize(this);
        JUtils.setDebug(BuildConfig.DEBUG, "DateLog");
        JFileManager.getInstance().init(this, Dir.values());
        Fresco.initialize(this);
        RequestManager.getInstance().init(this);
        RequestManager.getInstance().setDebugMode(BuildConfig.DEBUG, "DateNet");
        Beam.init(this);
    }
}
