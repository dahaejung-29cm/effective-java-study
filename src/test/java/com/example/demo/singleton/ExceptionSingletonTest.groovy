package com.example.demo.singleton

import spock.lang.Specification

class ExceptionSingletonTest extends Specification {

    def "Constructor Exception Singleton "(){
        when:
        def basicSingleton= ExceptionSingleton.getInstance();
        //deserialize
        def basicSingleton2 = ExceptionSingleton.getInstance();

        // 테스트 결과 검증
        then:
        basicSingleton == basicSingleton2
    }
}
