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
 * 计费查询
 */
public class JFActivity extends BaseActivity {
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.jf1)
    QueryItemScanView jf1;
    @BindView(R.id.jf2)
    QueryItemScanView jf2;
    @BindView(R.id.jf3)
    QueryItemView jf3;
    @BindView(R.id.jf4)
    QueryItemView jf4;
    @BindView(R.id.jf5)
    QueryItemView jf5;
    @BindView(R.id.jf6)
    QueryItemView jf6;
    @BindView(R.id.jf7)
    QueryItemView jf7;
    @BindView(R.id.jf8)
    QueryItemView jf8;
    @BindView(R.id.jf9)
    QueryItemView jf9;
    @BindView(R.id.tv_query)
    TextView tvQuery;
    @BindView(R.id.lay_query)
    LinearLayout layQuery;

    @BindView(R.id.home_bottom)
    RelativeLayout homeBottom;

    @Override
    protected void initData() {

        jf1.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {

            }
        });

        jf2.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {

            }
        });
        //查询男
        layQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JFActivity.this,JFInfoActivity.class));
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
        return R.layout.activity_jf;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
