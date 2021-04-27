package com.example.demo.supplier;

import java.util.function.Supplier;

public class SupplierExample {

    public static String getValue() {
        return "🌝";
    }

    public static void checkValue(int i, Supplier<String> data) {
        if (i > 0) {
            System.out.println(data.get());
        }
        else {
            System.out.println("☹️");
        }
    }

}
