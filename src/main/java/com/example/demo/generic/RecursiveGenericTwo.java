package com.example.demo.generic;

import java.util.*;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;

public class RecursiveGenericTwo {


    public static void main(String[] args) {
        List<ScheduledFuture<Number>> scheduledFutures = new ArrayList<>();
        // max(scheduledFutures); 에러
        //flexMax(scheduledFutures);


        //varg("A", "B", "C");
        List<Number> s = Arrays.asList(new Integer(2), new Double(2));
        flexMax2(s);
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

    public static <E extends Comparable<? super E>> E flexMax(Collection<? extends E> c) {
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

    public static <E extends Number> E flexMax2(Collection<? extends E> c) {
        if(c.isEmpty()) {
            throw new IllegalArgumentException("empty collection");
        }

        E result = null;
        return result;
    }

    public void varg(String ... args) {
        for (String s : args) {
            System.out.println("가변가변: " + s);
        }
    }

}
