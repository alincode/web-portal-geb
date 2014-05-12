package error.input

import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class InvalidAccountLoginWebSiteSpec extends GebReportingSpec {

    def "Input invalid email address and valid password login."() {
        expect: true
    }
    
    def "Input valid email address and invalid password login."() {
        expect: true
    }

    def "Input invalid email address and invalid password login."() {
        expect: true
    }

    def "Verify all step cannot login successfully."() {
        expect: true
    }

}