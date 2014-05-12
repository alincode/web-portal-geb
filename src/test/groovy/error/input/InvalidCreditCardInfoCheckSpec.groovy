package error.input

import geb.spock.GebReportingSpec

import spock.lang.Stepwise

@Stepwise
class InvalidCreditCardInfoCheckSpec extends GebReportingSpec {

    // 14404
    def "Input invalid Credit card number"() {
        expect: true
    }
    
    def "Input invalid Expiration Date. (under 2013)"() {
        expect: true
    }
}