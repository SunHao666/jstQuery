package com.hao.jstquery.activity;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;

import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn1)
    ImageButton btn1;
    @BindView(R.id.btn2)
    ImageButton btn2;
    @BindView(R.id.btn3)
    ImageButton btn3;
    @BindView(R.id.btn4)
    ImageButton btn4;
    @BindView(R.id.btn5)
    ImageButton btn5;
    @BindView(R.id.btn6)
    ImageButton btn6;
    @BindView(R.id.btn7)
    ImageButton btn7;
    @BindView(R.id.btn8)
    ImageButton btn8;
    @BindView(R.id.btn9)
    ImageButton btn9;
    @BindView(R.id.btn10)
    ImageButton btn10;
    @BindView(R.id.btn11)
    ImageButton btn11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initData() {

    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9, R.id.btn10, R.id.btn11})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(this, ZDActivity.class));
                break;
            case R.id.btn2://报损查询
                startActivity(new Intent(this, Query1Activity.class));
                break;
            case R.id.btn3://入库查询
                break;
            case R.id.btn4://退货查询
                break;
            case R.id.btn5://出库查询
                break;
            case R.id.btn6://退库查询
                break;
            case R.id.btn7://库存查询
                startActivity(new Intent(this, KCActivity.class));
                break;
            case R.id.btn8://计费查询
                break;
            case R.id.btn9://追溯查询
                break;
            case R.id.btn10://资质查询、

                break;
            case R.id.btn11:
                break;
        }
    }
}
