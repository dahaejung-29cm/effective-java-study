package com.example.demo.clone;

public class ChildClass extends SuperClass {
    String test;

    @Override
    public void bad() {
        super.bad();
        System.out.println("ChildClass method");
        a = 3;
    }

    @Override
    public ChildClass clone() {
        return (ChildClass) super.clone();
    }
}
