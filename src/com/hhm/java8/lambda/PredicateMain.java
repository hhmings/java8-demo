package com.hhm.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by houhaimin on 2019/12/20.
 */
public class PredicateMain {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "1111");
        List<String> results = filter(list, (String s) -> s.length() <=3);
        System.out.println(results);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> results = new ArrayList<T>();
        list.stream().forEach(t -> {
            if (predicate.test(t)){
                results.add(t);
            }
        });
        return results;
    }

}
