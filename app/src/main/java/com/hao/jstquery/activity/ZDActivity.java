package com.hao.jstquery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.QueryInfoAdapter;
import com.hao.jstquery.adapter.ZDAdapter;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.bean.CKBean;
import com.hao.jstquery.bean.ZDBean;
import com.hao.jstquery.fragment.CKFragment;
import com.hao.jstquery.fragment.ZDFragment;
import com.hao.jstquery.network.BaseCallModel;
import com.hao.jstquery.network.BaseCallback;
import com.hao.jstquery.network.NetManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 制度查询
 */
public class ZDActivity extends BaseActivity implements ViewPager.OnPageChangeListener{
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.lay_back)
    LinearLayout layBack;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.tv_page)
    TextView tvPage;
    @BindView(R.id.totalitem)
    TextView totalitem;
    private List<Fragment> data = new ArrayList<>();
    private QueryInfoAdapter adapter;
    private Map<String, Object> map;

    @Override
    protected void initData() {
        map = new HashMap<>();
        map.put("pageNo",1);
        map.put("pageSize",20);

        request(map);
        //4.通用的
        adapter= new QueryInfoAdapter(getSupportFragmentManager(), data);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(this);
        tvPage.setText("第 " + 1 + " 页");
    }

    private void request(Map<String,Object> map) {

        //修改bean类型
        NetManager.getInstance().api().listZD(map)
                .enqueue(new Callback<ZDBean>() {
                    @Override
                    public void onResponse(Call<ZDBean> call, Response<ZDBean> response) {
                        if(response !=null){
                            ZDBean body = response.body();
                            totalitem.setText("共" + body.getData().getTotalRow() + "条");
                            for (int i = 0; i < body.getData().getTotalPage(); i++) {
                                //修改Fragment
                                data.add(new ZDFragment(i + 1, map));
                            }
                            adapter.notifyDataSetChanged();
                        }

                    }

                    @Override
                    public void onFailure(Call<ZDBean> call, Throwable t) {
                        Toast.makeText(ZDActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                });


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
}
