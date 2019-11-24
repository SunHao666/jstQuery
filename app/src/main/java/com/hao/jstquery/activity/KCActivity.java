package com.hao.jstquery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.view.QueryItemScanView;
import com.hao.jstquery.view.QueryItemView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class KCActivity extends BaseActivity {
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.kc1)
    QueryItemScanView kc1;
    @BindView(R.id.kc2)
    QueryItemScanView kc2;
    @BindView(R.id.kc3)
    QueryItemView kc3;
    @BindView(R.id.kc4)
    QueryItemView kc4;
    @BindView(R.id.kc5)
    QueryItemView kc5;
    @BindView(R.id.kc6)
    QueryItemView kc6;
    @BindView(R.id.kc7)
    QueryItemView kc7;
    @BindView(R.id.kc8)
    QueryItemView kc8;
    @BindView(R.id.kc9)
    QueryItemView kc9;
    @BindView(R.id.tv_query)
    TextView tvQuery;
    @BindView(R.id.lay_query)
    LinearLayout layQuery;

    @BindView(R.id.home_bottom)
    RelativeLayout homeBottom;

    @Override
    protected void initData() {

        kc1.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {

            }
        });

        kc2.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {

            }
        });
        //查询男
        layQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KCActivity.this,KCInfoActivity.class));
            }
        });

        homeBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public int getLayout() {
        return R.layout.activity_kc;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
