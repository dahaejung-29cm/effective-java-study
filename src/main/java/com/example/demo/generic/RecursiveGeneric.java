package com.example.demo.generic;

import java.util.*;

import static com.example.demo.generic.BadRawMethod.badUnion;

public class RecursiveGeneric {


    public static void main(String[] args) {
        Collection<String> a = List.of("A", "C", "B");
        String strMax = max(a);


        Collection<Integer> i = List.of(1,2,3);
        //String strMax2 = max(i);
        Integer intMax2 = max(i);
        //Double intMax3 = max(i); 안됨

        Collection<Number> n = List.of(1,2,3);

        //Integer intMax3 = max(n);
        //Double intMax4 = max(n);
    }

    //자기 자신으로 한정
    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if(c.isEmpty()) {
            throw new IllegalArgumentException("empty collection");
        }

        E result = null;
        for (E e : c) {
            if(result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }
        return result;
    }


}
