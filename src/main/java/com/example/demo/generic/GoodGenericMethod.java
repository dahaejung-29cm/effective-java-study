package com.example.demo.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.UnaryOperator;

public class GoodGenericMethod {


    public static void main(String[] args) {
        Set<String> s = Set.of("A","B","C");
        Set<Integer> s2 = Set.of(1,2,3);

        System.out.println("===============GOOD==============");
        Set<String> s3 = Set.of("A","B","C");
        Set<String> s4 = Set.of("E","F","G");
        Set<String> setTest2 = goodUnion(s3, s4);


        Iterator<String> it2 = setTest2.iterator();
        while (it2.hasNext()) {
            String a = it2.next();
        }
        //Set<String> setTest3 = goodUnion(s2, s4);



        Set<Integer> n1 = Set.of(1, 2, 3);
        Set<Double> n2 = Set.of(4.5D, 5.2D, 6D);

        //좀더 유연하게 사용하고싶다면...

        Set<Number> n3 = GoodGenericMethod.<Number>pci(n1, n2);
        //Set<? extends Number> n4 = pci2(n1, n2);
        Iterator<Number> it3 = n3.iterator();
        System.out.println("here");
        while (it3.hasNext()) {
            Number nn = it3.next();
            System.out.println("nn " + nn.intValue());
        }
    }

    public static <E> Set<E> goodUnion(Set<E> s1, Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static <E> Set<E> pci(Set<? extends E> s1, Set< ?extends E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static <E> Set<? extends E> pci2(Set<? extends E> s1, Set< ?extends E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

}
