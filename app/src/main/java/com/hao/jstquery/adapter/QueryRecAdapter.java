package com.hao.jstquery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.bean.BSBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QueryRecAdapter extends RecyclerView.Adapter<QueryRecAdapter.ViewHolder> {

    public Context context;
    public List<BSBean.ListBean> data;

    public QueryRecAdapter(Context context, List<BSBean.ListBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_rec, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BSBean.ListBean bean = data.get(position);
        holder.bsr1.setText(bean.getReportedLossNo());//报损单号
        holder.bsr2.setText(bean.getRfid());//唯一码
        holder.bsr3.setText(bean.getInnName());//通用名称
        holder.bsr4.setText(bean.getTradeName());//商品名称
        holder.bsr5.setText(bean.getSpecification());//规格型号
        holder.bsr6.setText(bean.getTradeMark());//品牌
        holder.bsr7.setText(bean.getArticalNumber());//货号
        holder.bsr8.setText(bean.getBatchNo());//生成批号
        holder.bsr9.setText(bean.getSupplierName());//配送商
        holder.bsr10.setText(bean.getDate());//报损时间
        holder.bsr11.setText(bean.getUserName());//报损人
        if(position%2 == 0){
            holder.itemView.setBackgroundColor(context.getResources().getColor(R.color.white));
        }else{
            holder.itemView.setBackgroundColor(context.getResources().getColor(R.color.gray4));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.bsr1)
        TextView bsr1;
        @BindView(R.id.bsr2)
        TextView bsr2;
        @BindView(R.id.bsr3)
        TextView bsr3;
        @BindView(R.id.bsr4)
        TextView bsr4;
        @BindView(R.id.bsr5)
        TextView bsr5;
        @BindView(R.id.bsr6)
        TextView bsr6;
        @BindView(R.id.bsr7)
        TextView bsr7;
        @BindView(R.id.bsr8)
        TextView bsr8;
        @BindView(R.id.bsr9)
        TextView bsr9;
        @BindView(R.id.bsr10)
        TextView bsr10;
        @BindView(R.id.bsr11)
        TextView bsr11;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
