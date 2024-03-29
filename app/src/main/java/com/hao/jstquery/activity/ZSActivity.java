package com.hao.jstquery.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.bean.SerializableMap;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 追溯查询
 */
public class ZSActivity extends BaseActivity {

    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.lay_center)
    RelativeLayout layCenter;
    @BindView(R.id.tv_left)
    TextView tvLeft;
    @BindView(R.id.tv_right)
    TextView tvRight;
    @BindView(R.id.lay_query)
    LinearLayout layQuery;
    @BindView(R.id.et_wy)
    EditText etWy;
    @BindView(R.id.et_zm)
    EditText etZm;
    @BindView(R.id.et_cm)
    EditText etCm;
    int select = 1;
    @Override
    protected void initData() {
        etWy.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if(keyCode == KeyEvent.KEYCODE_ENTER && keyEvent.getAction()==KeyEvent.ACTION_DOWN){
                    return true;
                }
                return false;
            }
        });
        etZm.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if(keyCode == KeyEvent.KEYCODE_ENTER && keyEvent.getAction()==KeyEvent.ACTION_DOWN){
                    return true;
                }
                return false;
            }
        });

        etCm.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if(keyCode == KeyEvent.KEYCODE_ENTER && keyEvent.getAction()==KeyEvent.ACTION_DOWN){
                    return true;
                }
                return false;
            }
        });
    }

    @Override
    public int getLayout() {
        return R.layout.activity_zs;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_left, R.id.tv_right, R.id.lay_query,R.id.home_bottom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_left:
                tvLeft.setBackgroundResource(R.drawable.left_pressed_shape);
                tvRight.setBackgroundResource(R.drawable.right_press_shape);
                tvLeft.setTextColor(getResources().getColor(R.color.white));
                tvRight.setTextColor(Color.BLACK);
                select = 1;
                break;
            case R.id.tv_right:
                tvLeft.setBackgroundResource(R.drawable.left_press_shape);
                tvRight.setBackgroundResource(R.drawable.right_pressed_shape);
                tvLeft.setTextColor(Color.BLACK);
                tvRight.setTextColor(getResources().getColor(R.color.white));
                select = 2;
                break;
            case R.id.lay_query:
                SerializableMap map = new SerializableMap();
                map.setMap(getMap());
                Intent intent = new Intent(ZSActivity.this, ZSInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("bundle", map);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.home_bottom:
                finish();
                break;
        }
    }

    private Map<String, Object> getMap() {
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("pageNo", 1);
        dataMap.put("pageSize", 20);
        dataMap.put("rfid", etWy.getText().toString());//唯一码
        dataMap.put("firstCode", etZm.getText().toString());//通用名称
        dataMap.put("secondCode", etCm.getText().toString());//商品名称
        dataMap.put("type",select);
        return dataMap;
    }

}
