package com.hao.jstquery.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.bean.LoginBean;
import com.hao.jstquery.network.BaseCallback;
import com.hao.jstquery.network.NetManager;
import com.hao.jstquery.utils.APPUtils;

import java.util.HashMap;
import java.util.Map;

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
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.btn_logout)
    TextView btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!APPUtils.isLogin(this)) {
            tvName.setVisibility(View.VISIBLE);
            btnLogout.setVisibility(View.VISIBLE);
            tvName.setText(APPUtils.getName(this));
        }else {
            tvName.setVisibility(View.GONE);
            btnLogout.setVisibility(View.GONE);
        }
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main_new;
    }

    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9, R.id.btn10, R.id.btn11})
    public void onViewClicked(View view) {
        if (!APPUtils.isLogin(this)) {
            if (view.getId() != R.id.btn1 && view.getId() != R.id.btn7 && view.getId() != R.id.btn11) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                return;
            }
        }


        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(this, ZDActivity.class));
                break;
            case R.id.btn2://报损查询1
                startActivity(new Intent(this, Query1Activity.class));
                break;
            case R.id.btn3://入库查询1
                startActivity(new Intent(this, RKActivity.class));
                break;
            case R.id.btn4://退货查询1
                startActivity(new Intent(this, THActivity.class));
                break;
            case R.id.btn5://出库查询1
                startActivity(new Intent(this, CKActivity.class));
                break;
            case R.id.btn6://退库查询1
                startActivity(new Intent(this, TKActivity.class));
                break;
            case R.id.btn7://库存查询1
                startActivity(new Intent(this, KCActivity.class));
                break;
            case R.id.btn8://计费查询
                startActivity(new Intent(this, JFActivity.class));
                break;
            case R.id.btn9://追溯查询
                startActivity(new Intent(this, ZSActivity.class));
                break;
            case R.id.btn10://资质查询、
                startActivity(new Intent(this, ZZActivity.class));
                break;
            case R.id.btn11:
                startActivity(new Intent(this, VideoActivity.class));
                break;
        }
    }

    @OnClick(R.id.btn_logout)
    public void onViewClicked() {

        Map<String,Object> map = new HashMap<>();
        NetManager.getInstance().api().login(map).enqueue(new BaseCallback<LoginBean>() {
            @Override
            protected void onSuccess(LoginBean s) {
                SharedPreferences sp = getSharedPreferences("jst",MODE_PRIVATE);
                SharedPreferences.Editor edit = sp.edit();
                edit.putBoolean("isLogin",false);
                edit.putString("userName","");
                edit.commit();

                tvName.setVisibility(View.GONE);
                btnLogout.setVisibility(View.GONE);
            }

            @Override
            protected void onFailed(int code, String msg) {
                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
