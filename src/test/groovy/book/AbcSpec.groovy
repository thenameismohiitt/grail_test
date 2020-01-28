package book

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class AbcSpec extends Specification implements DomainUnitTest<Abc> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
