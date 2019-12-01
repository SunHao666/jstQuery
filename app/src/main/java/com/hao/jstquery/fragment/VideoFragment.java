package com.hao.jstquery.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.activity.VideoInfoActivity;
import com.hao.jstquery.activity.ZDInfoActivity;
import com.hao.jstquery.adapter.VideoAdapter;
import com.hao.jstquery.adapter.ZDAdapter;
import com.hao.jstquery.base.BaseFragment;
import com.hao.jstquery.bean.VideoBean;
import com.hao.jstquery.bean.ZDBean;
import com.hao.jstquery.network.NetManager;
import com.hao.jstquery.utils.IntentKeys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VideoFragment extends BaseFragment {


    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    private int page;
    private Map<String, Object> map;
    //修改对应的
    private VideoAdapter adapter;
    private List<VideoBean.DataBean.VideoListBean> data = new ArrayList<>();
    private VideoBean body;

    public VideoFragment(int i, Map<String, Object> map) {
        super();
        this.page = i;
        this.map = map;
    }

    @Override
    protected void initData() {
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new VideoAdapter(getActivity(),data);
        recyclerview.setAdapter(adapter);
        request();
        adapter.setOnItemClickListener(new VideoAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                VideoInfoActivity.start(getActivity(),body.getResUrl()+data.get(position).getFile_path(),data.get(position).getTitle(),false);
            }
        });
    }

    @Override
    public int getLayout() {
            return R.layout.fragment_videoinfo;
    }

    private void request() {
        map.put("pageNo",page);
        //修改bean类型
        NetManager.getInstance().api().listVideo(map)
                .enqueue(new Callback<VideoBean>() {
                    @Override
                    public void onResponse(Call<VideoBean> call, Response<VideoBean> response) {
                        if(response !=null){
                            body = response.body();
                            data.addAll(body.getData().getList());
                            adapter.notifyDataSetChanged();
                        }

                    }

                    @Override
                    public void onFailure(Call<VideoBean> call, Throwable t) {
                        Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                });

    }
}
