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

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class THAdapter extends RecyclerView.Adapter<THAdapter.ViewHolder> {

    public Context context;
    public List<THBean> data;


    public THAdapter(Context context, List<THBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_th, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.thr1.setText("thr1" + position);
        holder.thr2.setText("thr2" + position);
        holder.thr3.setText("thr3" + position);
        holder.thr4.setText("thr4" + position);
        holder.thr5.setText("thr5" + position);
        holder.thr6.setText("thr6" + position);
        holder.thr7.setText("thr1" + position);
        holder.thr8.setText("thr1" + position);
        holder.thr9.setText("thr1" + position);
        holder.thr10.setText("thr1" + position);
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
        @BindView(R.id.thr1)
        TextView thr1;
        @BindView(R.id.thr2)
        TextView thr2;
        @BindView(R.id.thr3)
        TextView thr3;
        @BindView(R.id.thr4)
        TextView thr4;
        @BindView(R.id.thr5)
        TextView thr5;
        @BindView(R.id.thr6)
        TextView thr6;
        @BindView(R.id.thr7)
        TextView thr7;
        @BindView(R.id.thr8)
        TextView thr8;
        @BindView(R.id.thr9)
        TextView thr9;
        @BindView(R.id.thr10)
        TextView thr10;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
