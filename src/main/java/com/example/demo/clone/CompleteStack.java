package com.example.demo.clone;

import java.util.Arrays;
import java.util.EmptyStackException;

public class CompleteStack implements Cloneable{
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public CompleteStack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push (Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop (){
        if (size == 0) throw new EmptyStackException();

        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    @Override
    public CompleteStack clone() {
        try {
            var result = (CompleteStack) super.clone();
            result.elements = elements.clone(); //Object 타입이라 clone사용 가능
            System.out.println(result.elements);
            System.out.println(elements);
            return result;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
    }
}
