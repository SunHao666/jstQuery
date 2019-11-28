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
import com.hao.jstquery.bean.RKBean;
import com.hao.jstquery.bean.THBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CKAdapter extends RecyclerView.Adapter<CKAdapter.ViewHolder> {

    public Context context;
    public List<CKBean.CKListBean> data;


    public CKAdapter(Context context, List<CKBean.CKListBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_ck, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CKBean.CKListBean bean = data.get(position);
        holder.ckr1.setText(bean.getOutPageNo());//报损单号
        holder.ckr2.setText(bean.getRfid());//唯一码
        holder.ckr3.setText(bean.getInnName());//通用名称
        holder.ckr4.setText(bean.getTradeName());//商品名称
        holder.ckr5.setText(bean.getSpecification());//规格型号
        holder.ckr6.setText(bean.getTradeMark());//品牌
        holder.ckr7.setText(bean.getArticalNumber());//货号
        holder.ckr8.setText(bean.getBatchNo());//生成批号
        holder.ckr9.setText(bean.getSupplierName());//配送商
        holder.ckr10.setText(bean.getOutDate());//报损时间
        holder.ckr11.setText(bean.getOutUserName());//报损人
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
        @BindView(R.id.ckr10)
        TextView ckr10;
        @BindView(R.id.ckr11)
        TextView ckr11;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
