package com.example.demo.generic.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Delayed;
import java.util.concurrent.Future;

public class Demo {

    Object data;
    public Demo(Object data) {this.data = data;}
    public Object getData() {return data;}

    public static void main(String[] args) {
        Demo a = new Demo(1);
        Demo b = new Demo("1");

        int c = (int) a.getData();
        String d = (String) b.getData();

        //아래에서 위로 주입 가능
        Integer[] aa ={};
        Number[] aaa = aa;

        //위에서 아래 주입 불가능
        Number[] aa2 ={};
        //Integer[] aaa2 = aa2;

    }
}
