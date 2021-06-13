package com.example.demo.generic

import spock.lang.Specification

class GenericMethodTest extends Specification {

    def "BadMethod"(){
        given:
        Set<String> s = Set.of("A","B","C");
        Set<Integer> s2 = Set.of(1,2,3);
        Set<Integer> setTest = BadRawMethod.badUnion(s, s2);
        Iterator<Integer> it = setTest.iterator();
        when:
        while (it.hasNext()) {
            Integer a = it.next(); // throw ClassCastException
        }

        then:
        thrown ClassCastException
    }
}
