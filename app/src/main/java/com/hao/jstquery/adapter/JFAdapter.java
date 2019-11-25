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
    public List<JFBean> data;


    public JFAdapter(Context context, List<JFBean> data) {
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
        holder.jfr1.setText("jfr1" + position);
        holder.jfr2.setText("jfr2" + position);
        holder.jfr3.setText("jfr3" + position);
        holder.jfr4.setText("jfr4" + position);
        holder.jfr5.setText("jfr5" + position);
        holder.jfr6.setText("jfr6" + position);
        holder.jfr7.setText("jfr1" + position);
        holder.jfr8.setText("jfr1" + position);
        holder.jfr9.setText("jfr1" + position);
        holder.jfr10.setText("jfr1" + position);
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

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
