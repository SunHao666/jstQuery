package com.hao.jstquery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.KCInfoAdapter;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.fragment.RKFragment;
import com.hao.jstquery.fragment.TKFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 退库信息
 */
public class TKInfoActivity extends BaseActivity implements ViewPager.OnPageChangeListener{
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.lay_back)
    LinearLayout layBack;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.tv_page)
    TextView tvPage;

    @Override
    protected void initData() {
        List<Fragment> data = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            data.add(new TKFragment());
        }
        KCInfoAdapter adapter = new KCInfoAdapter(getSupportFragmentManager(), data);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(this);
        tvPage.setText("第 "+1+" 页");
    }

    @Override
    public int getLayout() {
        return R.layout.activity_ckinfo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        tvPage.setText("第 "+(position+1)+" 页");
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @OnClick({R.id.lay_back, R.id.home_bottom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.lay_back:
                finish();
                break;
            case R.id.home_bottom:
                startActivity(new Intent(TKInfoActivity.this, MainActivity.class));
                finish();
                break;
        }

    }
}