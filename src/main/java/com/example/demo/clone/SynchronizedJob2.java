package com.example.demo.clone;

import java.util.concurrent.CountDownLatch;

public class SynchronizedJob2 implements Cloneable  {

    int cloneCount;
    Object lock;
    public SynchronizedJob2() {
        this.cloneCount = 1000;
        this.lock = new Object();
    }

    public void reduceCountWithLock(CountDownLatch latch) {
        synchronized (lock) {
            latch.countDown();
            while (this.cloneCount >= 100) {
                try {
                    Thread.sleep(100L);
                    this.cloneCount -= 100;
                    System.out.println(Thread.currentThread().getName() + " 실행 현재 count" + cloneCount);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " 실행 현재 count" + cloneCount);
        }
    }

    @Override
    public SynchronizedJob2 clone() {
        try {
            synchronized (lock) {
                SynchronizedJob2 clone = (SynchronizedJob2) super.clone();
                return clone;
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

}
