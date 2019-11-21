package com.my.cloud.spring.transaction.spread;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: Mr.Yang
 * @create: 2019-11-20 22:21
 **/
@Service
public class Required2 {

    @Transactional(propagation = Propagation.REQUIRED)
    public void func2() throws Exception {
        System.out.println("func2 run");
        throw new Exception();
    }
}
