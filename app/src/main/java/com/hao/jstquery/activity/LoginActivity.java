package com.hao.jstquery.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.bean.IndexBean;
import com.hao.jstquery.bean.LoginBean;
import com.hao.jstquery.network.BaseCallback;
import com.hao.jstquery.network.NetManager;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.lay_center)
    RelativeLayout layCenter;
    @BindView(R.id.lay_login)
    LinearLayout layLogin;
    @BindView(R.id.et_account)
    EditText etAccount;
    @BindView(R.id.et_pwd)
    EditText etPwd;

    @BindView(R.id.lay_login1)
    LinearLayout layLogin1;
    private String encode;

    @Override
    protected void initData() {
        findViewById(R.id.home_bottom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.lay_login1)
    public void onViewClicked() {
        if(!checkNull()){
            return;
        }
//            byte[] bytes = etPwd.getText().toString().trim().getBytes("UTF-8");
//            encode = Base64.encodeToString(bytes, Base64.DEFAULT);

             encode = new String(Base64.encode(etPwd.getText().toString().getBytes(), Base64.DEFAULT)).trim();    // 结果为"MTIzNDU2"
        showLoading();
        Map<String,Object> map = new HashMap<>();
        map.put("userName",etAccount.getText().toString().trim());
        map.put("password",encode);
        NetManager.getInstance().api().login(map).enqueue(new BaseCallback<IndexBean>() {
            @Override
            protected void onSuccess(IndexBean s) {
                dissLoading();
                finish();
            }

            @Override
            protected void onFailed(int code, String msg) {
                dissLoading();
                Toast.makeText(LoginActivity.this,msg,Toast.LENGTH_SHORT).show();
            }
        });

    }

    private boolean checkNull() {
        if(TextUtils.isEmpty(etAccount.getText().toString())){
            Toast.makeText(this,"用户名不能为空",Toast.LENGTH_SHORT).show();
            return false;
        }else if(TextUtils.isEmpty(etPwd.getText().toString())){
            Toast.makeText(this,"密码不能为空",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
