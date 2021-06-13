package com.example.demo.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;

public class RecursiveGenericTwo {


    public static void main(String[] args) {
        List<ScheduledFuture<?>> scheduledFutures = new ArrayList<>();
        // max(scheduledFutures); 에러
        flexMax(scheduledFutures);

        //varg("A", "B", "C");

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

    public void varg(String ... args) {
        for (String s : args) {
            System.out.println("가변가변: " + s);
        }
    }

}
