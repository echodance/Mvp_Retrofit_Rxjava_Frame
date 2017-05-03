package com.zq.mvp_retrofit_rxjava_frame.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.zq.mvp_retrofit_rxjava_frame.R;
import com.zq.mvp_retrofit_rxjava_frame.service.entity.Book;
import com.zq.mvp_retrofit_rxjava_frame.service.presenter.BookPresenter;
import com.zq.mvp_retrofit_rxjava_frame.service.view.BookView;

/**
 * 提供测试 显示
 */
public class MainActivity extends AppCompatActivity {

    private TextView mTvShow;
    private BookPresenter mBookPresenter = new BookPresenter(this);
    private BookView mBookView = new BookView() {
        @Override
        public void onSuccess(Book book) {
            mTvShow.setText(book.books.get(0).author_intro + "");
        }

        @Override
        public void onError(String result) {
            Toast.makeText(MainActivity.this,result, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvShow = (TextView) findViewById(R.id.tv_show);
// Retrofit访问网络的基本用法
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://api.douban.com/v2/")
//                //增加返回值为Gson的支持(以实体类返回)
//                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
//                //增加返回值为String的支持
//                .addConverterFactory(ScalarsConverterFactory.create())
//                //增加返回值为Oservable<T>的支持 RxJava
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .build();
//
//        RetrofitService service = retrofit.create(RetrofitService.class);
////        Call<Book> bookCall =  service.getSearchBook("小王子", null, 0, 1);
////        bookCall.enqueue(new Callback<Book>() {
////            @Override
////            public void onResponse(Call<Book> call, Response<Book> response) {
////                mTvShow.setText(response.body().books.get(0).author_intro + "");
////            }
////
////            @Override
////            public void onFailure(Call<Book> call, Throwable t) {
////
////            }
////        });
//  Retrofit 结合 Rx 访问网络的基本用法
//        Observable<Book> observable  =  service.getSearchBookRx("小王子", null, 0, 1);
//        observable.subscribeOn(Schedulers.io())//请求数据的事件发生在io线程
//                .observeOn(AndroidSchedulers.mainThread())//请求完成后在主线程更显UI
//                .subscribe(new Observer<Book>() {//订阅
//                    @Override
//                    public void onCompleted() {
//                        //所有事件都完成，可以做些操作。。。
//                    }
//                    @Override
//                    public void onError(Throwable e) {
//                        e.printStackTrace(); //请求过程中发生错误
//                    }
//                    @Override
//                    public void onNext(Book book) {//这里的book就是我们请求接口返回的实体类
//                        mTvShow.setText(book.books.get(0).author_intro + "");
//                    }
//                });

//重构为MVP模式下的 调用
        mBookPresenter.onCreate();
        mBookPresenter.attachView(mBookView);
        mBookPresenter.getSearchBooks("小王子", null, 0, 1);

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mBookPresenter.onStop();
    }
}
