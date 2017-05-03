package com.zq.mvp_retrofit_rxjava_frame.service.manager;

import android.content.Context;

import com.zq.mvp_retrofit_rxjava_frame.service.RetrofitHelper;
import com.zq.mvp_retrofit_rxjava_frame.service.RetrofitService;
import com.zq.mvp_retrofit_rxjava_frame.service.entity.Book;

import rx.Observable;

/**
 *  封装对数据的操作
 */

public class BookDataManager {

    private RetrofitService mRetrofitService;

    public BookDataManager(Context context){
         mRetrofitService = RetrofitHelper.getInstance(context).getServer();
    }

    public Observable<Book> getSearchBooks(String name, String tag, int start, int count){
        return mRetrofitService.getSearchBookRx(name,tag,start,count);
    }
}
