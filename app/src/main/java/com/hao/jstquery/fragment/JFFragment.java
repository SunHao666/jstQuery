package com.hao.jstquery.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.JFAdapter;
import com.hao.jstquery.adapter.THAdapter;
import com.hao.jstquery.base.BaseFragment;
import com.hao.jstquery.bean.JFBean;
import com.hao.jstquery.bean.THBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class JFFragment extends BaseFragment {


    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    @Override
    protected void initData() {
        List<JFBean> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            JFBean bean = new JFBean();
            bean.jf1 = "zhang" + i;
            list.add(bean);
        }

        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        JFAdapter adapter = new JFAdapter(getActivity(),list);
        recyclerview.setAdapter(adapter);
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_jfinfo;
    }
}
