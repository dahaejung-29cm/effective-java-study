package com.example.demo.lambda;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {

    public static void main(String[] args) {
        Map<Integer, Integer> test = new HashMap<>();

        test.merge(1, 1, (count, incr) -> count + incr);
        System.out.println("first " + test.get(1));
        test.merge(1, 1, (count, incr) -> count + incr);
        System.out.println("second " + test.get(1));

        test.merge(1, 1, Integer::sum);
        System.out.println("third " + test.get(1));

    }
}
