package com.example.demo.singleton;

public class InitOnDemandHolder {

    /*
    *  Initialization-on-demand-holder idiom 이라고 부른다.
    *  즉, java에서 클래스 안의 클래스
    *  즉, 중첩 클래스(Impl)은 getInstance() 가실행되기 전까지는 참조 되지 않는다.
    *  그렇기 때문에 LazySingleton 기능을 수행 한다. 또한 Holder에 선언된 INSTANCE가
    *  static으로 선언 되어있기 때문에 클래스 로딩 시점에 한 번만 호출되고 final을 써서 다시 값이 할당 되지 않는다.
    *  그렇기 때문에 thread-safety역시 충족 시킨다. 현재로서는 가장 많이 사용되고 있는 싱글톤 패턴이다.
    */
    private InitOnDemandHolder() {}

    private static class Holder{
        private static final InitOnDemandHolder INSTANCE = new InitOnDemandHolder();
    }

    public static InitOnDemandHolder getInstance() {
        return Holder.INSTANCE;
    }
}
