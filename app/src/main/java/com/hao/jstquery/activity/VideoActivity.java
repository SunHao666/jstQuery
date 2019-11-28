package com.hao.jstquery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.ZDAdapter;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.bean.ZDBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 医疗视频
 */
public class VideoActivity extends BaseActivity {


    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.lay_back)
    LinearLayout layBack;
    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    private static final String VOD_URL = "http://vfx.mtime.cn/Video/2019/03/18/mp4/190318231014076505.mp4";
    @Override
    protected void initData() {

        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        List<ZDBean> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            ZDBean bean = new ZDBean();
            bean.title = "《北京积水潭医院医用耗材管理办法》";
            data.add(bean);
        }
        ZDAdapter adapter = new ZDAdapter(this,data);
        adapter.setOnItemClickListener(new ZDAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                VideoInfoActivity.start(VideoActivity.this,VOD_URL,"测试",false);
            }
        });
        recyclerview.setAdapter(adapter);

    }

    @Override
    public int getLayout() {
        return R.layout.activity_video_list;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
