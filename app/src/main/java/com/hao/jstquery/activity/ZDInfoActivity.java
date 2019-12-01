package com.hao.jstquery.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import es.voghdev.pdfviewpager.library.PDFViewPager;
import es.voghdev.pdfviewpager.library.RemotePDFViewPager;
import es.voghdev.pdfviewpager.library.adapter.PDFPagerAdapter;
import es.voghdev.pdfviewpager.library.remote.DownloadFile;
import es.voghdev.pdfviewpager.library.util.FileUtil;

public class ZDInfoActivity extends BaseActivity implements DownloadFile.Listener {
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
    @BindView(R.id.pdfViewPager)
    PDFViewPager pdfViewPager;
    @BindView(R.id.remote_pdf_root)
    RelativeLayout remotePdfRoot;
    private RemotePDFViewPager remotePDFViewPager;
    private PDFPagerAdapter adapter;
    //    @BindView(R.id.pdfView)
//    PDFView pdfView;
//    @BindView(R.id.content)
//    TextView mContent;

    @Override
    protected void initData() {
        resUrl = getIntent().getStringExtra("resUrl");
        file_path = getIntent().getStringExtra("file_path");
        content = getIntent().getStringExtra("content");
        title = getIntent().getStringExtra("title");

//        mContent.setText(content);
        tvZdtitle.setText(title);
        Uri uri = Uri.parse(resUrl + file_path);
        Log.e("zdinfo", resUrl + file_path);
        setDownloadListener(resUrl + file_path);
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

    /*设置监听*/
    protected void setDownloadListener(String mUrl) {
        final DownloadFile.Listener listener = this;
        remotePDFViewPager = new RemotePDFViewPager(this, mUrl, listener);
        remotePDFViewPager.setId(R.id.pdfViewPager);
    }

    @Override
    public void onSuccess(String url, String destinationPath) {
        pbBar.setVisibility(View.GONE);
        adapter = new PDFPagerAdapter(this, FileUtil.extractFileNameFromURL(url));
        remotePDFViewPager.setAdapter(adapter);
        updateLayout();
    }

    /*更新视图*/
    private void updateLayout() {

        remotePdfRoot.removeAllViewsInLayout();
        remotePdfRoot.addView(remotePDFViewPager, LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
    }

    @Override
    public void onFailure(Exception e) {
        pbBar.setVisibility(View.GONE);
        Toast.makeText(this,"数据加载错误",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onProgressUpdate(int progress, int total) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(adapter != null){
            adapter.close();
        }
    }
}
