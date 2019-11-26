package com.hao.jstquery.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.ZSAdapter;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.bean.ZSBean;
import com.hao.jstquery.bean.ZSValueBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 追溯信息
 */
public class ZSInfoActivity extends BaseActivity {
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.lay_back)
    LinearLayout layBack;
    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    private List<ZSBean> data = new ArrayList<>();
    private ZSValueBean bean = new ZSValueBean();
    String[] subs = {"通用名称:","商品名称:","规格型号:","医疗器械注册证号;","生产厂家;","生产批号;"};
    @Override
    protected void initData() {
        recyclerview.setLayoutManager(new GridLayoutManager(this,2));
        covert();
        ZSAdapter adapter = new ZSAdapter(this,data);
        recyclerview.setAdapter(adapter);
    }

    private void covert() {
        bean.zs1 = "融合器";
        bean.zs2 = "ewrqrqr";
        bean.zs3 = "234143141";
        bean.zs4 = "23123123123123123123131313";
        bean.zs5 = "23123123123123123123131313";
        bean.zs6 = "23123123123123123123131";
        List<String> values = new ArrayList<>();
        values.add( bean.zs1);
        values.add( bean.zs2);
        values.add( bean.zs3);
        values.add( bean.zs4);
        values.add( bean.zs5);
        values.add( bean.zs6);
        for (int i = 0; i < subs.length; i++) {
            data.add(new ZSBean(subs[i],values.get(i)));
        }
    }

    @Override
    public int getLayout() {
        return R.layout.activity_zsinfo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.lay_back)
    public void onViewClicked() {

    }
}
