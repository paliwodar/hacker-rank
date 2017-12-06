package strings

import spock.lang.Specification
import spock.lang.Unroll

class SherlockAndAnagramsTest extends Specification {

    @Unroll
    def "test"() {
        expect:
        SherlockAndAnagrams.countAnagrams(input) == expected

        where:
        input        | expected
        "ifailuhkqq" | 3
        "hucpoltgty" | 2
        "ovarjsnrbf" | 2
        "pvmupwjjjf" | 6
        "iwwhrlkpek" | 3
        "abba"       | 4
    }

}
