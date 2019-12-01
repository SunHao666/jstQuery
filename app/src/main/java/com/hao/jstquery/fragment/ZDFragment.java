package com.hao.jstquery.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.activity.ZDActivity;
import com.hao.jstquery.activity.ZDInfoActivity;
import com.hao.jstquery.adapter.CKAdapter;
import com.hao.jstquery.adapter.ZDAdapter;
import com.hao.jstquery.base.BaseFragment;
import com.hao.jstquery.bean.CKBean;
import com.hao.jstquery.bean.ZDBean;
import com.hao.jstquery.network.BaseCallback;
import com.hao.jstquery.network.NetManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ZDFragment extends BaseFragment {


    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    private int page;
    private Map<String, Object> map;
    //修改对应的
    private ZDAdapter adapter;
    private List<ZDBean.DataBean.ZDListBean> data = new ArrayList<>();
    private ZDBean body;

    public ZDFragment(int i, Map<String, Object> map) {
        super();
        this.page = i;
        this.map = map;
    }

    @Override
    protected void initData() {
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new ZDAdapter(getActivity(),data);
        recyclerview.setAdapter(adapter);
        request();
        adapter.setOnItemClickListener(new ZDAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Intent intent = new Intent(getActivity(),ZDInfoActivity.class);
                intent.putExtra("resUrl",body.getResUrl());
                intent.putExtra("file_path",data.get(position).getFile_path());
                intent.putExtra("content",data.get(position).getContent());
                intent.putExtra("title",data.get(position).getTitle());
                startActivity(intent);
            }
        });
    }

    @Override
        public int getLayout() {
            return R.layout.fragment_zdinfo;
    }

    private void request() {
        map.put("pageNo",page);
        //修改bean类型
        NetManager.getInstance().api().listZD(map)
                .enqueue(new Callback<ZDBean>() {
                    @Override
                    public void onResponse(Call<ZDBean> call, Response<ZDBean> response) {
                        if(response !=null){
                            body = response.body();
                            data.addAll(body.getData().getList());
                            adapter.notifyDataSetChanged();
                        }

                    }

                    @Override
                    public void onFailure(Call<ZDBean> call, Throwable t) {
                        Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                });

    }
}
