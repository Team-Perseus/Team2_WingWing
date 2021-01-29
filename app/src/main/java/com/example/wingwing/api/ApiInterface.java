package com.example.wingwing.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiInterface {

    @Headers({"X-Naver-Client-Id: ", "X-Naver-Client-Secret: "})
    @GET("movie.json")
    Call<Location> getMovies(@Query("query") String title,
                             @Query("display") int displaySize,
                             @Query("start") int startPosition);

}