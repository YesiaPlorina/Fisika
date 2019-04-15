package com.yesia.fisikaku.Network;

import com.yesia.fisikaku.Model.ResponseFisika;
import com.yesia.fisikaku.Model.ResponseLogin;
import com.yesia.fisikaku.Model.ResponseRegister;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {


    @FormUrlEncoded
    @POST("register.php/")
    Call<ResponseRegister> registerUser(
            @Field("vsnama") String nama,
            @Field("vsalamat") String alamat,
            @Field("vsnotelp") String notelp,
            @Field("vsjenkel") String jenkel,
            @Field("vsusername") String username,
            @Field("vspassword") String password,
            @Field("vslevel") String level
    );

    @FormUrlEncoded
    @POST("login.php/")
    Call<ResponseLogin> signIn(
            @Field("edtusername") String username,
            @Field("edtpassword") String password,
            @Field("vslevel") String level
    );

    @GET("getfisika.php/")
    Call<ResponseFisika> getDataFisika();
}
