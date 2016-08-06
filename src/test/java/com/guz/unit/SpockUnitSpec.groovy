package com.guz.unit

import spock.lang.Specification

class SpockUnitSpec extends Specification {

    def "Should work"() {
        expect:
            sum == result

        where:
            sum | result
            2+3 |   5
    }
}
