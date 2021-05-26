package com.example.demo.clone;

public class SupClone implements Cloneable{
    private int a;

    public SupClone(int a) {
        this.a = a;
    }

    @Override
    public SupClone clone(){
        return new SupClone(this.a);
    }
}
