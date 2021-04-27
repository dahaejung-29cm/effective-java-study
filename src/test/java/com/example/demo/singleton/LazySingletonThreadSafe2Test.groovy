package com.example.demo.singleton

import spock.lang.Specification

class LazySingletonThreadSafe2Test extends Specification {

    def "Lazy 싱글톤 "(){
        when:
        def lazySingleton= LazySingleton.getInstance();
        def lazySingleton2= LazySingleton.getInstance();

        // 테스트 결과 검증
        then:
        lazySingleton == lazySingleton2
    }
}
