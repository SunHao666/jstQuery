package com.hao.jstquery.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.CKAdapter;
import com.hao.jstquery.adapter.RKAdapter;
import com.hao.jstquery.base.BaseFragment;
import com.hao.jstquery.bean.CKBean;
import com.hao.jstquery.bean.RKBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class CKFragment extends BaseFragment {


    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    @Override
    protected void initData() {
        List<CKBean> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            CKBean bean = new CKBean();
            bean.ck1 = "zhang" + i;
            list.add(bean);
        }

        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        CKAdapter adapter = new CKAdapter(getActivity(),list);
        recyclerview.setAdapter(adapter);
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_ckinfo;
    }
}
