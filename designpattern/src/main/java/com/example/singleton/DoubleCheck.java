package com.example.singleton;

/**
 * Created by 程序亦非猿 on 16/1/5.
 */
public class DoubleCheck {

    private volatile static DoubleCheck ins;

    private DoubleCheck() {}
    public static DoubleCheck getIns() {
        if (null==ins){
            synchronized (DoubleCheck.class){
                if (null == ins) {
                    ins = new DoubleCheck();
                }
            }
        }
        return ins;
    }
}
