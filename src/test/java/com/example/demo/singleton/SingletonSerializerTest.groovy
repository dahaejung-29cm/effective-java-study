package com.example.demo.singleton

import spock.lang.Specification

class SingletonSerializerTest extends Specification {

    def "Spock serializer "(){
        when:
        def basicSingleton= BasicSingleton.getInstance();
        basicSingleton.setValue(111)
        //serialize
        String fileName = "singleton.bin"
        SingletonSerializer.saveToFile(basicSingleton, fileName)
        basicSingleton.setValue(222)
        //deserialize
        def basicSingleton2 = SingletonSerializer.readFromFile(fileName);

        // 테스트 결과 검증
        then:
        basicSingleton != basicSingleton2
        basicSingleton.getValue() != basicSingleton2.getValue()
    }
}
