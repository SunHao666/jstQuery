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
import com.hao.jstquery.bean.SerializableMap;
import com.hao.jstquery.utils.DataDialog;
import com.hao.jstquery.view.QueryDataView;
import com.hao.jstquery.view.QueryItemScanView;
import com.hao.jstquery.view.QueryItemView;

import java.util.HashMap;
import java.util.Map;

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
    QueryDataView jf8;
    @BindView(R.id.jf9)
    QueryDataView jf9;
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
                SerializableMap map=new SerializableMap();
                map.setMap(getMap());
                Intent intent = new Intent(JFActivity.this,JFInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("bundle", map);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        homeBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        jf8.setOnClickListener(new QueryDataView.OnDataClickListener() {
            @Override
            public void onClick() {
                DataDialog.showtime(JFActivity.this, new DataDialog.DataCallBack() {
                    @Override
                    public void getData(String data) {
                        jf8.setText(data);
                    }
                });
            }
        });

        jf9.setOnClickListener(new QueryDataView.OnDataClickListener() {
            @Override
            public void onClick() {
                DataDialog.showtime(JFActivity.this, new DataDialog.DataCallBack() {
                    @Override
                    public void getData(String data) {
                        jf9.setText(data);
                    }
                });
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

    private Map<String, Object> getMap() {
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("pageNo",1);
        dataMap.put("pageSize",20);
        dataMap.put("usePageNo",jf1.getText().toString());//单号
        dataMap.put("rfid",jf2.getText().toString());//唯一码
        dataMap.put("innName",jf3.getText().toString());//通用名称
        dataMap.put("tradeName",jf4.getText().toString());//商品名称
        dataMap.put("articalNumber",jf5.getText().toString());//货号
        dataMap.put("batchNo",jf6.getText().toString());//生成批号
        dataMap.put("supplierName",jf7.getText().toString());//配送商
        dataMap.put("startDate",jf8.getText().toString());//开始时间
        dataMap.put("endDate",jf9.getText().toString());//结束时间
        return dataMap;
    }
}
