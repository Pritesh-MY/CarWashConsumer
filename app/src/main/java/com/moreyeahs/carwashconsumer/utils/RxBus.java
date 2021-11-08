package com.moreyeahs.carwashconsumer.utils;

import io.reactivex.subjects.PublishSubject;

/**
 * Created by User on 29-11-2018.
 */

public class RxBus {

    private static RxBus instance;

    public static RxBus getInstance() {
        if (instance == null) {
            instance = new RxBus();
        }
        return instance;
    }

    private RxBus() {
    }

    private PublishSubject<Object> bus = PublishSubject.create();
//    private PublishSubject<EndFlashDealModel> bus1 = PublishSubject.create();
//
//    public void sendEvent(Object o) {
//        bus.onNext(o);
//    }
//
//    public Observable<Object> getEvent() {
//        return bus;
//    }
//
//    public void sendFlashDealEndEvent(EndFlashDealModel o) {
//        bus1.onNext(o);
//    }
//
//    public Observable<EndFlashDealModel> getFlashDealEndEvent() {
//        return bus1;
//    }
}