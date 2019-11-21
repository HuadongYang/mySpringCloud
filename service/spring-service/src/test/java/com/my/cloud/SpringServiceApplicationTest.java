package com.my.cloud;



import com.my.cloud.spring.transaction.spread.Required1;
import com.my.cloud.spring.transaction.spread.Required2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringServiceApplicationTest {

    @Autowired
    private Required1 required1;

    @Test
    public void requiredTest(){
        required1.func1();

    }
}
