package com.example.demo.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

public class BadRawMethod {


    public static void main(String[] args) {
        System.out.println("===============BAD==============");
        Set<String> s = Set.of("A","B","C");
        Set<Integer> s2 = Set.of(1,2,3);
        Set<Integer> setTest = badUnion(s, s2);

        Iterator<Integer> it = setTest.iterator();

        System.out.println(setTest.contains(1));
        System.out.println(setTest.contains("A"));

        while (it.hasNext()) {
            Integer a = it.next(); // throw ClassCastException
        }
    }

    public static Set badUnion(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

}
