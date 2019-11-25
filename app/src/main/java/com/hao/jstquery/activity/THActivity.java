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
 * 退货查询
 */
public class THActivity extends BaseActivity {
    @BindView(R.id.home_bottom)
    RelativeLayout homeBottom;
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.th1)
    QueryItemScanView th1;
    @BindView(R.id.th2)
    QueryItemScanView th2;
    @BindView(R.id.th3)
    QueryItemView th3;
    @BindView(R.id.th4)
    QueryItemView th4;
    @BindView(R.id.th5)
    QueryItemView th5;
    @BindView(R.id.th6)
    QueryItemView th6;
    @BindView(R.id.th7)
    QueryItemView th7;
    @BindView(R.id.th8)
    QueryItemView th8;
    @BindView(R.id.th9)
    QueryItemView th9;
    @BindView(R.id.th10)
    QueryItemView th10;
    @BindView(R.id.tv_query)
    TextView tvQuery;
    @BindView(R.id.lay_query)
    LinearLayout layQuery;

    @Override
    protected void initData() {

        th1.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {

            }
        });

        th2.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {

            }
        });

        //查询
        layQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(THActivity.this,THInfoActivity.class));
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
        return R.layout.activity_th;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
