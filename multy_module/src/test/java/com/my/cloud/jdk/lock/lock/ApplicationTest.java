package com.my.cloud.jdk.lock.lock;

import org.junit.Test;

public class ApplicationTest {

    @Test
    public void lock1() {
        Application application = new Application();

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                application.lock1(Thread.currentThread());
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                application.lock1(Thread.currentThread());
            }
        });
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
