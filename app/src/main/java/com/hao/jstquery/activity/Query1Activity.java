package com.hao.jstquery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.view.QueryItemView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Query1Activity extends BaseActivity {
    @BindView(R.id.home_bottom)
    RelativeLayout homeBottom;
    @BindView(R.id.bs1)
    QueryItemView bs1;
    @BindView(R.id.bs2)
    QueryItemView bs2;
    @BindView(R.id.bs3)
    QueryItemView bs3;
    @BindView(R.id.bs4)
    QueryItemView bs4;
    @BindView(R.id.bs5)
    QueryItemView bs5;
    @BindView(R.id.bs6)
    QueryItemView bs6;
    @BindView(R.id.bs7)
    QueryItemView bs7;
    @BindView(R.id.bs8)
    QueryItemView bs8;
    @BindView(R.id.bs9)
    QueryItemView bs9;
    @BindView(R.id.bs10)
    QueryItemView bs10;
    @BindView(R.id.tv_query)
    TextView tvQuery;
    @BindView(R.id.lay_query)
    LinearLayout layQuery;


    @Override
    protected void initData() {
        layQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Query1Activity.this,QueryInfoActivity.class));
            }
        });
    }

    @Override
    public int getLayout() {
        return R.layout.query1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @OnClick({R.id.home_bottom, R.id.et_query})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.home_bottom:
                startActivity(new Intent(this,MainActivity.class));
                finish();
                break;
            case R.id.lay_query:
                Log.e("tag","1111");
                checkInput();
                startActivity(new Intent(this,QueryInfoActivity.class));
                break;
        }
    }

    private void checkInput() {
        if(TextUtils.isEmpty(bs1.getText())
        && TextUtils.isEmpty(bs2.getText())
                && TextUtils.isEmpty(bs3.getText())
                && TextUtils.isEmpty(bs4.getText())
                && TextUtils.isEmpty(bs5.getText())
                && TextUtils.isEmpty(bs6.getText())
                && TextUtils.isEmpty(bs7.getText())
                && TextUtils.isEmpty(bs8.getText())
                && TextUtils.isEmpty(bs9.getText())
                && TextUtils.isEmpty(bs10.getText())
        ){

        }
    }
}
