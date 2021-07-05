package com.example.demo.lambda;


import java.security.Provider;
import java.util.concurrent.Executor;

public class BetterLambda {

    static String action() {
        return "Action!!";
    }

    private static Executor service = null;

    void executeService() {

        TestService ts = new TestService();
        service.execute(BetterLambda::action);

        service.execute(() -> action());
    }

}
