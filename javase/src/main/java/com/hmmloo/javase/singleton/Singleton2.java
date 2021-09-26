package com.hmmloo.javase.singleton;

/**
 * 懒汉式（线程不安全）
 * 图片也很清楚，多线程的情况下，可能存在这样的问题：
 *
 * 一个线程判断instance==null，开始初始化对象；
 *
 * 还没来得及初始化对象时候，另一个线程访问，判断instance==null，也创建对象。
 *
 * 最后的结果，就是实例化了两个Singleton对象。
 */
public class Singleton2 {
    private static Singleton2 INSTANCE;
    private Singleton2() {}

    public static Singleton2 getInstance() {
        if(INSTANCE != null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}
