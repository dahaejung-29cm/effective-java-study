package com.example.demo.clone;

public class FinalClone implements Cloneable{

    private final String a;
    private int b;
    private final NormalSimpleClone normalSimpleClone;

    public FinalClone(String a, int b, NormalSimpleClone normalSimpleClone) {
        this.a = a;
        this.b = b;
        this.normalSimpleClone = normalSimpleClone;
    }

    @Override
    public FinalClone clone() {
        try {
            var result = (FinalClone) super.clone();
            System.out.println(result.normalSimpleClone);
            System.out.println(normalSimpleClone);
            //result.normalSimpleClone = normalSimpleClone.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
    }
}
