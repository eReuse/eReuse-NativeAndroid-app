package com.example.ereuseapp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface AppClient {

    @Headers({
           // "Authorization: Basic ODY5ODRlZTgtYTdjOC00ZjdiLWE1NWYtYWMyNzdmYTlmMjQxOg==", //testing
            "Authorization: Basic ZDk2Yjk5NDAtNmU3ZC00YjkxLWI1MjktMjZhZmIxMThhMWFjOg==", //production
            "Content-Type: application/json"
    })
    @POST("actions/")
    Call<Void> sendJson(@Body String message);

        //Call<User> sendUser(@Body User user);
}
