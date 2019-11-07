package com.my.cloud.jdk.string;

/**
 * 值引用测试
 */
public class ValueReferTest {

    public static void sb(){
        StringBuilder sn = new StringBuilder("abcd");
        refer(sn);
        System.out.println(sn.toString());
    }

    public static void refer(StringBuilder sn){
        sn.append("qwe");
        sn = new StringBuilder("qwer");
    }

    public static void main(String[] args) {
        sb();
    }

}
