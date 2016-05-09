package com.iceteck.kubweb;

import android.Manifest;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class WelcomeActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* Enable/disable skip button */
        setSkipEnabled(true);

        /* Enable/disable finish button */
        setFinishEnabled(true);

        addSlide(new SimpleSlide.Builder()
                .title(R.string.post_article)
                .description(R.string.post_description)
                .image(R.drawable.sale)
                .background(R.color.colorPrimary)
                .backgroundDark(android.R.color.background_light)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title(R.string.request_article)
                .description(R.string.request_description)
                .image(R.drawable.purchase)
                .background(R.color.colorPrimary)
                .backgroundDark(android.R.color.background_light)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title(R.string.contact)
                .description(R.string.contact_description)
                .image(R.drawable.contact)
                .background(R.color.colorPrimary)
                .backgroundDark(android.R.color.background_light)
                .build());

        /* Add your own page change listeners */
        addOnPageChangeListener(new ViewPager.OnPageChangeListener(){
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
