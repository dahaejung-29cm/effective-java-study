package com.example.demo.lambda;

import java.util.function.*;

public class LambdaTestMain {


    public static void main(String[] args) {
        carryOutWork(()-> System.out.println("후"));

        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> multiply2 = (i) -> i * 2;

        System.out.println(plus10.apply(2));
        System.out.println(multiply2.apply(3));

        BinaryOperator<Integer> plus = (a, b) -> a + b;
        System.out.println(plus.apply(10, 20)); // 30 출력

        Predicate<String> isHello = (s) -> s.startsWith("Hello");
        System.out.println(isHello.test("Hi")); // false
        System.out.println(isHello.test("Hello")); // true

        Function<Integer, String> print10 = (s) -> String.valueOf(s);
        System.out.println(print10 .apply(10)); // "10" 출력

        Supplier<Integer> get10 = () -> 10; // 10을 리턴하겠다!
        System.out.println(get10.get());

        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10); // 10 출력

        BiFunction<Integer, Integer, Integer> plusTwo = (a, b) -> a + b;
        System.out.println(plusTwo.apply(10, 20)); // 30 출력
    }

    public static void carryOutWork(SimpleFunctionInterface sfi){
        sfi.doWork();
    }
}
