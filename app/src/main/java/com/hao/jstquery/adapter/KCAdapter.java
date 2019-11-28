package com.hao.jstquery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.bean.KCBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class KCAdapter extends RecyclerView.Adapter<KCAdapter.ViewHolder> {

    public Context context;
    public List<KCBean.KCListBean> data;



    public KCAdapter(Context context, List<KCBean.KCListBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_kc, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        KCBean.KCListBean bean = data.get(position);
        holder.kcr1.setText(bean.getInnName());//报损单号
        holder.kcr2.setText(bean.getTradeName());//唯一码
        holder.kcr3.setText(bean.getSpecification());//通用名称
        holder.kcr4.setText(bean.getTradeName());//货号

        holder.kcr5.setText(bean.getTradeMark());//规格型号
        holder.kcr6.setText(String.valueOf(bean.getInStorageGroundingAmount()));//一级
        holder.kcr7.setText(String.valueOf(bean.getOutStorageAmount()));//二级
        holder.kcr8.setText(bean.getManufactoryName());//厂商
        holder.kcr9.setText(bean.getSupplyerName());//配送商
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.kcr1)
        TextView kcr1;
        @BindView(R.id.kcr2)
        TextView kcr2;
        @BindView(R.id.kcr3)
        TextView kcr3;
        @BindView(R.id.kcr4)
        TextView kcr4;
        @BindView(R.id.kcr5)
        TextView kcr5;
        @BindView(R.id.kcr6)
        TextView kcr6;
        @BindView(R.id.kcr7)
        TextView kcr7;
        @BindView(R.id.kcr8)
        TextView kcr8;
        @BindView(R.id.kcr9)
        TextView kcr9;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
