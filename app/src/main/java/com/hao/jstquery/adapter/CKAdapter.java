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

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CKAdapter extends RecyclerView.Adapter<CKAdapter.ViewHolder> {

    public Context context;
    public List<CKBean> data;


    public CKAdapter(Context context, List<CKBean> data) {
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
        holder.ckr1.setText("ckr1" + position);
        holder.ckr2.setText("ckr2" + position);
        holder.ckr3.setText("ckr3" + position);
        holder.ckr4.setText("ckr4" + position);
        holder.ckr5.setText("ckr5" + position);
        holder.ckr6.setText("ckr6" + position);
        holder.ckr7.setText("ckr1" + position);
        holder.ckr8.setText("ckr1" + position);
        holder.ckr9.setText("ckr1" + position);
        holder.ckr10.setText("ckr1" + position);
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

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
