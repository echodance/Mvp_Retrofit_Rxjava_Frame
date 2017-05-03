package com.zq.mvp_retrofit_rxjava_frame.service.presenter;

import android.content.Context;

import com.zq.mvp_retrofit_rxjava_frame.service.entity.Book;
import com.zq.mvp_retrofit_rxjava_frame.service.manager.BookDataManager;
import com.zq.mvp_retrofit_rxjava_frame.service.view.BaseView;
import com.zq.mvp_retrofit_rxjava_frame.service.view.BookView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 *
 */

public class BookPresenter implements BasePresenter {

    private BookDataManager mBookDataManager;
    private CompositeSubscription mCompositeSubscription;
    private Context mContext;
    private BookView mBookView;
    private Book mBook;

    public BookPresenter (Context mContext){
        this.mContext = mContext;
    }

    @Override
    public void onCreate() {
        mBookDataManager = new BookDataManager(mContext);
        mCompositeSubscription = new CompositeSubscription();
    }

    @Override
    public void onStop() {
        if (mCompositeSubscription.hasSubscriptions()){
            mCompositeSubscription.unsubscribe();
        }
    }

    @Override
    public void attachView(BaseView view) {
        mBookView = (BookView)view;
    }


    public void getSearchBooks(String name,String tag,int start,int count){
        mCompositeSubscription.add(mBookDataManager.getSearchBooks(name, tag, start, count)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Book>() {
                    @Override
                    public void onCompleted() {
                        if (mBook != null){
                            mBookView.onSuccess(mBook);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        mBookView.onError("请求失败！！");
                    }

                    @Override
                    public void onNext(Book book) {
                        mBook = book;
                    }
                })
        );
    }
}
