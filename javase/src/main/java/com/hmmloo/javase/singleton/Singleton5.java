package com.hmmloo.javase.singleton;

/**
 * 单例模式（静态内部类）
 *
 * 静态内部类是更进一步的写法，不仅能实现懒加载、线程安全，而且JVM还保持了指令优化的能力。
 *
 * Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会加载静态内部类InnerSingleton类，从而完成Singleton的实例化。
 *
 * 类的静态属性只会在第一次加载类的时候初始化，同时类加载的过程又是线程互斥的，JVM帮助我们保证了线程安全。
 */
public class Singleton5 {
    private Singleton5() {}

    private static class InnerSingleton {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance(){
        return InnerSingleton.INSTANCE;
    }
}
