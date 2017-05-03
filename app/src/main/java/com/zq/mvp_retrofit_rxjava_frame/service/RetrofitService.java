package com.zq.mvp_retrofit_rxjava_frame.service;

import com.zq.mvp_retrofit_rxjava_frame.service.entity.Book;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 *  Retrofit 接口集合
 */

public interface  RetrofitService {
    @GET("book/search")
    Call<Book> getSearchBook(@Query("q") String name,
                             @Query("tag") String tag,
                             @Query("start") int start,
                             @Query("count") int count);
    //结合RxJava
    @GET("book/search")
    Observable<Book> getSearchBookRx(@Query("q") String name,
                                     @Query("tag") String tag,
                                     @Query("start") int start,
                                     @Query("count") int count);
}
