package com.hhm.java8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by houhaimin on 2019/12/20.
 */
public class LambdaMain {

    private static List<Apple> initApples(){
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red",100));
        apples.add(new Apple("blue",90));
        apples.add(new Apple("gray",80));
        apples.add(new Apple("green",70));
        apples.add(new Apple("yellow",60));
        apples.add(new Apple("black",120));
        return apples;
    }


    public static void main(String[] args) {
        List<Apple> apples = initApples();

        apples.sort(Comparator.comparing(Apple::getWeight).reversed());

        System.out.println(apples);
    }


}




