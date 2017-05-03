package com.zq.mvp_retrofit_rxjava_frame.service.view;

import com.zq.mvp_retrofit_rxjava_frame.service.entity.Book;

/**
 *
 */

public interface BookView extends BaseView {
    void onSuccess(Book mBook);
    void onError(String result);
}
