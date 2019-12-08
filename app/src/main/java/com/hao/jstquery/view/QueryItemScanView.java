package com.hao.jstquery.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.hao.jstquery.R;

/**
 * 自定义item布局
 */
public class QueryItemScanView extends LinearLayout {

    private Context mContext;
    private String name;
    private EditText et_query;
    private TextView tv_query;
    private ImageButton scan;

    public QueryItemScanView(Context context) {
        this(context,null);
    }

    public QueryItemScanView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initAttrs(attrs);
    }

    private void initAttrs(AttributeSet attrs) {
        TypedArray attributes = mContext.obtainStyledAttributes(attrs, R.styleable.QueryItemScanView);
        name = attributes.getString(R.styleable.QueryItemScanView_title);
        View view = LayoutInflater.from(mContext).inflate(R.layout.view_query_scan_item, this,true);
        et_query = view.findViewById(R.id.et_query);
        tv_query = view.findViewById(R.id.tv_query);
        tv_query.setText(name);
        scan = view.findViewById(R.id.scan);
        scan.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onScanClickListener.onClick();
            }
        });
    }

    public String getText(){
        return et_query.getText().toString().trim();
    }
    public void setText(String text){
        et_query.setText(text);
    }
    //私有属性
    private OnScanClickListener onScanClickListener = null;

    //setter方法
    public void setOnScanClickListener(OnScanClickListener onScanClickListener) {
        this.onScanClickListener = onScanClickListener;
    }

    //回调接口
    public interface OnScanClickListener {
        void onClick();
    }
}
