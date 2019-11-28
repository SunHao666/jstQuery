package com.hao.jstquery.fragment;

import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.JFAdapter;
import com.hao.jstquery.adapter.THAdapter;
import com.hao.jstquery.base.BaseFragment;
import com.hao.jstquery.bean.JFBean;
import com.hao.jstquery.bean.THBean;
import com.hao.jstquery.network.BaseCallback;
import com.hao.jstquery.network.NetManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

public class JFFragment extends BaseFragment {


    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    private int page;
    private Map<String, Object> map;
    //修改对应的
    private JFAdapter adapter;
    private List<JFBean.JFListBean> data = new ArrayList<>();
    public JFFragment(int i, Map<String, Object> map) {
        super();
        this.page = i;
        this.map = map;
    }
    @Override
    protected void initData() {
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new JFAdapter(getActivity(),data);
        recyclerview.setAdapter(adapter);
        request();
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_jfinfo;
    }

    private void request() {
        map.put("pageNo",page);
        NetManager.getInstance().api().listJF(map)
                .enqueue(new BaseCallback<JFBean>() {
                    @Override
                    protected void onSuccess(JFBean bean) {
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
