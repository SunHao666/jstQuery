package com.hao.jstquery.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dueeeke.videocontroller.StandardVideoController;
import com.dueeeke.videocontroller.component.CompleteView;
import com.dueeeke.videocontroller.component.ErrorView;
import com.dueeeke.videocontroller.component.GestureView;
import com.dueeeke.videocontroller.component.LiveControlView;
import com.dueeeke.videocontroller.component.PrepareView;
import com.dueeeke.videocontroller.component.TitleView;
import com.dueeeke.videocontroller.component.VodControlView;
import com.dueeeke.videoplayer.player.VideoView;
import com.hao.jstquery.R;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.utils.IntentKeys;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 播放视频
 */
public class VideoInfoActivity extends BaseActivity {
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.lay_back)
    LinearLayout layBack;
    @BindView(R.id.tv_zdtitle)
    TextView tvZdtitle;
    @BindView(R.id.videoview)
    VideoView videoview;

    private static final String THUMB = "https://cms-bucket.nosdn.127.net/eb411c2810f04ffa8aaafc42052b233820180418095416.jpeg";
    private VideoView mVideoView;

    public static void start(Context context, String url, String title, boolean isLive) {
        Intent intent = new Intent(context, VideoInfoActivity.class);
        intent.putExtra(IntentKeys.URL, url);
        intent.putExtra(IntentKeys.IS_LIVE, isLive);
        intent.putExtra(IntentKeys.TITLE, title);
        context.startActivity(intent);
    }

    @Override
    protected void initData() {
        mVideoView = findViewById(R.id.videoview);

        Intent intent = getIntent();
        if (intent != null) {
            StandardVideoController controller = new StandardVideoController(this);
            //根据屏幕方向自动进入/退出全屏
            controller.setEnableOrientation(false);

            PrepareView prepareView = new PrepareView(this);//准备播放界面
            ImageView thumb = prepareView.findViewById(R.id.thumb);//封面图
            Glide.with(this).load(THUMB).into(thumb);
            controller.addControlComponent(prepareView);

            controller.addControlComponent(new CompleteView(this));//自动完成播放界面

            controller.addControlComponent(new ErrorView(this));//错误界面

            TitleView titleView = new TitleView(this);//标题栏
            controller.addControlComponent(titleView);

            //根据是否为直播设置不同的底部控制条
//            boolean isLive = intent.getBooleanExtra(IntentKeys.IS_LIVE, false);
//            if (isLive) {
//                controller.addControlComponent(new LiveControlView(this));//直播控制条
//            } else {
//                VodControlView vodControlView = new VodControlView(this);//点播控制条
//                //是否显示底部进度条。默认显示
////                vodControlView.showBottomProgress(false);
//                controller.addControlComponent(vodControlView);
//            }

            GestureView gestureControlView = new GestureView(this);//滑动控制视图
            controller.addControlComponent(gestureControlView);
            //根据是否为直播决定是否需要滑动调节进度
//            controller.setCanChangePosition(!isLive);

            //设置标题
            String title = intent.getStringExtra(IntentKeys.TITLE);
            titleView.setTitle(title);

            //注意：以上组件如果你想单独定制，我推荐你把源码复制一份出来，然后改成你想要的样子。
            //改完之后再通过addControlComponent添加上去
            //你也可以通过addControlComponent添加一些你自己的组件，具体实现方式参考现有组件的实现。
            //这个组件不一定是View，请发挥你的想象力😃

            //如果你不需要单独配置各个组件，可以直接调用此方法快速添加以上组件
//            controller.addDefaultControlComponent(title, isLive);

            //竖屏也开启手势操作，默认关闭
//            controller.setEnableInNormal(true);
            //适配刘海屏，默认开启
//            controller.setAdaptCutout(false);

            //如果你不想要UI，不要设置控制器即可
            mVideoView.setVideoController(controller);

            mVideoView.setUrl(getIntent().getStringExtra(IntentKeys.URL));

            //保存播放进度
//            mVideoView.setProgressManager(new ProgressManagerImpl());
            //播放状态监听
//            mVideoView.addOnVideoViewStateChangeListener(mOnVideoViewStateChangeListener);

            //临时切换播放核心，如需全局请通过VideoConfig配置，详见MyApplication
            //使用IjkPlayer解码
//            mVideoView.setPlayerFactory(IjkPlayerFactory.create());
            //使用ExoPlayer解码
//            mVideoView.setPlayerFactory(ExoMediaPlayerFactory.create());
            //使用MediaPlayer解码
//            mVideoView.setPlayerFactory(AndroidMediaPlayerFactory.create());

            mVideoView.start();
        }
    }

    @Override
    public int getLayout() {
        return R.layout.activity_videoinfo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mVideoView != null) {
            mVideoView.resume();
        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        if (mVideoView != null) {
            mVideoView.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mVideoView != null) {
            mVideoView.release();
        }
    }

    @Override
    public void onBackPressed() {
        if (mVideoView == null || !mVideoView.onBackPressed()) {
            super.onBackPressed();
        }
    }
}
