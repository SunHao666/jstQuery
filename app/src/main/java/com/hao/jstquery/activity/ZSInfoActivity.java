package com.hao.jstquery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        request();
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
        if(list == null || list.size() ==0){
            Toast.makeText(this,"暂无数据",Toast.LENGTH_SHORT).show();
            return;
        }
        data.add(new ZSBean(subs[0],list.get(0).getRfid()));
        data.add(new ZSBean(subs[1],list.get(0).getFirstCode()));
        data.add(new ZSBean(subs[2],list.get(0).getSecondCode()));
        data.add(new ZSBean(subs[3],list.get(0).getInnName()));
        data.add(new ZSBean(subs[4],list.get(0).getTradeName()));
        data.add(new ZSBean(subs[5],list.get(0).getSpecification()));
        data.add(new ZSBean(subs[6],list.get(0).getArticalNumber()));
        data.add(new ZSBean(subs[7],list.get(0).getDrugSerialNo()));

        data.add(new ZSBean(subs[8],list.get(0).getManufacturerName()));
        data.add(new ZSBean(subs[9],list.get(0).getBatchNo()));
        data.add(new ZSBean(subs[10],list.get(0).getProductDate()));
        data.add(new ZSBean(subs[11],list.get(0).getEffDate()));
        data.add(new ZSBean(subs[12],list.get(0).getPurchasePrice()+""));
        data.add(new ZSBean(subs[13],list.get(0).getSupplierCode()));

//        data.add(new ZSBean(subs[14],list.get(0).getSupplierCode()));//配送单号
//        data.add(new ZSBean(subs[15],list.get(0).getSupplierCode()));//shijian
        data.add(new ZSBean(subs[16],list.get(0).getInStorageNo()));
        data.add(new ZSBean(subs[17],list.get(0).getInStorageDate()));
        data.add(new ZSBean(subs[18],list.get(0).getChargeNo()));
        data.add(new ZSBean(subs[19],list.get(0).getChargeDate()));
        data.add(new ZSBean(subs[20],list.get(0).getPatientName()));


        data.add(new ZSBean(subs[20],list.get(0).getAdmNo()));
//        data.add(new ZSBean(subs[20],list.get(0).getPatientName()));//病区名称
        data.add(new ZSBean(subs[20],list.get(0).getSurgicalOperation()));
//        data.add(new ZSBean(subs[20],list.get(0).getSur()));//手术时间
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


    @OnClick({R.id.lay_back, R.id.home_bottom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.lay_back:
                finish();
                break;
            case R.id.home_bottom:
                startActivity(new Intent(ZSInfoActivity.this, MainActivity.class));
                finish();
                break;
        }

    }
}
