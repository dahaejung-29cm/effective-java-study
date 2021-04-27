package com.example.demo.builder

import com.example.demo.singleton.BasicSingleton
import spock.lang.Specification

class MyPizzaTest extends Specification {

    def "Covariant return typing"(){
        when:
        def myPizza = new MyPizza.Builder(MyPizza.Size.SMALL)
        .addTopping(Pizza.Topping.MUSHROOM)
        .addTopping(Pizza.Topping.ONION)
        .build()

        def yourPizza = new YourPizza.Builder()
        .addTopping(Pizza.Topping.MUSHROOM)
        .sauceInside()
        .build()
        // 테스트 결과 검증
        then:
        myPizza.toppings.size() == 2
        yourPizza.toppings.size() == 1
    }
}
