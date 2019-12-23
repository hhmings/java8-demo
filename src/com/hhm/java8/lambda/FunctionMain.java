package com.hhm.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by houhaimin on 2019/12/20.
 */
public class FunctionMain {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "fsdf", "rewqrew");
        List<Integer> map = map(strings, (String s) -> s.length());

        System.out.println(map);
    }

    private static <T,R> List<R> map(List<T> list, Function<T,R> f){
        List<R> results = new ArrayList<R>();
        for (T t : list){
            results.add(f.apply(t));
        }
        return results;
    }
}
