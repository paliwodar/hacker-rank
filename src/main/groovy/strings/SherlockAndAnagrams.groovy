package strings

/**
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem
 */
class SherlockAndAnagrams {

    static def countAnagrams(String input) {
        def subs = []

        for (int i = 0; i <= input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                subs.add(input.substring(i, j))
            }
        }

        return subs.collect { String str -> str.toList().sort().join("") }
                   .groupBy { it }
                   .collect { it.value.size() }
                   .findAll { it > 1 }
                   .collect { it * (it - 1) / 2 }
                   .sum()
    }


    static void main(String... args) {
        System.in.readLines().drop(1).each {
            println countAnagrams(it)
        }
    }
}






