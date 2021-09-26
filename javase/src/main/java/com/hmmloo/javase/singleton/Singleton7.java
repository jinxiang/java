package com.hmmloo.javase.singleton;

/**
 * 单例模式（枚举）
 *
 * 《Effective Java》作者推荐的一种方式，非常简练。
 *
 * 但是这种写法解决了最主要的问题：线程安全、⾃由串⾏化、单⼀实例。
 *
 */
public enum Singleton7 {
    INSTANCE;

    public void anyMethod(){
        System.out.println("do any thing");
    }
}
