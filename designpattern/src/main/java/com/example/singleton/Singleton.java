package com.example.singleton;

/**
 * Created by 程序亦非猿 on 16/1/5.
 */
public class Singleton {

//    private static Singleton ins;

    private Singleton() {}
    //   线程不安全
    //    public static Singleton getIns() {
    //        if (null == ins) {
    //            ins  = new Singleton();
    //        }
    //        return ins;
    //    }

    //线程安全 不高效 懒汉
//    public synchronized static Singleton getIns() {
//        if (null == ins) {
//            ins  = new Singleton();
//        }
//        return ins;
//    }

    // 高效 但ins需要 volatile
//    public static DoubleCheck getIns() {
//        if (null==ins){
//            synchronized (DoubleCheck.class){
//                if (null == ins) {
//                    ins = new DoubleCheck();
//                }
//            }
//        }
//        return ins;
//    }

    private static class Holder{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getIns(){
        return Holder.INSTANCE;
    }
}
