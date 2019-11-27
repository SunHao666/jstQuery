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
import com.hao.jstquery.bean.SerializableMap;
import com.hao.jstquery.view.QueryItemView;

import java.util.HashMap;
import java.util.Map;

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
                SerializableMap map=new SerializableMap();
                map.setMap(getMap());
                Intent intent = new Intent(Query1Activity.this,QueryInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("bundle", map);
                intent.putExtras(bundle);
                startActivity(intent);
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

                break;
        }
    }

    private Map<String, Object> getMap() {
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("pageNo",1);
        dataMap.put("pageSize",20);
        dataMap.put("reportedLossNo",bs1.getText().toString());
        dataMap.put("rfid",bs2.getText().toString());
        dataMap.put("innName",bs3.getText().toString());
        dataMap.put("tradeName",bs4.getText().toString());
        dataMap.put("articalNumber",bs5.getText().toString());
        dataMap.put("batchNo",bs7.getText().toString());
        dataMap.put("supplierName",bs8.getText().toString());
        dataMap.put("startDate",bs9.getText().toString());
        dataMap.put("endDate",bs10.getText().toString());
        return dataMap;
    }

}
