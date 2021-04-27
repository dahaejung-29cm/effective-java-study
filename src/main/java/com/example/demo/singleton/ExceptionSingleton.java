package com.example.demo.singleton;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class ExceptionSingleton implements Serializable {

    //정적 블록
    static {
        try{
            INSTANCE = new ExceptionSingleton();
        }catch(Exception e) {
            System.err.println("failed to create singleton");
        }
    }

    private ExceptionSingleton() throws IOException {
        System.out.println("Singleton is initializing");
        File.createTempFile(".", ".");
    }

    private static ExceptionSingleton INSTANCE;

    public static ExceptionSingleton getInstance() {
        return INSTANCE;
    }

    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
