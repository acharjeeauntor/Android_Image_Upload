package com.auntor.imageuploadbyretrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface OurRetrofitClient {

    @POST("retrofit.php")
    @FormUrlEncoded
    Call<ResponseClass> uploadImage(@Field("name") String name,@Field("image") String image);
}
