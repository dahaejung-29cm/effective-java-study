package com.example.demo.clone;

public class NormalSimpleClone implements Cloneable{

    private int a;

    public int getA() {
        return a;
    }

    public NormalSimpleClone(int a) {
        this.a = a;
    }

    @Override
    public NormalSimpleClone clone() {
        try {
            return (NormalSimpleClone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
    }
}
