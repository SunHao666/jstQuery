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
    QueryDataView tk8;
    @BindView(R.id.tk9)
    QueryDataView tk9;
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
                SerializableMap map=new SerializableMap();
                map.setMap(getMap());
                Intent intent = new Intent(TKActivity.this, TKInfoActivity.class);
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

        tk8.setOnClickListener(new QueryDataView.OnDataClickListener() {
            @Override
            public void onClick() {
                DataDialog.showtime(TKActivity.this, new DataDialog.DataCallBack() {
                    @Override
                    public void getData(String data) {
                        tk8.setText(data);
                    }
                });
            }
        });

        tk9.setOnClickListener(new QueryDataView.OnDataClickListener() {
            @Override
            public void onClick() {
                DataDialog.showtime(TKActivity.this, new DataDialog.DataCallBack() {
                    @Override
                    public void getData(String data) {
                        tk9.setText(data);
                    }
                });
            }
        });
    }

    @Override
    public int getLayout() {
        return R.layout.activity_tk;
    }


    private Map<String, Object> getMap() {
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("pageNo",1);
        dataMap.put("pageSize",20);
        dataMap.put("returnStorageNo",tk1.getText().toString());//单号
        dataMap.put("rfid",tk2.getText().toString());//唯一码
        dataMap.put("innName",tk3.getText().toString());//通用名称
        dataMap.put("tradeName",tk4.getText().toString());//商品名称
        dataMap.put("articalNumber",tk5.getText().toString());//货号
        dataMap.put("batchNo",tk6.getText().toString());//生成批号
        dataMap.put("supplierName",tk7.getText().toString());//配送商
        dataMap.put("startDate",tk8.getText().toString());//开始时间
        dataMap.put("endDate",tk9.getText().toString());//结束时间
        return dataMap;
    }
}
