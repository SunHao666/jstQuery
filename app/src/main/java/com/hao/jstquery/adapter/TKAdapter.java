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
import com.hao.jstquery.bean.TKBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TKAdapter extends RecyclerView.Adapter<TKAdapter.ViewHolder> {

    public Context context;
    public List<TKBean> data;


    public TKAdapter(Context context, List<TKBean> data) {
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
        holder.tkr1.setText("tkr1" + position);
        holder.tkr2.setText("tkr2" + position);
        holder.tkr3.setText("tkr3" + position);
        holder.tkr4.setText("tkr4" + position);
        holder.tkr5.setText("tkr5" + position);
        holder.tkr6.setText("tkr6" + position);
        holder.tkr7.setText("tkr1" + position);
        holder.tkr8.setText("tkr1" + position);
        holder.tkr9.setText("tkr1" + position);
        holder.tkr10.setText("tkr1" + position);
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

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
