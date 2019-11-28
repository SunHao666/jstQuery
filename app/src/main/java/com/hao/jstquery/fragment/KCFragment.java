package com.hao.jstquery.fragment;

import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.KCAdapter;
import com.hao.jstquery.adapter.QueryRecAdapter;
import com.hao.jstquery.adapter.THAdapter;
import com.hao.jstquery.base.BaseFragment;
import com.hao.jstquery.bean.BSBean;
import com.hao.jstquery.bean.KCBean;
import com.hao.jstquery.bean.THBean;
import com.hao.jstquery.network.BaseCallback;
import com.hao.jstquery.network.NetManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

public class KCFragment extends BaseFragment {


    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    private int page;
    private Map<String, Object> map;
    //修改对应的
    private KCAdapter adapter;
    private List<KCBean.KCListBean> data = new ArrayList<>();
    public KCFragment(int i, Map<String, Object> map) {
        super();
        this.page = i;
        this.map = map;
    }

    @Override
    protected void initData() {
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new KCAdapter(getActivity(),data);
        recyclerview.setAdapter(adapter);
        request();

    }

    @Override
    public int getLayout() {
        return R.layout.fragment_kcinfo;
    }

    private void request() {
        map.put("pageNo",page);
        NetManager.getInstance().api().listKC(map)
                .enqueue(new BaseCallback<KCBean>() {
                    @Override
                    protected void onSuccess(KCBean bean) {
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
