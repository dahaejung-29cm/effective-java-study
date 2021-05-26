package com.example.demo.clone;

public class SubClone extends SupClone{
    private int a;

    public SubClone(int a) {
        super(a);
    }

    @Override
    public SubClone clone(){
        return (SubClone) super.clone();
    }
}
