package com.my.cloud.spring.transaction.spread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: Mr.Yang
 * @create: 2019-11-20 22:13
 *
 * 不存在事物，新建事物
 * 存在事物，加入该事物
 *
 * Required2抛出异常，Required1吃掉，会抛异常
 * Required2抛出异常，Required2方法内部吃掉，都不回滚
 *
 * Required2或Required1抛出异常，都不吃掉，都会回滚
 *
 * Required2和Required1可操作同一条记录，因为同属于一个事物
 **/
@Service
public class Required1 {

    @Autowired
    private Required2 required2;

    @Transactional(propagation = Propagation.REQUIRED)
    public void func1() {
        System.out.println("func1 run");
        try {
            required2.func2();
        } catch (Exception e) {
            System.out.println("catch exception");
        }
    }
}
