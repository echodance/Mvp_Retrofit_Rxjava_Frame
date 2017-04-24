package com.zq.mvp_retrofit_rxjava_frame.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.GsonBuilder;
import com.zq.mvp_retrofit_rxjava_frame.R;
import com.zq.mvp_retrofit_rxjava_frame.service.entity.Book;
import com.zq.mvp_retrofit_rxjava_frame.service.entity.RetrofitService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView mTvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvShow = (TextView) findViewById(R.id.tv_show);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.douban.com/v2/")
                //增加返回值为Gson的支持(以实体类返回)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                //增加返回值为String的支持
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        RetrofitService service = retrofit.create(RetrofitService.class);
        Call<Book> bookCall =  service.getSearchBook("小王子", null, 0, 1);
        bookCall.enqueue(new Callback<Book>() {
            @Override
            public void onResponse(Call<Book> call, Response<Book> response) {
                mTvShow.setText(response.body().books.get(0).author_intro + ""); 
            }

            @Override
            public void onFailure(Call<Book> call, Throwable t) {

            }
        });
    }
}
