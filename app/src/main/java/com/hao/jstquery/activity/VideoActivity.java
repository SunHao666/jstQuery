package com.hao.jstquery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.hao.jstquery.bean.VideoBean;
import com.hao.jstquery.bean.ZDBean;
import com.hao.jstquery.fragment.VideoFragment;
import com.hao.jstquery.fragment.ZDFragment;
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
 * 医疗视频
 */
public class VideoActivity extends BaseActivity implements ViewPager.OnPageChangeListener{

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
    @BindView(R.id.vp_left)
    ImageButton vpLeft;
    @BindView(R.id.vp_right)
    ImageButton vpRight;
    @BindView(R.id.et_num)
    EditText etNum;
    @BindView(R.id.btn_jump)
    TextView btnJump;
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
        etNum.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(TextUtils.isEmpty(s)){
                    return;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    public int getLayout() {
        return R.layout.activity_video;
    }

    private void request(Map<String,Object> map) {

        //修改bean类型
        NetManager.getInstance().api().listVideo(map)
                .enqueue(new Callback<VideoBean>() {
                    @Override
                    public void onResponse(Call<VideoBean> call, Response<VideoBean> response) {
                        if(response !=null){
                            VideoBean body = response.body();
                            totalitem.setText("共" + body.getData().getTotalRow() + "条");
                            for (int i = 0; i < body.getData().getTotalPage(); i++) {
                                //修改Fragment
                                data.add(new VideoFragment(i + 1, map));
                            }
                            adapter.notifyDataSetChanged();
                            if(data.size()>1){
                                vpRight.setVisibility(View.VISIBLE);
                            }else{
                                vpRight.setVisibility(View.GONE);
                            }
                        }

                    }

                    @Override
                    public void onFailure(Call<VideoBean> call, Throwable t) {
                        Toast.makeText(VideoActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                });


    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        tvPage.setText("第 "+(position+1)+" 页");
        if(position == 0){
            vpLeft.setVisibility(View.GONE);
        }else{
            vpLeft.setVisibility(View.VISIBLE);
        }

        if(position == data.size()-1){
            vpRight.setVisibility(View.GONE);
        }else{
            vpRight.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @OnClick({R.id.lay_back, R.id.home_bottom,R.id.vp_left, R.id.vp_right,R.id.btn_jump})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.lay_back:
                finish();
                break;
            case R.id.home_bottom:
                startActivity(new Intent(VideoActivity.this, MainActivity.class));
                finish();
                break;
            case R.id.vp_left:
                viewPager.arrowScroll(View.FOCUS_LEFT);
                break;
            case R.id.vp_right:
                viewPager.arrowScroll(View.FOCUS_RIGHT);
                break;
            case R.id.btn_jump:
                String nums = etNum.getText().toString();
                viewPager.setCurrentItem(Integer.valueOf(nums)-1);
                break;
        }

    }
}
