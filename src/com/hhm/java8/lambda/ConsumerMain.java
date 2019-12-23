package com.hhm.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by houhaimin on 2019/12/20.
 */
public class ConsumerMain {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        print(integers,(Integer t) -> System.out.println(t));
    }

    private static <T> void print(List<T> list, Consumer<T> consumer){
        for (T t : list){
            consumer.accept(t);
        }
    }
}
