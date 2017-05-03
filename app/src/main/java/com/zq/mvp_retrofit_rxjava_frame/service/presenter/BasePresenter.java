package com.zq.mvp_retrofit_rxjava_frame.service.presenter;

import com.zq.mvp_retrofit_rxjava_frame.service.view.BaseView;

/**
 *
 */

public interface BasePresenter {
    void onCreate();

    void onStop();

    void attachView(BaseView view);
}
