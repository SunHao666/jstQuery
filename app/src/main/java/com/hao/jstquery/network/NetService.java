package com.hao.jstquery.network;


import com.hao.jstquery.bean.BSBean;
import com.hao.jstquery.bean.CKBean;
import com.hao.jstquery.bean.IndexBean;
import com.hao.jstquery.bean.JFBean;
import com.hao.jstquery.bean.KCBean;
import com.hao.jstquery.bean.LoginBean;
import com.hao.jstquery.bean.RKBean;
import com.hao.jstquery.bean.THBean;
import com.hao.jstquery.bean.TKBean;
import com.hao.jstquery.bean.VideoBean;
import com.hao.jstquery.bean.ZDBean;
import com.hao.jstquery.bean.ZSBean;
import com.hao.jstquery.bean.ZSInfo;
import com.hao.jstquery.bean.ZZBean;

import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface NetService {
    //报损查询
    @GET("data/reportedLost")
    Call<BaseCallModel<BSBean>> listBS(@QueryMap Map<String,Object> map);
    //退货查询
    @GET("data/returnSupplier")
    Call<BaseCallModel<THBean>> listTH(@QueryMap Map<String,Object> map);

    //退库查询
    @GET("data/returnStorage")
    Call<BaseCallModel<TKBean>> listTK(@QueryMap Map<String,Object> map);

    //库存查询
    @GET("data/storageAmount")
    Call<BaseCallModel<KCBean>> listKC(@QueryMap Map<String,Object> map);

    //计费查询
    @GET("data/usageCharge")
    Call<BaseCallModel<JFBean>> listJF(@QueryMap Map<String,Object> map);

    //追溯查询
    @GET("data/chain")
    Call<BaseCallModel<ZSInfo>> listZS(@QueryMap Map<String,Object> map);

    //入库查询
    @GET("data/inStorage")
    Call<BaseCallModel<RKBean>> listRK(@QueryMap Map<String,Object> map);

    //出库查询
    @GET("data/outStorage")
    Call<BaseCallModel<CKBean>> listCK(@QueryMap Map<String,Object> map);

//    //资质查询-注册证查询
//    @GET("data/registrationCertificate")
//    Call<BaseCallModel<RKBean>> listZZR(@QueryMap Map<String,Object> map);

    //供应商资质查询
    @GET("data/registrationCertificate")
    Call<BaseCallModel<ZZBean>> listZZ(@QueryMap Map<String,Object> map);

    //制度查询
    @GET("data/systemFiles")
    Call<ZDBean> listZD(@QueryMap Map<String,Object> map);
    //制度查询
    @GET("data/medicalWorld")
    Call<VideoBean> listVideo(@QueryMap Map<String,Object> map);

    //资质查询
    @GET("data/getCertFile")
    Call<String> certFile(@QueryMap Map<String,Object> map);

    //登录
    @GET("user/login")
    Call<BaseCallModel<IndexBean>> login(@QueryMap Map<String,Object> map);

    //登录
    @GET("user/logout")
    Call<BaseCallModel<String>> loginout(@QueryMap Map<String,Object> map);


    @GET("index")
    Call<BaseCallModel<IndexBean>> index();
}
