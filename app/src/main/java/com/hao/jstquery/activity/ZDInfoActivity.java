package com.hao.jstquery.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnFileDownloadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.view.MProgressBarView;

import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ZDInfoActivity extends BaseActivity {
    @BindView(R.id.lay_back)
    LinearLayout layBack;

    @BindView(R.id.home_bottom)
    RelativeLayout homeBottom;
    public String resUrl, file_path, content, title;
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.tv_zdtitle)
    TextView tvZdtitle;
    @BindView(R.id.pb_bar)
    ProgressBar pbBar;
    @BindView(R.id.remote_pdf_root)
    RelativeLayout remotePdfRoot;
    private String docPath;
    @BindView(R.id.pdfView)
    PDFView pdfView;
    final String SDPath = Environment.getExternalStorageDirectory().getAbsolutePath()+"/PDFViewCache/";

    @Override
    protected void initData() {
        resUrl = getIntent().getStringExtra("resUrl");
        file_path = getIntent().getStringExtra("file_path");
        content = getIntent().getStringExtra("content");
        title = getIntent().getStringExtra("title");

//        mContent.setText(content);
        tvZdtitle.setText(title);
        Log.e("zdinfo", resUrl + file_path);
        docPath = resUrl + file_path;
        initPdf();
    }

    private void initPdf() {
        showLoading();
        pdfView.fromUrl(docPath)
                .enableSwipe(true) // allows to block changing pages using swipe
                .defaultPage(0)
                .onLoad(new OnLoadCompleteListener() {
                    @Override
                    public void loadComplete(int nbPages) {
                        dissLoading();
                    }
                }) // called after document is loaded and starts to be rendered
//                .onPageChange(this)
                .swipeHorizontal(false)
                .enableAntialiasing(true)
                .onFileDownload(new OnFileDownloadCompleteListener() {
                    @Override
                    public void onDownloadComplete(File file) {

                    }
                })
                .loadFromUrl();;
    }


    @Override
    public int getLayout() {
        return R.layout.activity_zdinfo;
    }

    @OnClick({R.id.lay_back, R.id.home_bottom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.lay_back:
                finish();
                break;
            case R.id.home_bottom:
                startActivity(new Intent(ZDInfoActivity.this, MainActivity.class));
                finish();
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {//删除文件  避免引起缓存过大
            File dest = new File(SDPath, file_path);
            if (dest.exists()) {
                dest.delete();
            }
        } catch (Exception e) {

        }
    }

}
