package com.hao.jstquery.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.hao.jstquery.R;

/**
 * 自定义item布局
 */
public class QueryDataView extends LinearLayout {

    private Context mContext;
    private String data;
    private TextView tv_data;
    private TextView tv_query;

    public QueryDataView(Context context) {
        this(context,null);
    }

    public QueryDataView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initAttrs(attrs);
    }

    private void initAttrs(AttributeSet attrs) {
        TypedArray attributes = mContext.obtainStyledAttributes(attrs, R.styleable.QueryDataView);
        data = attributes.getString(R.styleable.QueryDataView_data);
        View view = LayoutInflater.from(mContext).inflate(R.layout.view_query_date, this,true);
        tv_data = view.findViewById(R.id.tv_data);
        tv_query = view.findViewById(R.id.tv_query);
        tv_query.setText(data);

        tv_data.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onClick();
            }
        });
    }

    public String getText(){
        return tv_data.getText().toString().trim();
    }

    public void setText(String data){
        tv_data.setText(data);
    }
    //私有属性
    private OnDataClickListener onClickListener = null;

    //setter方法
    public void setOnClickListener(OnDataClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    //回调接口
    public interface OnDataClickListener {
        void onClick();
    }
}
