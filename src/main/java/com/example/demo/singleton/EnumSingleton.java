package com.example.demo.singleton;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        value = 42;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
