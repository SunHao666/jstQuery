package com.hao.jstquery.network;

import com.hao.jstquery.bean.BSBean;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NetService {

    @GET("data/reportedLost")
    Call<BaseCallModel<BSBean>> listBS();
}
