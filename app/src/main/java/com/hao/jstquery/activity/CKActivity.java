package com.hao.jstquery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.bean.SerializableMap;
import com.hao.jstquery.utils.DataDialog;
import com.hao.jstquery.view.QueryDataView;
import com.hao.jstquery.view.QueryItemScanView;
import com.hao.jstquery.view.QueryItemView;
import com.king.zxing.CaptureActivity;
import com.king.zxing.Intents;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 出库查询
 */
public class CKActivity extends BaseActivity {

    @BindView(R.id.tv_query)
    TextView tvQuery;
    @BindView(R.id.lay_query)
    LinearLayout layQuery;
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.ck1)
    QueryItemScanView ck1;
    @BindView(R.id.ck2)
    QueryItemScanView ck2;
    @BindView(R.id.ck3)
    QueryItemView ck3;
    @BindView(R.id.ck4)
    QueryItemView ck4;
    @BindView(R.id.ck5)
    QueryItemView ck5;
    @BindView(R.id.ck6)
    QueryItemView ck6;
    @BindView(R.id.ck7)
    QueryItemView ck7;
    @BindView(R.id.ck8)
    QueryDataView ck8;
    @BindView(R.id.ck9)
    QueryDataView ck9;
    @BindView(R.id.home_bottom)
    RelativeLayout homeBottom;

    @Override
    protected void initData() {

        ck1.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
            @Override
            public void onClick() {
                //跳转的默认扫码界面
//                cls = CaptureActivity.class;
//                checkCameraPermissions(1000);
            }
        });

        ck1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (i == KeyEvent.KEYCODE_ENTER) {}
                    return false;
            }
        });
        ck2.setOnScanClickListener(new QueryItemScanView.OnScanClickListener() {
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
                Intent intent = new Intent(CKActivity.this, CKInfoActivity.class);
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

        ck8.setOnClickListener(new QueryDataView.OnDataClickListener() {
            @Override
            public void onClick() {
                DataDialog.showtime(CKActivity.this, new DataDialog.DataCallBack() {
                    @Override
                    public void getData(String data) {
                        ck8.setText(data);
                    }
                });
            }
        });

        ck9.setOnClickListener(new QueryDataView.OnDataClickListener() {
            @Override
            public void onClick() {
                DataDialog.showtime(CKActivity.this, new DataDialog.DataCallBack() {
                    @Override
                    public void getData(String data) {
                        ck9.setText(data);
                    }
                });
            }
        });
    }

    private void showtime() {
        DataDialog.showtime(this, new DataDialog.DataCallBack() {
            @Override
            public void getData(String data) {
                ck8.setText(data);
            }
        });
    }

    @Override
    public int getLayout() {
        return R.layout.activity_ck;
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
        dataMap.put("outPageNo",ck1.getText().toString());//单号
        dataMap.put("rfid",ck2.getText().toString());//唯一码
        dataMap.put("innName",ck3.getText().toString());//通用名称
        dataMap.put("tradeName",ck4.getText().toString());//商品名称
        dataMap.put("articalNumber",ck5.getText().toString());//货号
        dataMap.put("batchNo",ck6.getText().toString());//生成批号
        dataMap.put("supplierName",ck7.getText().toString());//配送商
        dataMap.put("startDate",ck8.getText().toString());//开始时间
        dataMap.put("endDate",ck9.getText().toString());//结束时间
        return dataMap;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data != null){
            String result = data.getStringExtra(Intents.Scan.RESULT);
            switch (requestCode) {
                case 1000:
                    ck1.setText(result);
                    break;
            }
        }

    }



}
