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
import androidx.viewpager.widget.ViewPager;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.QueryInfoAdapter;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.bean.BSBean;
import com.hao.jstquery.fragment.MFragment;
import com.hao.jstquery.network.BaseCallback;
import com.hao.jstquery.network.NetManager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 查询详情
 */
public class QueryInfoActivity extends BaseActivity implements ViewPager.OnPageChangeListener {
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.lay_back)
    LinearLayout layBack;

    @BindView(R.id.home_bottom)
    RelativeLayout homeBottom;
    @BindView(R.id.tv_page)
    TextView tvPage;
    @BindView(R.id.totalitem)
    TextView totalitem;
    private List<Fragment>  data = new ArrayList<>();
    private QueryInfoAdapter adapter;

    @Override
    protected void initData() {
        request();
        adapter = new QueryInfoAdapter(getSupportFragmentManager(), data);
        tvPage.setText("第 " + 1 + " 页");
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(this);
    }

    private void request() {
        NetManager.getInstance().api().listBS()
                .enqueue(new BaseCallback<BSBean>() {
                    @Override
                    protected void onSuccess(BSBean bsBean) {
                        totalitem.setText("共"+bsBean.getTotalRow()+"条");
                        for (int i = 0; i < bsBean.getTotalPage(); i++) {
                            data.add(new MFragment());
                        }
                        adapter.notifyDataSetChanged();
                    }

                    @Override
                    protected void onFailed(int code, String msg) {
                        Toast.makeText(QueryInfoActivity.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @Override
    public int getLayout() {
        return R.layout.activity_queryinfo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }


    @OnClick({R.id.lay_back, R.id.home_bottom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.lay_back:
                finish();
                break;
            case R.id.home_bottom:
                startActivity(new Intent(QueryInfoActivity.this, MainActivity.class));
                finish();
                break;
        }

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        tvPage.setText("第 " + (position + 1) + " 页");
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
