package com.hao.jstquery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnFileDownloadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;

import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PDFActivity extends BaseActivity {

    @BindView(R.id.pdfView)
    PDFView pdfView;
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.lay_back)
    LinearLayout layBack;
    private String docPath;
    final String SDPath = Environment.getExternalStorageDirectory().getAbsolutePath()+"/PDFViewCache/";
    public String resUrl, file_path;
    @Override
    protected void initData() {
        resUrl = getIntent().getStringExtra("resUrl");
        docPath = resUrl;
        initPdf();
    }

    @Override
    public int getLayout() {
        return R.layout.activity_pdf;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    private void initPdf() {
        pdfView.fromUrl(docPath)
                .enableSwipe(true) // allows to block changing pages using swipe
                .defaultPage(0)
                .onLoad(new OnLoadCompleteListener() {
                    @Override
                    public void loadComplete(int nbPages) {

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


    @OnClick({R.id.lay_back, R.id.home_bottom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.lay_back:
                finish();
                break;
            case R.id.home_bottom:
                startActivity(new Intent(PDFActivity.this, MainActivity.class));
                finish();
                break;
        }

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
