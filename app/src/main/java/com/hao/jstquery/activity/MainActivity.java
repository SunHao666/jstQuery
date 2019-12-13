package com.hao.jstquery.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Network;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.bean.IndexBean;
import com.hao.jstquery.bean.LoginBean;
import com.hao.jstquery.bean.UserBean;
import com.hao.jstquery.network.BaseCallback;
import com.hao.jstquery.network.NetManager;
import com.hao.jstquery.utils.APPUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    private List<String> auth = new ArrayList<>();
    private UserBean user;
    private String name;

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
        request();
    }

    private void request() {
        NetManager.getInstance().api().index().enqueue(new BaseCallback<IndexBean>() {
            @Override
            protected void onSuccess(IndexBean indexBean) {

                user = indexBean.getUser();
                if(user == null){
                    loginOut();
                }else{
                    loginIn();
                    name = user.getUser_name();
                }
                List<String> auths = indexBean.getAuths();
                auth.clear();
                if(auths != null && auths.size()>0){
                    auth.addAll(auths);
                }
            }

            @Override
            protected void onFailed(int code, String msg) {
                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void loginIn() {
        tvName.setVisibility(View.VISIBLE);
        btnLogout.setVisibility(View.VISIBLE);
        tvName.setText(name);
    }

    private void loginOut() {
        tvName.setVisibility(View.GONE);
        btnLogout.setVisibility(View.GONE);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main_new;
    }

    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9, R.id.btn10, R.id.btn11})
    public void onViewClicked(View view) {

        switch (view.getId()) {
            case R.id.btn1:
                if(auth.contains("/data/systemFiles")){
                    startActivity(new Intent(this, ZDActivity.class));
                }else {
                    showDialog();
                }
                break;
            case R.id.btn2://报损查询1
                if(auth.contains("/data/reportedLost")){
                    startActivity(new Intent(this, Query1Activity.class));
                }else {
                    showDialog();
                }
                break;
            case R.id.btn3://入库查询1
                if(auth.contains("/data/inStorage")){
                    startActivity(new Intent(this, RKActivity.class));
                }else {
                    showDialog();
                }
                break;
            case R.id.btn4://退货查询1
                if(auth.contains("/data/returnSupplier")){
                    startActivity(new Intent(this, THActivity.class));
                }else {
                    showDialog();
                }

                break;
            case R.id.btn5://出库查询1
                if(auth.contains("/data/outStorage")){
                    startActivity(new Intent(this, CKActivity.class));
                }else {
                    showDialog();
                }

                break;
            case R.id.btn6://退库查询1
                if(auth.contains("/data/returnStorage")){
                    startActivity(new Intent(this, TKActivity.class));
                }else {
                    showDialog();
                }

                break;
            case R.id.btn7://库存查询1
                if(auth.contains("/data/storageAmount")){
                    startActivity(new Intent(this, KCActivity.class));
                }else {
                    showDialog();
                }

                break;
            case R.id.btn8://计费查询
                if(auth.contains("/data/usageCharge")){
                    startActivity(new Intent(this, JFActivity.class));
                }else {
                    showDialog();
                }

                break;
            case R.id.btn9://追溯查询
                if(auth.contains("/data/chain")){
                    startActivity(new Intent(this, ZSActivity.class));
                }else {
                    showDialog();
                }

                break;
            case R.id.btn10://资质查询、
                if(auth.contains("/data/getCertFile")){
                    startActivity(new Intent(this, ZZActivity.class));
                }else {
                    showDialog();
                }

                break;
            case R.id.btn11:
                if(auth.contains("/data/medicalWorld")){
                    startActivity(new Intent(this, VideoActivity.class));
                }else {
                    showDialog();
                }

                break;
        }
    }


    @OnClick(R.id.btn_logout)
    public void onViewClicked() {

        Map<String,Object> map = new HashMap<>();
        NetManager.getInstance().api().loginout(map).enqueue(new BaseCallback<String>() {
            @Override
            protected void onSuccess(String s) {

                tvName.setVisibility(View.GONE);
                btnLogout.setVisibility(View.GONE);
                request();
                Toast.makeText(MainActivity.this,"用户已退出",Toast.LENGTH_SHORT).show();
            }

            @Override
            protected void onFailed(int code, String msg) {
                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void showDialog(){
        AlertDialog builder = new AlertDialog.Builder(this)
                .setTitle("提醒")
                .setMessage("暂无访问权限")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(user == null){
                            startActivity(new Intent(MainActivity.this,LoginActivity.class));
                        }
                        dialog.dismiss();
                    }
                }).create();

        builder.show();
    }
}
