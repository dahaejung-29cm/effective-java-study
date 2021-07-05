package com.example.demo.wrapper;

public class test {

    public static void main(String[] args) {
        SomeService   service       = new SomeService();
        WrappedObject wrappedObject = new WrappedObject(service);
        Wrapper       wrapper       = new Wrapper(wrappedObject);

        wrapper.doSomething();
        //wrapper.doSomethingElse();

        UnWrapper unWrapper = new UnWrapper();
        //unWrapper.doSomething();
    }
}
