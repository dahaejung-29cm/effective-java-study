package com.example.demo.lambda;

import java.util.function.Function;

public class TestService {

    public int execute(Function function) {
        System.out.println("function");
        return 1;
    }
}
