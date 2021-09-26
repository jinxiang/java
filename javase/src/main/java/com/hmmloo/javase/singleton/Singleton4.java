package com.hmmloo.javase.singleton;

/**
 * 懒汉式（双重校验锁）
 *
 * 把synchronized加在了方法的内部，一般的访问是不加锁的，只有在instance==null的时候才加锁。
 *
 * 使用了volatile关键字后，可以保证有序性，指令重排序被禁止；
 * 那这个重排指的是哪？指的是instance = new Singleton()，我们感觉是一步操作的实例化对象，实际上对于JVM指令，是分为三步的：
 *
 * 分配内存空间
 * 初始化对象
 * 将对象指向刚分配的内存空间
 * 有些编译器为为了性能优化，可能会把第二步和第三步进行重排序，顺序就成了：
 *
 * 分配内存空间
 * 将对象指向刚分配的内存空间
 * 初始化对象
 */
public class Singleton4 {
    //volatile修饰，防止指令重排
    private static volatile Singleton4 INSTANCE;
    private Singleton4() {}

    public static Singleton4 getInstance() {
        //第一重校验，检查实例是否存在
        if (INSTANCE == null) {
            //同步块
            synchronized (Singleton4.class) {
                //第二重校验，检查实例是否存在，如果不存在才真正创建实例
                if (INSTANCE == null) {
                    INSTANCE = new Singleton4();
                }
            }
        }
        return INSTANCE;
    }
}
