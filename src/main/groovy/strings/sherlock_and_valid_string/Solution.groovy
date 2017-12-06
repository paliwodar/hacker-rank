package strings.sherlock_and_valid_string

/**
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
 */
class Solution {

    static def isValid(String input) {

        def frequencies = input.toList().groupBy { it }
                               .collect { it.value.size() }

        if (isEven(frequencies)) {
            return true
        }

        for (int i = 0; i < frequencies.size(); i++) {
            def copy = frequencies.collect()

            if (copy[i] > 1) {
                copy[i]--
            } else {
                copy.removeAt(i)
            }
            if (isEven(copy)) {
                return true
            }
        }
        return false
    }

    static def isEven(list) {
        list.sum() == list.size() * list.min()
    }

}


