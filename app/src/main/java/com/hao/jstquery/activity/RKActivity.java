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

/**
 * 入库查询
 */
public class RKActivity extends BaseActivity {
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.rk1)
    QueryItemScanView rk1;
    @BindView(R.id.rk2)
    QueryItemScanView rk2;
    @BindView(R.id.rk3)
    QueryItemView rk3;
    @BindView(R.id.rk4)
    QueryItemView rk4;
    @BindView(R.id.rk5)
    QueryItemView rk5;
    @BindView(R.id.rk6)
    QueryItemView rk6;
    @BindView(R.id.rk7)
    QueryItemView rk7;
    @BindView(R.id.rk8)
    QueryItemView rk8;
    @BindView(R.id.rk9)
    QueryItemView rk9;
    @BindView(R.id.rk10)
    QueryItemView rk10;
    @BindView(R.id.tv_query)
    TextView tvQuery;
    @BindView(R.id.lay_query)
    LinearLayout layQuery;
    @BindView(R.id.home_bottom)
    RelativeLayout homeBottom;
    @Override
    protected void initData() {

        rk1.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {

            }
        });

        rk2.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {

            }
        });

        //查询
        layQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RKActivity.this,RKInfoActivity.class));
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
        return R.layout.activity_rk;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
