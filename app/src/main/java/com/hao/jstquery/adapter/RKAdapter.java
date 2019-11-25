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
import com.hao.jstquery.bean.RKBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RKAdapter extends RecyclerView.Adapter<RKAdapter.ViewHolder> {

    public Context context;
    public List<RKBean> data;
   

    public RKAdapter(Context context, List<RKBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_rk, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.rkr1.setText("rkr1" + position);
        holder.rkr2.setText("rkr2" + position);
        holder.rkr3.setText("rkr3" + position);
        holder.rkr4.setText("rkr4" + position);
        holder.rkr5.setText("rkr5" + position);
        holder.rkr6.setText("rkr6" + position);
        holder.rkr7.setText("rkr1" + position);
        holder.rkr8.setText("rkr1" + position);
        holder.rkr9.setText("rkr1" + position);
        holder.rkr10.setText("rkr1" + position);
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
        @BindView(R.id.rkr1)
        TextView rkr1;
        @BindView(R.id.rkr2)
        TextView rkr2;
        @BindView(R.id.rkr3)
        TextView rkr3;
        @BindView(R.id.rkr4)
        TextView rkr4;
        @BindView(R.id.rkr5)
        TextView rkr5;
        @BindView(R.id.rkr6)
        TextView rkr6;
        @BindView(R.id.rkr7)
        TextView rkr7;
        @BindView(R.id.rkr8)
        TextView rkr8;
        @BindView(R.id.rkr9)
        TextView rkr9;
        @BindView(R.id.rkr10)
        TextView rkr10;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
