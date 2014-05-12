package requirement

import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class RegistrationSpec extends GebReportingSpec {

    def "Go to WEB Portal then Registrar name and valid email account."() {
        expect: true
    }
    
    def "Then check the email account and Received an email Registration info from Cloud WEB Site."() {
        expect: false
    }
}