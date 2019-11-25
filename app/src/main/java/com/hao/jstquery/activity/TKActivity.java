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
 * 退库查询
 */
public class TKActivity extends BaseActivity {

    @BindView(R.id.home_bottom)
    RelativeLayout homeBottom;
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.tk1)
    QueryItemScanView tk1;
    @BindView(R.id.tk2)
    QueryItemScanView tk2;
    @BindView(R.id.tk3)
    QueryItemView tk3;
    @BindView(R.id.tk4)
    QueryItemView tk4;
    @BindView(R.id.tk5)
    QueryItemView tk5;
    @BindView(R.id.tk6)
    QueryItemView tk6;
    @BindView(R.id.tk7)
    QueryItemView tk7;
    @BindView(R.id.tk8)
    QueryItemView tk8;
    @BindView(R.id.tk9)
    QueryItemView tk9;
    @BindView(R.id.tk10)
    QueryItemView tk10;
    @BindView(R.id.tv_query)
    TextView tvQuery;
    @BindView(R.id.lay_query)
    LinearLayout layQuery;

    @Override
    protected void initData() {

        tk1.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {

            }
        });

        tk2.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {

            }
        });

        //查询
        layQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TKActivity.this, TKInfoActivity.class));
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
        return R.layout.activity_tk;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
