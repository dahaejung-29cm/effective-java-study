package com.example.demo.singleton

import spock.lang.Specification

class EnumSingletonSerializerTest extends Specification {

    def "Enum Singleton Serializer "(){

        when:
        String filename = "myfile.bin";
        EnumSingleton s1 = EnumSingleton.INSTANCE;
        s1.setValue(111);
        EnumSingletonSerializer.saveToFile(s1, filename);

        EnumSingleton s2 = EnumSingletonSerializer.readFromFile(filename);

        then:
        s1 == s2
        s1.getValue() == 111
    }

    def "Enum Singleton Serializer 2 "(){

        when:
        String filename = "myfile.bin";
        EnumSingleton s1 = EnumSingleton.INSTANCE;
        EnumSingletonSerializer.saveToFile(s1, filename);

        EnumSingleton s2 = EnumSingletonSerializer.readFromFile(filename);

        then:
        s1 == s2
        s2.getValue() == 42
    }
}
