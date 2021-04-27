package com.example.demo.singleton;

public class LazySingletonThreadSafe1 {

    private static LazySingletonThreadSafe1 instance;

    private LazySingletonThreadSafe1() {
        System.out.println("lazy singleton");
    }

    public static synchronized LazySingletonThreadSafe1 getInstance() {
        if(instance == null) {
            instance = new LazySingletonThreadSafe1();
        }
        return instance;
    }

}
