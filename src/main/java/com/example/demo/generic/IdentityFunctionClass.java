package com.example.demo.generic;

import java.util.List;
import java.util.function.UnaryOperator;

public class IdentityFunctionClass {
    //항등 함수인 경우 input으로 받은 함수를 반환하기 때문에 타입체크 안정성 보장
    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDENTITY_FN;
    }

    public static void main(String[] args) {
        String[] strings = {"A", "B", "C"};
        UnaryOperator<String> sameString = identityFunction();

        for (var str : strings) {
            System.out.println(sameString.apply(str));
        }

        Integer[] integers = {1, 2, 3};
        UnaryOperator<Integer> sameInteger = identityFunction();

        for (var integer : integers) {
            System.out.println(sameInteger.apply(integer));
        }
    }
}
