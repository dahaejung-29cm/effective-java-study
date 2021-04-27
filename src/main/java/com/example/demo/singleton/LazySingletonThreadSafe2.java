package com.example.demo.singleton;

public class LazySingletonThreadSafe2 {

    private static LazySingletonThreadSafe2 instance;

    private LazySingletonThreadSafe2() {
        System.out.println("lazy singleton");
    }

    public static LazySingletonThreadSafe2 getInstance() {
        if(instance == null){
            synchronized (LazySingletonThreadSafe2.class){
                if (instance == null){
                    instance = new LazySingletonThreadSafe2();
                }
            }
        }
        return instance;
    }

}
