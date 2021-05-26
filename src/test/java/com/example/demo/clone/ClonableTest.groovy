package com.example.demo.clone

import com.example.demo.singleton.LazySingleton
import spock.lang.Specification

class ClonableTest extends Specification {

    def "1. Clonable을 상속받지 않고 clone을 사용하는경우"(){
        when:
        def test=  new ExceptionClone()
        test.clone()
        // 테스트 결과 검증
        then:
        thrown CloneNotSupportedException
    }

    def "2. 상위 클래스가 clone을 생성자로 구현"(){
        when:
        def test=  new SubClone(1)
        def test2 = test.clone()
        // 테스트 결과 검증
        then:
        thrown ClassCastException
    }

    def "3. 상위 클래스가 clone을 super clone으로 구현"(){
        when:
        def test=  new SubClone2(1)
        def test2 = test.clone()
        // 테스트 결과 검증
        then:
        test2 instanceof SubClone2 == true
    }

    def "4. 정상 심플 클론"(){
        when:
        def test=  new NormalSimpleClone(1)
        def test2 = test.clone()
        // 테스트 결과 검증
        then:
        test != test2
        test.a == test2.a
    }

    def "5. 객체참조 비정상 클론"(){
        when:
        def test=  new UnCompleteStack()
        def test2 = test.clone()
        // 테스트 결과 검증
        then:
        test != test2
    }

    def "6. 객체참조 정상 클론"(){
        when:
        def test=  new CompleteStack()
        def test2 = test.clone()
        // 테스트 결과 검증
        then:
        test != test2
    }

    def "7. 파이널 클론"(){
        when:
        def test=  new FinalClone('haha', 2, new NormalSimpleClone(2))
        def test2 = test.clone()
        // 테스트 결과 검증
        then:
        test != test2
    }

    def "8. 상속 클래스의 위험성"(){
        when:
        def test=  new ChildClass()
        def test2 = test.clone()
        // 테스트 결과 검증
        then:
        test != test2
        test2.a == 3
    }

}
