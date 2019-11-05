package com.my.cloud.lambda;

import com.google.common.base.CharMatcher;
import org.junit.Test;

import java.util.function.Consumer;

public class ConsumerTest {

    public String modify(String sourceStr, Consumer<String> consumer){
        consumer.accept(sourceStr);
        return sourceStr;
    }
    @Test
    public void modifyTest(){
        String sourceStr = "this is an 1234 test string";

        String consumer1 = modify(new String(sourceStr), x->
                x = CharMatcher.DIGIT.retainFrom(x));

        String consumer2 = modify(new String(sourceStr), x->
                x = CharMatcher.DIGIT.removeFrom(x));

        String consumer3 = modify(new String(sourceStr), x->
                x.substring(5));


        System.out.println(consumer1);
        System.out.println(consumer2);
        System.out.println(consumer3);

    }
}
