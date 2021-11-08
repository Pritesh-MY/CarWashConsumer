package com.moreyeahs.carwashconsumer.api;

import android.app.Activity;

public class CommonClassForApi {
    private static Activity mActivity;
    private static CommonClassForApi commonClassForApi;

    public static CommonClassForApi getInstance(Activity activity) {
        if (commonClassForApi == null) {
            commonClassForApi = new CommonClassForApi();
        }
        mActivity = activity;
        return commonClassForApi;
    }

//    public void getOffersFlashDeal(final DisposableObserver objDesObserver, int WarehouseId, String SectionID, int CustomerId) {
//        RestClient.getInstance(mActivity).getService().getOfferItemByFlashDeal(WarehouseId, SectionID, CustomerId)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<JsonObject>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                    }
//
//                    @Override
//                    public void onNext(JsonObject o) {
//                        objDesObserver.onNext(o);
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        objDesObserver.onError(e);
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        objDesObserver.onComplete();
//                    }
//                });
//    }
}
