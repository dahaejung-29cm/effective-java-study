package com.example.demo.markerinterface;

public class TestMain {

    public static void main(String[] args) {
        Class<?> testClass = BadJava.class;
        //런타임
        if(testClass.isAnnotationPresent(NotEffective.class)){
            System.out.println("Effective Java!!");
        }else {
            System.out.println("Effective Java No!!");
        }

        //컴파일
        //Effective effective = new GoodJava();
    }
}
