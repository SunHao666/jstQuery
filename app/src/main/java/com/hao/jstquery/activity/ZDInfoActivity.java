package com.hao.jstquery.activity;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class ZDInfoActivity extends BaseActivity {
    @BindView(R.id.lay_back)
    LinearLayout layBack;

    @BindView(R.id.home_bottom)
    RelativeLayout homeBottom;
    @Override
    protected void initData() {

    }

    @Override
    public int getLayout() {
        return R.layout.activity_zdinfo;
    }

    @OnClick({R.id.lay_back,R.id.home_bottom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.lay_back:
                finish();
                break;
            case R.id.home_bottom:
                startActivity(new Intent(ZDInfoActivity.this,MainActivity.class));
                finish();
                break;
        }

    }
}
