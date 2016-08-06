package com.guz.integration

import spock.lang.Specification

class SpockIntegrationNotWorkingSpec extends Specification{

    def "Should not work"() {
        when:
            def sum = 5
            throw new RuntimeException()

        then:
            sum == 5
    }
}
