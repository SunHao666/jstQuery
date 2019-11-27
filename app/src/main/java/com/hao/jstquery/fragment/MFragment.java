package com.hao.jstquery.fragment;

import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.activity.QueryInfoActivity;
import com.hao.jstquery.adapter.QueryRecAdapter;
import com.hao.jstquery.base.BaseFragment;
import com.hao.jstquery.bean.BSBean;
import com.hao.jstquery.network.BaseCallback;
import com.hao.jstquery.network.NetManager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MFragment extends BaseFragment {


    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    private List<BSBean.ListBean> data = new ArrayList<>();
    private QueryRecAdapter adapter;

    @Override
    protected void initData() {
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new QueryRecAdapter(getActivity(),data);
        recyclerview.setAdapter(adapter);
        request();
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_info;
    }

    private void request() {
        NetManager.getInstance().api().listBS()
                .enqueue(new BaseCallback<BSBean>() {
                    @Override
                    protected void onSuccess(BSBean bsBean) {
                        data.addAll(bsBean.getList());
                        adapter.notifyDataSetChanged();
                    }

                    @Override
                    protected void onFailed(int code, String msg) {
                        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
                    }
                });
    }

}
