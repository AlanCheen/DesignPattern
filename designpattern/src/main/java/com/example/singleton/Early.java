package com.example.singleton;

/**
 * Created by 程序亦非猿 on 16/1/5.
 */
public class Early {
    private static final Early ins = new Early();
    public static Early getIns() {
        return ins;
    }
}
