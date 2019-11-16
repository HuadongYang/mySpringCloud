package com.my.cloud.guava;

import com.google.common.base.*;
import com.google.common.collect.*;
import com.google.common.io.Files;
import com.google.common.primitives.Ints;
import com.my.cloud.lambda.StreamTest;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Mr.Wang
 * @create: 2019-11-01 20:34
 **/
public class StringTest {

    public static void main(String[] args) {
        file();
    }

    private static void file() {
        File file = new File(StreamTest.class.getResource("/test.txt").getFile());//资源目录
        List<String> lines = null;
        try {
            lines = Files.readLines(file, Charsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void map() {
        //创建
        Map<String, Integer> money = ImmutableMap.of("book",1,"mouse", 2);


        //{book=2, mouse=4}
        Map<String, Object> stringObjectMap = Maps.transformValues(money, new Function<Integer, Object>() {
            Integer a = 2;

            @Override
            public Object apply(Integer input) {
                return input * a;
            }
        });

        //{a=[b, c]}
        Multimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("a", "b");
        multimap.put("a","c");

    }

    private void list() {
        String testString = "foo , what,,,more,";
        Iterable<String> split = Splitter.on(",").omitEmptyStrings().trimResults().split(testString);
        split.forEach(s->System.out.println(s));

        //创建
        ImmutableList<String> of = ImmutableList.of("a", "b");
    }

    /**
     * 整数
     */
    private void Ints() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        String numbersAsString = Joiner.on(";").join(Ints.asList(numbers));
        String numbersAsStringDirectly = Ints.join(";", numbers);
        boolean contains = Ints.contains(numbers, 1);
    }

    /**
     * 列表拼接
     */
    private void join() {
        String[] subdirs = { "usr", "local", "lib" };
        String directory = Joiner.on("/").join(subdirs);

        int[] numbers = { 1, 2, 3, 4, 5 };
        int indexOf = Ints.indexOf(numbers, 1);
        int max = Ints.max(numbers);
        int min = Ints.min(numbers);
    }

    /**
     * 从字符串里移除数字
     */
    private void removeFrom() {
        String string1 = CharMatcher.DIGIT.removeFrom("some text 89983 and more");
    }

    /**
     * 从字符串里获取数字
     * @return
     */
    private String retainFrom() {
        return CharMatcher.DIGIT.retainFrom("some text 89983 and more");
    }
}
