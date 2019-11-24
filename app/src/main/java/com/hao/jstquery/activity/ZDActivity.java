package com.hao.jstquery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.ZDAdapter;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.bean.ZDBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 制度查询
 */
public class ZDActivity extends BaseActivity {
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.lay_back)
    LinearLayout layBack;
    @BindView(R.id.zd_recycler)
    RecyclerView zdRecycler;

    @BindView(R.id.home_bottom)
    RelativeLayout homeBottom;
    @Override
    protected void initData() {
        zdRecycler.setLayoutManager(new LinearLayoutManager(this));
        List<ZDBean> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            ZDBean bean = new ZDBean();
            bean.title = "《北京积水潭医院医用耗材管理办法》";
            data.add(bean);
        }
        ZDAdapter adapter = new ZDAdapter(this,data);
        adapter.setOnItemClickListener(new ZDAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                startActivity(new Intent(ZDActivity.this,ZDInfoActivity.class));
            }
        });
        zdRecycler.setAdapter(adapter);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_zd;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.lay_back,R.id.home_bottom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.lay_back:
                finish();
                break;
            case R.id.home_bottom:
                startActivity(new Intent(ZDActivity.this,MainActivity.class));
                finish();
                break;
        }

    }
}
