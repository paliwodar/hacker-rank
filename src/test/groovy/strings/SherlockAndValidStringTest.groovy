package strings

import spock.lang.Specification
import spock.lang.Unroll

class SherlockAndValidStringTest extends Specification {

    @Unroll
    def "example tests"() {
        expect:
        SherlockAndValidString.isValid(input) == expectedOutput

        where:
        input    | expectedOutput
        "aabbcd" | false
        "aabbcc" | true
        "baaccd" | false
        "abcccc" | false
    }

    @Unroll
    def "more tests"() {
        expect:
        SherlockAndValidString.isValid(input) == expectedOutput

        where:
        input      | expectedOutput
        "aaaabbcd" | false
        "aabbcc"   | true
        "abbac"    | true
        "ccccc"    | true
        "ccccca"   | true
    }
}
