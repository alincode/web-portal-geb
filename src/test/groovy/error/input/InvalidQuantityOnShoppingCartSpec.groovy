package error.input

import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class InvalidQuantityOnShoppingCartSpec extends GebReportingSpec {

    def "Go to shopping cart page."() {
        expect: true
    }
    
    def "input max number 99 Quantity on small packet."() {
        expect: true
    }

    def "input max number 99 Quantity on Regular packet."() {
        expect: true
    }

    def "input max number 99 Quantity on Large packet."() {
        expect: true
    }

    def "input max number 99 Quantity on Xlarge packet."() {
        expect: true
    }

    def "Verify Step 2 to Step 5 may not successfully."() {
        expect: true
    }
}