package com.my.cloud.jdk.lock.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: Mr.Yang
 * @create: 2019-11-21 10:06
 **/
public class Application {

    private ReentrantLock lock = new ReentrantLock();

    public Condition condition = lock.newCondition();



    public void lock1(Thread thread){

        lock.lock();

        try {
            System.out.println(thread.getName() + " get lock");
            condition.await(100, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(thread.getName() + " unlock");
            lock.unlock();
        }

    }
}
