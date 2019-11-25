package com.hao.jstquery.activity;

import android.content.Intent;

import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;

/**
 * 医疗视频
 */
public class VideoActivity extends BaseActivity {


    @Override
    protected void initData() {
        startActivity(new Intent(this,VideoInfoActivity.class));
    }

    @Override
    public int getLayout() {
        return R.layout.activity_video_list;
    }
}
