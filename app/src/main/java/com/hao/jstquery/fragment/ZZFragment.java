package com.hao.jstquery.fragment;

import android.content.Intent;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.activity.PDFActivity;
import com.hao.jstquery.adapter.CKAdapter;
import com.hao.jstquery.adapter.ZZAdapter;
import com.hao.jstquery.base.BaseFragment;
import com.hao.jstquery.bean.CKBean;
import com.hao.jstquery.bean.ZZBean;
import com.hao.jstquery.network.BaseCallback;
import com.hao.jstquery.network.NetManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

public class ZZFragment extends BaseFragment {


    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    private int page;
    private Map<String, Object> map;
    //修改对应的
    private ZZAdapter adapter;
    private List<ZZBean.ZZListBean> data = new ArrayList<>();
    public ZZFragment(int i, Map<String, Object> map) {
        super();
        this.page = i;
        this.map = map;
    }

    @Override
    protected void initData() {
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new ZZAdapter(getActivity(),data);
        recyclerview.setAdapter(adapter);
        adapter.setOnImageClickListener(new ZZAdapter.onImageClickListener() {
            @Override
            public void onImageClickListener(int postition) {
                Intent intent = new Intent(getActivity(), PDFActivity.class);
                intent.putExtra("file_path",data.get(postition).getUrl());
                startActivity(intent);
            }
        });
        request();
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_ckinfo;
    }

    private void request() {
        map.put("pageNo",page);
        NetManager.getInstance().api().listZZ(map)
                .enqueue(new BaseCallback<ZZBean>() {
                    @Override
                    protected void onSuccess(ZZBean bean) {
                        data.addAll(bean.getList());
                        adapter.notifyDataSetChanged();
                    }

                    @Override
                    protected void onFailed(int code, String msg) {
                        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
                    }
                });
    }


}
