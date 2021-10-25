package com.hmmloo.javase.thread;

import java.util.concurrent.*;

public class ThreadDemo {
  public static void main(String[] args) {
    //
      ExecutorService executorService = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
              new LinkedBlockingDeque<>(10), Executors.defaultThreadFactory(),
              new ThreadPoolExecutor.DiscardPolicy());
  }
}
