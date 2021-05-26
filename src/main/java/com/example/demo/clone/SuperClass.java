package com.example.demo.clone;

public class SuperClass implements Cloneable {

    int a;

    public void bad() {
        System.out.println("SuperClass method");
    }

    @Override
    public SuperClass clone() {
        try {
            bad();
            return (SuperClass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
    }
}
