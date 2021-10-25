package com.hmmloo.javase.executors;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

public class ExecutorTest {
  @Test
  public void test1() {
    Executor executor = Executors.newSingleThreadExecutor();
    executor.execute(() -> System.out.println("Hello World!"));
  }

  @Test
  public void test2() throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    Future<String> future = executorService.submit(() -> "Hello World!");
    String result = future.get();
    System.out.println("Result: " + result);
  }

  @Test
  public void test3() {
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
    executor.schedule(
        () -> {
          System.out.println("Hello World");
        },
        500,
        TimeUnit.MILLISECONDS);
  }

  @Test
  public void test4() {
    ExecutorService pool =
        new ThreadPoolExecutor(
            1,
            2,
            1000,
            TimeUnit.MILLISECONDS,
            new SynchronousQueue<>(),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());
    for (int i = 0; i < 3; i++) {
      pool.execute(new ThreadTask());
    }
  }

  @Test
  public void test5() {
    ExecutorService pool =
        new ThreadPoolExecutor(
            1,
            2,
            1000,
            TimeUnit.MILLISECONDS,
            new ArrayBlockingQueue<Runnable>(10),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());
    for (int i = 0; i < 3; i++) {
      pool.execute(new ThreadTask());
    }
  }

  static class ThreadTask implements Runnable {

    public ThreadTask() {}

    public void run() {
      System.out.println(Thread.currentThread().getName());
    }
  }

  @Test
  public void test6() {
    ExecutorService pool =
            new ThreadPoolExecutor(
                    1,
                    2,
                    1000,
                    TimeUnit.MILLISECONDS,
                    new PriorityBlockingQueue<>(),
                    Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy());
    for (int i = 0; i < 20; i++) {
      pool.execute(new PriorityThreadTask(i));
    }
  }

  static class PriorityThreadTask implements Runnable, Comparable<PriorityThreadTask> {
    private final int priority;

    public PriorityThreadTask(int priority) {
      this.priority = priority;
    }

    @Override
    public int compareTo(PriorityThreadTask o) {
      return this.priority > o.priority ? -1 : 1;
    }

    @Override
    public void run() {
      try {
        // 让线程阻塞，使后续任务进入缓存队列
        Thread.sleep(1000);
        System.out.println(
            "priority:" + this.priority + ",ThreadName:" + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
