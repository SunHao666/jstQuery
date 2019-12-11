package com.hao.jstquery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.QueryInfoAdapter;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.bean.CKBean;
import com.hao.jstquery.bean.SerializableMap;
import com.hao.jstquery.bean.ZZBean;
import com.hao.jstquery.fragment.CKFragment;
import com.hao.jstquery.fragment.ZZFragment;
import com.hao.jstquery.network.BaseCallback;
import com.hao.jstquery.network.NetManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 资质查询信息
 */
public class ZZInfoActivity extends BaseActivity implements ViewPager.OnPageChangeListener{
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.lay_back)
    LinearLayout layBack;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.totalitem)
    TextView totalitem;
    @BindView(R.id.tv_page)
    TextView tvPage;
    private List<Fragment> data = new ArrayList<>();
    private QueryInfoAdapter adapter;
    private Map<String, Object> map;
    @Override
    protected void initData() {
        //2.获取map
        Bundle extras = getIntent().getExtras();
        SerializableMap serializable = (SerializableMap) extras.getSerializable("bundle");
        map = serializable.getMap();
        //3.发送请求
        request(map);
        //4.通用的
        adapter= new QueryInfoAdapter(getSupportFragmentManager(), data);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(this);
        tvPage.setText("第 " + 1 + " 页");
    }

    @Override
    public int getLayout() {
        return R.layout.activity_zzinfo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        tvPage.setText("第 "+(position+1)+" 页");
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @OnClick({R.id.lay_back, R.id.home_bottom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.lay_back:
                finish();
                break;
            case R.id.home_bottom:
                startActivity(new Intent(ZZInfoActivity.this, MainActivity.class));
                finish();
                break;
        }

    }

    private void request(Map<String, Object> map) {

        //修改bean类型
        NetManager.getInstance().api().listZZ(map)
                .enqueue(new BaseCallback<ZZBean>() {
                    @Override
                    protected void onSuccess(ZZBean bean) {
                        totalitem.setText("共" + bean.getTotalRow() + "条");
                        for (int i = 0; i < bean.getTotalPage(); i++) {
                            //修改Fragment
                            data.add(new ZZFragment(i + 1, map));
                        }
                        adapter.notifyDataSetChanged();
                    }

                    @Override
                    protected void onFailed(int code, String msg) {
                        Toast.makeText(ZZInfoActivity.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });
    }
}