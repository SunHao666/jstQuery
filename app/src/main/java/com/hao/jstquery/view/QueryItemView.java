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
public class QueryItemView extends LinearLayout {

    private Context mContext;
    private String name;
    private EditText et_query;
    private TextView tv_query;

    public QueryItemView(Context context) {
        this(context,null);
    }

    public QueryItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initAttrs(attrs);
    }

    private void initAttrs(AttributeSet attrs) {
        TypedArray attributes = mContext.obtainStyledAttributes(attrs, R.styleable.QueryItemView);
        name = attributes.getString(R.styleable.QueryItemView_name);
        View view = LayoutInflater.from(mContext).inflate(R.layout.view_query_item, this,true);
        et_query = view.findViewById(R.id.et_query);
        tv_query = view.findViewById(R.id.tv_query);
        tv_query.setText(name);
    }

    public String getText(){
        return et_query.getText().toString().trim();
    }
}
