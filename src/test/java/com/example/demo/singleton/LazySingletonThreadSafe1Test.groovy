package com.example.demo.singleton

import org.junit.jupiter.api.Test
import spock.lang.Specification

class LazySingletonThreadSafe1Test extends Specification {

    def "Lazy 싱글톤 "(){
        when:
        def lazySingleton= LazySingletonThreadSafe1.getInstance();
        def lazySingleton2= LazySingletonThreadSafe1.getInstance();

        // 테스트 결과 검증
        then:
        lazySingleton == lazySingleton2
    }
}
