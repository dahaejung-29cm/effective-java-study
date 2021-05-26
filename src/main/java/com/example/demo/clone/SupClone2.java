package com.example.demo.clone;

public class SupClone2 implements Cloneable {
    private int a;

    public SupClone2(int a) {
        this.a = a;
    }

    @Override
    public SupClone2 clone() {
        try {
            return (SupClone2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
    }
}
