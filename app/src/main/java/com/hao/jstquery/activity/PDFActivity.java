package com.hao.jstquery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnFileDownloadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.network.Contant;
import com.mingle.widget.LoadingView;

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
    @BindView(R.id.imageview)
    ImageView imageview;
    @BindView(R.id.probar)
    ProgressBar probar;
    private String docPath;
    final String SDPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/PDFViewCache/";
    public String resUrl, file_path;
    private String file_path1;

    @Override
    protected void initData() {

        resUrl = getIntent().getStringExtra("resUrl");
        docPath = Contant.BASEURL + "data/getCertFile?file=" + resUrl;
        file_path1 = "getCertFile?file="+resUrl;
        Log.e("tag",docPath);
        if (TextUtils.isEmpty(resUrl)) {
            return;
        }
        if (resUrl.endsWith(".pdf")) {
//            probar.setVisibility(View.VISIBLE);
            imageview.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);
            initPdf();

        } else if (resUrl.endsWith(".png") || resUrl.endsWith(".jpg")) {
            imageview.setVisibility(View.VISIBLE);
            pdfView.setVisibility(View.GONE);
            Glide.with(this).load(docPath).into(imageview);
        }


//        initUrl();

    }

    private void initUrl() {


//        Map<String, Object> map = new HashMap<>();
//        try {
//            Log.e("tag",resUrl);
//            String encode = URLEncoder.encode(resUrl, "UTF-8");
//            Log.e("tag","encode="+encode);
//            map.put("file", encode);
//
//            NetManager.getInstance().api().certFile(map).enqueue(new Callback<String>() {
//                @Override
//                public void onResponse(Call<String> call, Response<String> response) {
//                    Log.e("tag", response.body().toString());
//                }
//
//                @Override
//                public void onFailure(Call<String> call, Throwable t) {
//
//                }
//            });
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }

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
//                        probar.setVisibility(View.GONE);
                    }
                }) // called after document is loaded and starts to be rendered
//                .onPageChange(this)
                .swipeHorizontal(false)
                .enableAntialiasing(true)
                .onFileDownload(new OnFileDownloadCompleteListener() {
                    @Override
                    public void onDownloadComplete(File file) {
//                        probar.setVisibility(View.GONE);
                    }
                })
                .loadFromUrl();

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
            File dest = new File(SDPath, file_path1);
            if (dest.exists()) {
                dest.delete();
            }
        } catch (Exception e) {

        }
    }
}
