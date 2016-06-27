package com.kangmao.app.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.kangmao.app.R;
import com.kangmao.app.adapter.ViewPagerAdapter;
import com.kangmao.app.ui.fragment.ChildFragment;
import com.kangmao.app.widget.NavitationLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private NavitationLayout navitationLayout;
    private ViewPager viewPager;
    private String[] titles = new String[]{"标题一", "标题二", "标题三"};
    private ViewPagerAdapter viewPagerAdapter;
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        navitationLayout = (NavitationLayout) findViewById(R.id.bar);
        fragments = new ArrayList<>();
        fragments.add(new ChildFragment());
        fragments.add(new ChildFragment());
        fragments.add(new ChildFragment());
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(viewPagerAdapter);


//        navitationLayout.setViewPager(this, titles, viewPager, R.color.color_333333, R.color.color_2581ff, 16, 16, 0, 0, true);
//        navitationLayout.setNavLine(this, 3, R.color.colorPrimary, 0);

//        navitationLayout.setViewPager(this, titles, viewPager, R.color.color_333333, R.color.color_2581ff, 16, 16, 0, 0, true);
//        navitationLayout.setBgLine(this, 1, R.color.colorAccent);
//        navitationLayout.setNavLine(this, 3, R.color.colorPrimary, 0);
//
//        navitationLayout.setViewPager(this, titles, viewPager, R.color.color_333333, R.color.color_2581ff, 16, 16, 0, 12, true);
//        navitationLayout.setBgLine(this, 1, R.color.colorAccent);
//        navitationLayout.setNavLine(this, 3, R.color.colorPrimary, 0);

        navitationLayout.setViewPager(this, titles, viewPager, R.color.color_333333, R.color.color_2581ff, 14, 18, 0, 12, true);
        navitationLayout.setBgLine(this, 1, R.color.colorAccent);
        navitationLayout.setNavLine(this, 3, R.color.colorPrimary, 0);

        navitationLayout.setOnTitleClickListener(new NavitationLayout.OnTitleClickListener() {
            @Override
            public void onTitleClick(View v) {
                Toast.makeText(MainActivity.this, ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
        });

        navitationLayout.setOnNaPageChangeListener(new NavitationLayout.OnNaPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }


}
