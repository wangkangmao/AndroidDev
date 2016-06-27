package com.kangmao.app.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.kangmao.app.R;
import com.kangmao.app.test.ActivityMgr;

public class LeakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak);
        ActivityMgr.getInstance().addActivity(this);
    }
}
