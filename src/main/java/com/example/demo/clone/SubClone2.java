package com.example.demo.clone;

public class SubClone2 extends SupClone2{
    private int a;

    public SubClone2(int a) {
        super(a);
    }

    @Override
    public SubClone2 clone(){
        return (SubClone2) super.clone();
    }
}
