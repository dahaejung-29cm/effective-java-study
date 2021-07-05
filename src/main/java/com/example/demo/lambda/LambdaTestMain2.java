package com.example.demo.lambda;

import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class LambdaTestMain2 {


    public static void main(String[] args) throws Exception {
        int changeNumber = 0;
        List<Integer> test = List.of(1, 2 ,3, 5, 7);
        for (Integer a: test) {
            changeNumber++;
            System.out.println(a);
            errorTest(a);
        }
        test.forEach(a-> {
            System.out.println(a);
            //errorTest(a);

        });

    }
    public static void errorTest(Integer a) throws Exception {
        System.out.println(String.valueOf(a));
    }
}
