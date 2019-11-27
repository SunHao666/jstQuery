package com.hao.jstquery.network;


import com.hao.jstquery.bean.BSBean;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface NetService {

    @GET("data/reportedLost")
    Call<BaseCallModel<BSBean>> listBS(@QueryMap Map<String,Object> map);
}
