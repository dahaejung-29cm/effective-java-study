package com.example.demo.builder;

import java.util.Objects;

public class YourPizza extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }
        @Override public YourPizza build() {
            return new YourPizza(this);
        }

        @Override protected Builder self() { return this; }
    }

    private YourPizza(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
