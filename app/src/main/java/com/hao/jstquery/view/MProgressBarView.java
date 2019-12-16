package com.hao.jstquery.view;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;

import com.hao.jstquery.R;

/**
 * @ClassName: MProgressBarView
 * @Description: java类作用描述
 * @Author: 作者名
 * @CreateDate: 2019/12/16 17:33
 */
public class MProgressBarView extends Dialog {
    Context context;
    public MProgressBarView(Context context) {
        super(context);
        this.context = context;
        init();
    }

    private void init() {
        View view = LayoutInflater.from(context).inflate(R.layout.mpro,null);
        this.setContentView(view);
        this.setCanceledOnTouchOutside(false);

    }
}
