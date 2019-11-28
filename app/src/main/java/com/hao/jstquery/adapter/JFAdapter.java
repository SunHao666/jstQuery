package com.hao.jstquery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.bean.JFBean;
import com.hao.jstquery.bean.THBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class JFAdapter extends RecyclerView.Adapter<JFAdapter.ViewHolder> {

    public Context context;
    public List<JFBean.JFListBean> data;


    public JFAdapter(Context context, List<JFBean.JFListBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_jf, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        JFBean.JFListBean bean = data.get(position);
        holder.jfr1.setText(bean.getUsePageNo());//报损单号
        holder.jfr2.setText(bean.getPatientName());//唯一码
        holder.jfr3.setText(bean.getPatientName());//通用名称
        holder.jfr4.setText(bean.getTradeName());//商品名称
        holder.jfr5.setText(bean.getSpecification());//规格型号
        holder.jfr6.setText(bean.getTradeMark());//品牌
//        holder.jfr7.setText(bean.getArticalNumber());//货号
        holder.jfr8.setText(bean.getBatchNo());//生成批号
        holder.jfr9.setText(bean.getSupplierName());//配送商
        holder.jfr10.setText(bean.getDate());//报损时间
//        holder.jfr11.setText(bean.getSupplierUser());//报损人
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
        @BindView(R.id.jfr1)
        TextView jfr1;
        @BindView(R.id.jfr2)
        TextView jfr2;
        @BindView(R.id.jfr3)
        TextView jfr3;
        @BindView(R.id.jfr4)
        TextView jfr4;
        @BindView(R.id.jfr5)
        TextView jfr5;
        @BindView(R.id.jfr6)
        TextView jfr6;
        @BindView(R.id.jfr7)
        TextView jfr7;
        @BindView(R.id.jfr8)
        TextView jfr8;
        @BindView(R.id.jfr9)
        TextView jfr9;
        @BindView(R.id.jfr10)
        TextView jfr10;
        @BindView(R.id.jfr11)
        TextView jfr11;
        @BindView(R.id.jfr12)
        TextView jfr12;
        @BindView(R.id.jfr13)
        TextView jfr13;
        @BindView(R.id.jfr14)
        TextView jfr14;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
