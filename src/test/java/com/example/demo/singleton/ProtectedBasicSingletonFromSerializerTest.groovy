package com.example.demo.singleton

import spock.lang.Specification

class ProtectedBasicSingletonFromSerializerTest extends Specification {

    def "Spock serializer safe "(){
        when:
        def basicSingleton= ProtectedBasicSingletonFromSerializer.getInstance();
        basicSingleton.setValue(111)
        //serialize
        String fileName = "singleton.bin"
        SingletonSerializer2.saveToFile(basicSingleton, fileName)
        basicSingleton.setValue(222)
        //deserialize
        def basicSingleton2 = SingletonSerializer2.readFromFile(fileName);

        // 테스트 결과 검증
        then:
        basicSingleton == basicSingleton2
        basicSingleton.getValue() == basicSingleton2.getValue()
    }
}
