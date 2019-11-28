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
import com.hao.jstquery.view.QueryItemScanView;
import com.hao.jstquery.view.QueryItemView;

import java.util.HashMap;
import java.util.Map;

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
                SerializableMap map=new SerializableMap();
                map.setMap(getMap());
                Intent intent = new Intent(THActivity.this,THInfoActivity.class);
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
    private Map<String, Object> getMap() {
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("pageNo",1);
        dataMap.put("pageSize",20);
        dataMap.put("returnSupplierNo",th1.getText().toString());//单号
        dataMap.put("rfid",th2.getText().toString());//唯一码
        dataMap.put("innName",th3.getText().toString());//通用名称
        dataMap.put("tradeName",th4.getText().toString());//商品名称
        dataMap.put("articalNumber",th5.getText().toString());//货号
        dataMap.put("batchNo",th6.getText().toString());//生成批号
        dataMap.put("supplierName",th7.getText().toString());//配送商
        dataMap.put("startDate",th8.getText().toString());//开始时间
        dataMap.put("endDate",th9.getText().toString());//结束时间
        return dataMap;
    }
}
