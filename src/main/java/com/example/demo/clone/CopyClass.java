package com.example.demo.clone;

public class CopyClass {

    private int a;
    private NormalSimpleClone normalSimpleClone;

    public CopyClass(int a, NormalSimpleClone normalSimpleClone) {
        this.a = a;
        this.normalSimpleClone = normalSimpleClone;
    }

    public static CopyClass newInstance(CopyClass copyClass) {
        return new CopyClass(copyClass.a, new NormalSimpleClone(copyClass.normalSimpleClone.getA()));
    }

    public CopyClass(CopyClass copyClass) {
        a = copyClass.a;
        normalSimpleClone = new NormalSimpleClone(copyClass.normalSimpleClone.getA());
    }
}
