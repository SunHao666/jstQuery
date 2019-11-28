package com.hao.jstquery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.bean.RKBean;
import com.hao.jstquery.bean.THBean;
import com.hao.jstquery.bean.TKBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TKAdapter extends RecyclerView.Adapter<TKAdapter.ViewHolder> {

    public Context context;
    public  List<TKBean.TKListBean> data;


    public TKAdapter(Context context, List<TKBean.TKListBean> data) {
        this.context = context;
        this.data = data;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_tk, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TKBean.TKListBean bean = data.get(position);
        holder.tkr1.setText(bean.getReturnStorageNo());//报损单号
        holder.tkr2.setText(bean.getRfid());//唯一码
        holder.tkr3.setText(bean.getInnName());//通用名称
        holder.tkr4.setText(bean.getTradeName());//商品名称
        holder.tkr5.setText(bean.getSpecification());//规格型号
        holder.tkr6.setText(bean.getTradeMark());//品牌
        holder.tkr7.setText(bean.getReturnUserName());//货号
        holder.tkr8.setText(bean.getBatchNo());//生成批号
        holder.tkr9.setText(bean.getSupplyerName());//配送商
        holder.tkr10.setText(bean.getDate());//报损时间
        holder.tkr11.setText(bean.getReturnUserName());//报损人
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
        @BindView(R.id.tkr1)
        TextView tkr1;
        @BindView(R.id.tkr2)
        TextView tkr2;
        @BindView(R.id.tkr3)
        TextView tkr3;
        @BindView(R.id.tkr4)
        TextView tkr4;
        @BindView(R.id.tkr5)
        TextView tkr5;
        @BindView(R.id.tkr6)
        TextView tkr6;
        @BindView(R.id.tkr7)
        TextView tkr7;
        @BindView(R.id.tkr8)
        TextView tkr8;
        @BindView(R.id.tkr9)
        TextView tkr9;
        @BindView(R.id.tkr10)
        TextView tkr10;
        @BindView(R.id.tkr11)
        TextView tkr11;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
