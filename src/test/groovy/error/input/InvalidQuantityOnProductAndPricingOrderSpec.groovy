package error.input

import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class InvalidQuantityOnProductAndPricingOrderSpec extends GebReportingSpec {

    def "Go to Price and Plan page."() {
        expect: true
    }
    
    def "Small packet input max number of Quantity 9999 then click order."() {
        expect: true
    }

    def "Regular packet input max number of Quantity 9999 then click order."() {
        expect: true
    }

    def "Large packet input max number of Quantity 9999 then click order."() {
        expect: true
    }

    def "XLarge packet input max number of Quantity 9999 then click order."() {
        expect: true
    }

    def "Verify Step 2 to step 5 may not successfully."() {
        expect: true
    }

}