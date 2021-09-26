package com.hmmloo.javase.singleton;

/**
 * 懒汉式（加锁）
 *
 * 直接上锁.
 * 但是这种把锁直接方法上的办法，所有的访问都需要获取锁，导致了资源的浪费。
 */
public class Singleton3 {
    private static Singleton3 INSTANCE;
    private Singleton3() {}

    public synchronized static Singleton3 getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }
}
