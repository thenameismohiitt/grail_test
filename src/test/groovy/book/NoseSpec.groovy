package book

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class NoseSpec extends Specification implements DomainUnitTest<Nose> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
