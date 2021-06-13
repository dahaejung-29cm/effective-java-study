package com.example.demo.generic;

import java.util.*;

public class MyStack<T> {

    int size = 0;

    public static void main(String[] args) {
        MyStack<Number> s = new MyStack<>();

        Iterable<Integer> integers = new ArrayList<Integer>();


        //s.pushAll(integers); 에러 타입 불변
        s.flexPushAll(integers); //가능


        MyStack<Number> s3 = new MyStack<>();
        Collection<Object> numbers = new ArrayList<>();
        // s3.popAll(numbers); 에러
        s3.flexPopAll(numbers);
    }


    public void pushAll(Iterable<T> src) {
        for (T e : src) {
            push(e);
        }
    }

    public void popAll(Collection<T> c) {
        while (!isEmpty()) {
            c.add(pop());
        }
    }

    public void flexPopAll(Collection<? super T> c) {
        while (!isEmpty()) {
            c.add(pop());
        }
    }

    public void flexPushAll(Iterable<? extends T> src) {
        for (T e : src) {
            push(e);
        }
    }


    /**
     * Creates an empty Stack.
     */
    public MyStack() {
    }

    public T push(T item) {
        //생략
        return item;
    }

    public synchronized T pop() {
        T obj =(T)new Object();
        int len = size;

        //생략
        return obj;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static final long serialVersionUID = 1;

}
