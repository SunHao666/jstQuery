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
 * 出库查询
 */
public class CKActivity extends BaseActivity {

    @BindView(R.id.tv_query)
    TextView tvQuery;
    @BindView(R.id.lay_query)
    LinearLayout layQuery;
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.ck1)
    QueryItemScanView ck1;
    @BindView(R.id.ck2)
    QueryItemScanView ck2;
    @BindView(R.id.ck3)
    QueryItemView ck3;
    @BindView(R.id.ck4)
    QueryItemView ck4;
    @BindView(R.id.ck5)
    QueryItemView ck5;
    @BindView(R.id.ck6)
    QueryItemView ck6;
    @BindView(R.id.ck7)
    QueryItemView ck7;
    @BindView(R.id.ck8)
    QueryItemView ck8;
    @BindView(R.id.ck9)
    QueryItemView ck9;
    @BindView(R.id.ck10)
    QueryItemView ck10;
    @BindView(R.id.home_bottom)
    RelativeLayout homeBottom;

    @Override
    protected void initData() {

        ck1.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {

            }
        });

        ck2.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {

            }
        });

        //查询
        layQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CKActivity.this, CKInfoActivity.class));
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
        return R.layout.activity_ck;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
