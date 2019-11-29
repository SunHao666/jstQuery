package com.hao.jstquery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.bean.CKBean;
import com.hao.jstquery.bean.ZZBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ZZAdapter extends RecyclerView.Adapter<ZZAdapter.ViewHolder> {

    public Context context;
    public List<ZZBean.ZZListBean> data;


    public ZZAdapter(Context context, List<ZZBean.ZZListBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_zz, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ZZBean.ZZListBean bean = data.get(position);
        holder.ckr1.setText(bean.getInnName());//报损单号
        holder.ckr2.setText(bean.getTradeName());//唯一码
        holder.ckr3.setText(bean.getSpecification());//通用名称

        holder.ckr4.setText(bean.getTradeName());//商品名称?
        holder.ckr5.setText(bean.getSpecification());//规格型号?

        holder.ckr6.setText(bean.getSupplierName());//品牌
        holder.ckr7.setText(bean.getEffDate());//货号
        holder.ckr8.setText(bean.getExpDate());//生成批号
        holder.ckr9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(context.getResources().getColor(R.color.white));
        } else {
            holder.itemView.setBackgroundColor(context.getResources().getColor(R.color.gray4));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ckr1)
        TextView ckr1;
        @BindView(R.id.ckr2)
        TextView ckr2;
        @BindView(R.id.ckr3)
        TextView ckr3;
        @BindView(R.id.ckr4)
        TextView ckr4;
        @BindView(R.id.ckr5)
        TextView ckr5;
        @BindView(R.id.ckr6)
        TextView ckr6;
        @BindView(R.id.ckr7)
        TextView ckr7;
        @BindView(R.id.ckr8)
        TextView ckr8;
        @BindView(R.id.ckr9)
        TextView ckr9;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
