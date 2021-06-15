package com.example.demo.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class VargClass {

    public static void main(String[] args) {
                //danferous(List.of("A", "B", "C"));
        //String[] attributes = pickTwo("A", "B", "C");
        List<String> good = goodPickTwo("A", "B", "C");
        String[] good2 = pickFour("A", "B", "C");
        String[] attributes2 = (String[]) pickTwo("A", "B", "C");
        //Object a = (Object) Integer.valueOf(1);

    }
    static void danferous(List<String>... stringLists) {
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList; // 힙 오염 발생
        String s = stringLists[0].get(0); // ClassCastException
        List<Integer> a = Arrays.asList(1, 2 , 3);

    }


    static <T> T[] toArray(T... args) {
        return args;
    }

    static <T> List<T> toArray2(T one, T two) {
        return  Arrays.asList(one, two);
    }

    //불가
    static <T> T[] pickTwo(T a, T b, T c) {
        switch(ThreadLocalRandom.current().nextInt(3)) {
            case 0: return toArray(a, b);
            case 1: return toArray(b, c);
            case 2: return toArray(c, a);
        }
        throw new AssertionError();
    }
    //가능
    static <T> T[] pickFour(T... args) {
        return args;
    }


    //가능
    static <T> List<T> goodPickTwo(T a, T b, T c) {
        switch(ThreadLocalRandom.current().nextInt(3)) {
            case 0: return List.of(a, b);
            case 1: return List.of(b, c);
            case 2: return List.of(c, a);
        }
        throw new AssertionError();
    }


    @SafeVarargs
    static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for(List<? extends T> list : lists) {
            result.addAll(list);
        }
        return result;
    }
}

