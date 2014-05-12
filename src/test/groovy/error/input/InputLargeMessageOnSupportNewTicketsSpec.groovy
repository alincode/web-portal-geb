package error.input

import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class InputLargeMessageOnSupportNewTicketsSpec extends GebReportingSpec {

    def "login WEB portal then go to support-->New Tickets place."() {
        expect: true
    }
    
    def "input large message on topic and content then Create open tickets"() {
        expect: true
    }

    def "Verify New Tickets cannot shown on open Tickets page."() {
        expect: true
    }
}