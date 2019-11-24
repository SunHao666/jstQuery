package com.hao.jstquery.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.QueryRecAdapter;
import com.hao.jstquery.base.BaseFragment;
import com.hao.jstquery.bean.BSBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MFragment extends BaseFragment {


    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    @Override
    protected void initData() {
        List<BSBean> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            BSBean bean = new BSBean();
            bean.bs1 = "zhang" + i;
            list.add(bean);
        }

        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        QueryRecAdapter adapter = new QueryRecAdapter(getActivity(),list);
        recyclerview.setAdapter(adapter);
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_info;
    }
}
