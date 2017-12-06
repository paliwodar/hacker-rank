package strings.sherlock_and_valid_string

import spock.lang.Specification
import spock.lang.Unroll

class SolutionTest extends Specification {

    @Unroll
    def "example tests"() {
        expect:
        Solution.isValid(input) == expectedOutput

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
        Solution.isValid(input) == expectedOutput

        where:
        input      | expectedOutput
        "aaaabbcd" | false
        "aabbcc"   | true
        "abbac"    | true
        "ccccc"    | true
        "ccccca"   | true
    }
}
