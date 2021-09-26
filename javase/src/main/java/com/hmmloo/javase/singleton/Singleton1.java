package com.hmmloo.javase.singleton;

/**
 * 饿汉式（线程安全）
 * 它会在类加载的时候完成实例化，不存在线程安全的问题
 */
public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
