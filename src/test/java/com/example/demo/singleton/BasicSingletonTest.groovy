package com.example.demo.singleton

import spock.lang.Specification

import java.lang.reflect.Constructor

class BasicSingletonTest extends Specification {

    def "Spock 싱글톤 "(){
        when:
        def BasicSingleton= BasicSingleton.getInstance();
        BasicSingleton.setValue(111)
        def BasicSingleton2= BasicSingleton.getInstance();
        BasicSingleton2.setValue(222)

        EnumSet
        // 테스트 결과 검증

        then:
        BasicSingleton == BasicSingleton2
        BasicSingleton.getValue() == BasicSingleton2.getValue()
    }

    def "Spock 싱글톤 reflection breaker"(){
        when:
        def BasicSingleton= BasicSingleton.getInstance();
        BasicSingleton.setValue(111)
        def constructors = BasicSingleton.class.getDeclaredConstructor()

        def BasicSingleton2= BasicSingleton.getInstance();
        BasicSingleton2.setValue(222)
        def constructors2 = BasicSingleton2.class.getDeclaredConstructor()

        def singleTon1
        def singleTon2

        for (Constructor constructor : constructors) {
            constructor.setAccessible(true); // singleton breaker
            singleTon1 = constructor.newInstance()
            break;
        }
        for (Constructor constructor : constructors2) {
            constructor.setAccessible(true); // singleton breaker
            singleTon2 = constructor.newInstance()
            break;
        }
        then:
        singleTon1 != singleTon2

    }

}
