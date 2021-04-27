package com.example.demo.singleton;

import java.io.Serializable;

public class ProtectedBasicSingletonFromSerializer implements Serializable {

    private ProtectedBasicSingletonFromSerializer() {

    }

    private static final ProtectedBasicSingletonFromSerializer INSTANCE = new ProtectedBasicSingletonFromSerializer();

    public static ProtectedBasicSingletonFromSerializer getInstance() {
        return INSTANCE;
    }

    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    protected  Object readResolve() {
        return INSTANCE;
    }
}
