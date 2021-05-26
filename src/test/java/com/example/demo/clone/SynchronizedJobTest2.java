package com.example.demo.clone;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;

public class SynchronizedJobTest2 {

    /*
    * 동기화가 적용된 reduceCountWithLock 메소드는 한번 호출되면 멤버로 가지고있는 cloneCount 값을 0으로 만들때까지 lock을 점유하는 메소드이다.
    * 만약 해당 메소드가 동작할 때 clone을 호출하면 어떻게 될까? 해당 메소드는 Thread Safe하게 구현하였으므로 모든 일을 마치고 객체가 복제되는게 일반적인 생각
    *
    * 테스트가 끝나지 않음
    * */
    @Test
    @DisplayName("clone 메소드를 Thread safe 하게 구현해야 한다.")
    void testClone() throws InterruptedException{
        CountDownLatch latch = new CountDownLatch(2);
        CountDownLatch latch2 =  new CountDownLatch(1);
        SynchronizedJob2 synchronizedJob = new SynchronizedJob2();

        Thread thread1 = new Thread(job(synchronizedJob,latch,latch2));
        Thread thread2 = new Thread(cloneJob(synchronizedJob,latch,latch2));
        thread1.setName("쓰레드 1");
        thread2.setName("쓰레드 2");
        thread1.start();
        thread2.start();

        latch.await();
    }

    Runnable job(SynchronizedJob2 sync, CountDownLatch latch, CountDownLatch latch2) {
        return () -> {
            sync.reduceCountWithLock(latch2);
            latch.countDown();
        };
    }

    Runnable cloneJob(SynchronizedJob2 sync, CountDownLatch latch,CountDownLatch latch2) {
        return () -> {
            try {
                latch2.await();
                SynchronizedJob2 clone = sync.clone();
                System.out.println(Thread.currentThread().getName() + "clone 객체 count 값 : " + clone.cloneCount);
                if(clone.cloneCount == 0) {
                    latch.countDown();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };
    }

}
