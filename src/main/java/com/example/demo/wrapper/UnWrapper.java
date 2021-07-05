package com.example.demo.wrapper;

public class UnWrapper implements SomethingWithCallback {


    @Override
    public void doSomething() {
        System.out.println("UnWrapper !");
    }

    @Override
    public void call() {
        System.out.println("Wrapper callback!");
    }

}
