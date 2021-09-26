package com.hmmloo.javase.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 单例模式（CAS）
 *
 * 种CAS式的单例模式算是懒汉式直接加锁的一个变种，sychronized是一种悲观锁，而CAS是乐观锁，相比较，更轻量级。
 *
 * 当然，这种写法也比较罕见，CAS存在忙等的问题，可能会造成CPU资源的浪费。
 */
public class Singleton6 {
    private static final AtomicReference<Singleton6> INSTANCE = new AtomicReference<>();
    private Singleton6() {}

    public static final Singleton6 getInstance() {
        while(true) {
            Singleton6 instance = INSTANCE.get();
            if(null == instance) {
                INSTANCE.compareAndSet(null, new Singleton6());
            }
            return INSTANCE.get();
        }
    }
}
