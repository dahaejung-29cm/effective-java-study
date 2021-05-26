package com.example.demo.comparable

import com.example.demo.clone.ChildClass
import spock.lang.Specification

class ComparableTest extends Specification {

    def "1. String 클래"(){
        when:
        Set<String> s = new TreeSet<>();
        Collections.addAll(s, "D", "B", "C")
        // 테스트 결과 검증
        then:
        println s
        1 == 1
    }

    def "2. compareTo vs equals"(){
        when:
        BigDecimal bigDecimal1 = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("1.00");

        Set<BigDecimal> hashSet = new HashSet<>();
        Set<BigDecimal> treeSet = new TreeSet<>();
        hashSet.add(bigDecimal1);
        hashSet.add(bigDecimal2);

        treeSet.add(bigDecimal1);
        treeSet.add(bigDecimal2);

        // 테스트 결과 검증
        then:
        hashSet.size() == 2
        treeSet.size() == 1
    }

    //given


    //when

}
