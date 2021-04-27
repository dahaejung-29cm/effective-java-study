package com.example.demo.supplier

import spock.lang.Specification

class SupplierExampleTest extends Specification {

    def "Supplier Test"(){
        when:
        SupplierExample.checkValue(-1, { -> SupplierExample.getValue() })
        SupplierExample.checkValue(-2, { -> SupplierExample.getValue() })
        SupplierExample.checkValue(3, { -> SupplierExample.getValue() })
        SupplierExample.checkValue(4, { -> SupplierExample.getValue() })

        then:
        1==1
    }
}
