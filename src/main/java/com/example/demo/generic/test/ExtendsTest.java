package com.example.demo.generic.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ExtendsTest {

    public static void main(String[] args) {

        /*
        *  super
        *  - Child기준으로 Parent(상위) GrandChild다 넣을 수 있음
        *  extends
        *  - Child기준으로 Parent(상위 불가) GrandChild(하위 가능)
        * */
        List<Parent> parents = Arrays.asList(new Parent());
        //test(parents);
        superTest(parents);
        List<GrandChild> grandChildren = Arrays.asList(new GrandChild());
        test(grandChildren);
        superTest2(parents);

        List<ChildItf> s =  Arrays.asList();
        List<ParentItf> p =  Arrays.asList();
        //test2(p);
        superTest2(p);
        List<GrandChildItf> g =  Arrays.asList();
        test2(s);
        superTest2(s);

        List<Child> children = Arrays.asList(new Child());
        test2(children);
        superTest2(children);

        List<GrandChildComparable> grandChildComparables = Arrays.asList(new GrandChildComparable());
        //test3(GrandChild);
        test4(grandChildComparables);
    }

    public static <E extends Child> E test(Collection<? extends E> c) {

        E result = null;
        return result;
    }

    public static <E extends Child> E superTest(Collection<? super E> c) {

        E result = null;
        return result;
    }

    public static <E extends ChildItf> E test2(Collection<? extends E> c) {

        E result = null;
        return result;
    }

    public static <E extends ChildItf> E superTest2(Collection<? super E> c) {

        E result = null;
        return result;
    }

    public static <E extends Comparable<? super E>> E test3(Collection<? extends E> c) {

        E result = null;
        return result;
    }

    public static <E extends Comparable<E>> E test4(Collection<E> c) {

        E result = null;
        return result;
    }
}
