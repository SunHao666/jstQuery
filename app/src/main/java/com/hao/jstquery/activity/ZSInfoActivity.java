package com.hao.jstquery.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hao.jstquery.R;
import com.hao.jstquery.adapter.ZSAdapter;
import com.hao.jstquery.base.BaseActivity;
import com.hao.jstquery.bean.CKBean;
import com.hao.jstquery.bean.SerializableMap;
import com.hao.jstquery.bean.ZSBean;
import com.hao.jstquery.bean.ZSInfo;
import com.hao.jstquery.bean.ZSValueBean;
import com.hao.jstquery.fragment.CKFragment;
import com.hao.jstquery.network.BaseCallback;
import com.hao.jstquery.network.NetManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 追溯信息
 */
public class ZSInfoActivity extends BaseActivity {
    @BindView(R.id.iv_home)
    ImageView ivHome;
    @BindView(R.id.lay_back)
    LinearLayout layBack;
    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    private List<ZSBean> data = new ArrayList<>();
    private ZSValueBean bean = new ZSValueBean();
    String[] subs = {"唯一码","主码","次码",
            "通用名称","商品名称","规格型号",
            "货号","医疗器械注册证号","生产厂家",
            "生产批号","生产日期","有效日期",
            "采购价格","配送商","配送单号",
            "配送时间","入库单号","入库时间",
            "计费单号","计费时间","患者姓名",
            "住院号","病区名称","手术名称",
            "手术时间"
    };
    private Map<String, Object> map;
    private ZSAdapter adapter;

    @Override
    protected void initData() {
        //2.获取map
        Bundle extras = getIntent().getExtras();
        SerializableMap serializable = (SerializableMap) extras.getSerializable("bundle");
        map = serializable.getMap();
//        request();
        recyclerview.setLayoutManager(new GridLayoutManager(this,2));
        adapter = new ZSAdapter(this,data);
        recyclerview.setAdapter(adapter);
    }

    private void request() {
        //修改bean类型
        NetManager.getInstance().api().listZS(map)
                .enqueue(new BaseCallback<ZSInfo>() {
                    @Override
                    protected void onSuccess(ZSInfo bean) {
                        covert(bean);

                    }

                    @Override
                    protected void onFailed(int code, String msg) {
                        Toast.makeText(ZSInfoActivity.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void covert(ZSInfo bean) {
        List<ZSInfo.ZSListBean> list = bean.getList();
        List<String> values = new ArrayList<>();
//        values.add(list.);
//        values.add( bean.zs2);
//        values.add( bean.zs3);
//        values.add( bean.zs4);
//        values.add( bean.zs5);
//        values.add( bean.zs6);
        for (int i = 0; i < subs.length; i++) {
            data.add(new ZSBean(subs[i],values.get(i)));
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    public int getLayout() {
        return R.layout.activity_zsinfo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.lay_back)
    public void onViewClicked() {

    }
}
