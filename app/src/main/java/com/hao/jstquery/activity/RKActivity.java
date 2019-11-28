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
 * 入库查询
 */
public class RKActivity extends BaseActivity {
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.rk1)
    QueryItemScanView rk1;
    @BindView(R.id.rk2)
    QueryItemScanView rk2;
    @BindView(R.id.rk3)
    QueryItemView rk3;
    @BindView(R.id.rk4)
    QueryItemView rk4;
    @BindView(R.id.rk5)
    QueryItemView rk5;
    @BindView(R.id.rk6)
    QueryItemView rk6;
    @BindView(R.id.rk7)
    QueryItemView rk7;
    @BindView(R.id.rk8)
    QueryDataView rk8;
    @BindView(R.id.rk9)
    QueryDataView rk9;
    @BindView(R.id.tv_query)
    TextView tvQuery;
    @BindView(R.id.lay_query)
    LinearLayout layQuery;
    @BindView(R.id.home_bottom)
    RelativeLayout homeBottom;
    @Override
    protected void initData() {

        rk1.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {

            }
        });

        rk2.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
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
                Intent intent = new Intent(RKActivity.this,RKInfoActivity.class);
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

        rk8.setOnClickListener(new QueryDataView.OnDataClickListener() {
            @Override
            public void onClick() {
                DataDialog.showtime(RKActivity.this, new DataDialog.DataCallBack() {
                    @Override
                    public void getData(String data) {
                        rk8.setText(data);
                    }
                });
            }
        });

        rk9.setOnClickListener(new QueryDataView.OnDataClickListener() {
            @Override
            public void onClick() {
                DataDialog.showtime(RKActivity.this, new DataDialog.DataCallBack() {
                    @Override
                    public void getData(String data) {
                        rk9.setText(data);
                    }
                });
            }
        });
    }

    @Override
    public int getLayout() {
        return R.layout.activity_rk;
    }


    private Map<String, Object> getMap() {
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("pageNo",1);
        dataMap.put("pageSize",20);
        dataMap.put("inPageNo",rk1.getText().toString());//单号
        dataMap.put("rfid",rk2.getText().toString());//唯一码
        dataMap.put("innName",rk3.getText().toString());//通用名称
        dataMap.put("tradeName",rk4.getText().toString());//商品名称
        dataMap.put("articalNumber",rk5.getText().toString());//货号
        dataMap.put("batchNo",rk6.getText().toString());//生成批号
        dataMap.put("supplierName",rk7.getText().toString());//配送商
        dataMap.put("startDate",rk8.getText().toString());//开始时间
        dataMap.put("endDate",rk9.getText().toString());//结束时间
        return dataMap;
    }
    
}
