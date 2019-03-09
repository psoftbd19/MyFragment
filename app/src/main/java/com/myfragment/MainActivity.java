package com.myfragment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager=(ViewPager)findViewById(R.id.mainPager);
         adapter=new ViewPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);

    }

    public void goFirst(View view) {
        pager.setCurrentItem(0);
    }

    public void goThird(View view) {
        pager.setCurrentItem(1);    }

    public void goTwo(View view) {
        pager.setCurrentItem(2);    }
}
