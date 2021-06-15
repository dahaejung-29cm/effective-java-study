package com.example.demo.generic.test;

public class Child extends Parent implements ChildItf, Comparable<Child> {

    @Override
    public int compareTo(Child o) {
        return 0;
    }
}
