package com.hao.jstquery.fragment;

import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.RKAdapter;
import com.hao.jstquery.adapter.THAdapter;
import com.hao.jstquery.adapter.TKAdapter;
import com.hao.jstquery.base.BaseFragment;
import com.hao.jstquery.bean.RKBean;
import com.hao.jstquery.bean.THBean;
import com.hao.jstquery.bean.TKBean;
import com.hao.jstquery.network.BaseCallback;
import com.hao.jstquery.network.NetManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

public class TKFragment extends BaseFragment {


    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    private int page;
    private Map<String, Object> map;
    private TKAdapter adapter;
    private List<TKBean.TKListBean> data = new ArrayList<>();
    public TKFragment(int i, Map<String, Object> map) {
        super();
        this.page = i;
        this.map = map;
    }
    @Override
    protected void initData() {

        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new TKAdapter(getActivity(),data);
        recyclerview.setAdapter(adapter);
        request();
    }

    //修改
    @Override
    public int getLayout() {
        return R.layout.fragment_tkinfo;
    }
    private void request() {
        map.put("pageNo",page);
        NetManager.getInstance().api().listTK(map)
                .enqueue(new BaseCallback<TKBean>() {
                    @Override
                    protected void onSuccess(TKBean bean) {
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
