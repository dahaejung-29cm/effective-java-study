package com.example.demo.lambda;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
    PLUS("+", (x, y) -> x+y),
    MINUS("-", (x, y) -> x-y),
    TIMES("*", (x, y) -> x*y),
    DIVIDE("/", (x, y) -> x/y),
    ;

    private final String symbol;
    private final DoubleBinaryOperator op;

    Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }
    @Override
    public String toString() {
        return symbol;
    }
    public double apply(double x, double y){
        return this.op.applyAsDouble(x, y);
    }

    public static void main(String[] args) {
        Operation operation = Operation.PLUS;
        double result = operation.apply(1, 2);
        System.out.println(result);
    }
}
