package com.kangmao.app.test;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangkangmao on 2016/6/26.
 */

public class ActivityMgr {

    private static ActivityMgr sInstance = new ActivityMgr();
    List<Activity> activities = new ArrayList<>();

    private ActivityMgr(){

    }

    // 得到单例
    public static ActivityMgr getInstance(){
        return sInstance;
    }

    // 往栈里面增加Activity
    public void addActivity(Activity activity){
        activities.add(activity);
    }
    // 往栈里面移除Activity
    public void removeActivity(Activity activity){
        activities.remove(activity);
    }
}
