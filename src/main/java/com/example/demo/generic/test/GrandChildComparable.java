package com.example.demo.generic.test;

public class GrandChildComparable extends ChildNoComparable implements Comparable<GrandChildComparable>{

    @Override
    public int compareTo(GrandChildComparable o) {
        return 0;
    }
}
