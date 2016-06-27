package com.kangmao.app.ui;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by wangkangmao on 2016/6/26.
 */

public class KmApplication extends Application{

    private static RefWatcher mRefWatcher;
    @Override
    public void onCreate() {
        super.onCreate();
        mRefWatcher = LeakCanary.install(this);
    }
    
    public static RefWatcher getRefWatcher(){
        return mRefWatcher;
    }
}
