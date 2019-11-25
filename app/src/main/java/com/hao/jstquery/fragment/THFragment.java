package com.hao.jstquery.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.RKAdapter;
import com.hao.jstquery.adapter.THAdapter;
import com.hao.jstquery.base.BaseFragment;
import com.hao.jstquery.bean.RKBean;
import com.hao.jstquery.bean.THBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class THFragment extends BaseFragment {


    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    @Override
    protected void initData() {
        List<THBean> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            THBean bean = new THBean();
            bean.th1 = "zhang" + i;
            list.add(bean);
        }

        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        THAdapter adapter = new THAdapter(getActivity(),list);
        recyclerview.setAdapter(adapter);
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_thinfo;
    }
}
