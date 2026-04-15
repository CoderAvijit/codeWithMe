import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

/**
 * Unit tests for StreamProblems.java
 *
 * HOW TO USE:
 *   1. Implement a method in StreamProblems.java
 *   2. Uncomment the corresponding method name in the ENABLED set below
 *   3. Run the tests — only enabled tests execute; all others are skipped (not failed)
 *
 * REQUIRES: JUnit 5 (junit-jupiter) on the classpath.
 *   Maven dependency:
 *     <dependency>
 *       <groupId>org.junit.jupiter</groupId>
 *       <artifactId>junit-jupiter</artifactId>
 *       <version>5.10.2</version>
 *       <scope>test</scope>
 *     </dependency>
 */
public class StreamProblemsTest {

    // =========================================================
    //  ENABLED SET — uncomment a method name once you implement it
    // =========================================================
    private static final Set<String> ENABLED = new HashSet<>(Arrays.asList(
        // "findWordWithHighestLength",        // 01
        // "removeDuplicates",                 // 02
        // "findWordWithSecondHighestLength",  // 03
        // "find2ndHighestLengthWord",         // 04
        // "wordOccurrences",                  // 05
        // "wordsWithVowelCount",              // 06
        // "divideEvenOdd",                    // 07
        // "charOccurrences",                  // 08
        // "sortNumbers",                      // 09
        // "sumOfUniqueElements",              // 10
        // "firstNonRepeatedChar",             // 11
        // "firstRepeatedChar",                // 12
        // "groupByRange",                     // 13
        // "extractIntegers",                  // 14
        // "productOfFirstTwo",                // 15
        // "groupAnagrams",                    // 16
        // "multiplyAlternativeNumbers",       // 17
        // "multiplySymmetricElements",        // 18
        // "moveZerosToBeginning",             // 19
        // "hasDistinctValues",                // 20
        // "groupByMiddleChar",                // 21
        // "sumOfAllElements",                 // 22
        // "sortAlphabetically",               // 23
        // "squareNumbers",                    // 24
        // "distinctOddNumbers",               // 25
        // "union",                            // 26
        // "kthSmallest",                      // 27
        // "removeNonNumericChars",            // 28
        // "stringsContainingOnlyDigits",      // 29
        // "toUpperCase",                      // 30
        // "calculateAverage",                 // 31
        // "intersection",                     // 32
        // "domainOccurrences",                // 33
        // "fibonacci",                        // 34
        // "squareNumbersToArray",             // 35
        // "transformPersonsToString",         // 36
        // "groupByFirstCharAndCount",         // 37
        // "listToMap",                        // 38
        // "multiplyAllElements",              // 39
        // "canReuseStream",                   // 40
        // "toUpperCaseAndConcat",             // 41
        // "getAllWordsUsingFlatMap",           // map vs flatMap
        // "concatenateStreams",               // 42
        // "avoidComplexPipeline",             // 44
        // "filterReductionAverageMin",        // 45
        // "avoidStreamReuse",                 // 46
        // "limitInfiniteStream",              // 47
        // "avgAgeByGender",                   // avg age by gender
        // "middleCharacter",                  // 48
        // "distinctNumbersStartingWith1",     // 49
        // "filterAndModifySalary",            // 50
        // "personComparator",                 // 51
        // "countSubstring",                   // 52
        // "departmentWithMaxPeople",          // 53
        // "avgSalaryByDepartment",            // 54
        // "reorderChronologically",           // 55
        // "charWithMaxFrequency",             // 56
        // "stringToLengthMap",               // 57
        // "transformToDTO"                   // 58
    ));

    // =========================================================
    // Shared test data
    // =========================================================

    private static final List<StreamProblems.Employee> EMPLOYEES = Arrays.asList(
        new StreamProblems.Employee("Alice",   "Engineering", "Female", 80000.0, 30),
        new StreamProblems.Employee("Bob",     "Engineering", "Male",   90000.0, 35),
        new StreamProblems.Employee("Charlie", "Engineering", "Male",   75000.0, 28),
        new StreamProblems.Employee("Carol",   "HR",          "Female", 60000.0, 25),
        new StreamProblems.Employee("Dave",    "HR",          "Male",   70000.0, 40)
    );

    // =========================================================
    // Helper
    // =========================================================
    private static void skip(String method) {
        assumeTrue(ENABLED.contains(method), "Skipping '" + method + "' — not yet in ENABLED set");
    }

    // =========================================================
    // Tests
    // =========================================================

    // 01: Given a sentence, find the word that has the highest length
    @Test
    @DisplayName("01 - Find word with highest length")
    void test_findWordWithHighestLength() {
        skip("findWordWithHighestLength");
        assertEquals("programming",
            StreamProblems.findWordWithHighestLength("I love programming in Java"));
        assertEquals("Java",
            StreamProblems.findWordWithHighestLength("Java is fun"));
    }

    // 02: Remove duplicates from the list and return in the same order
    @Test
    @DisplayName("02 - Remove duplicates preserving order")
    void test_removeDuplicates() {
        skip("removeDuplicates");
        assertEquals(Arrays.asList("apple", "banana", "cherry"),
            StreamProblems.removeDuplicates(Arrays.asList("apple", "banana", "apple", "cherry", "banana")));
        assertEquals(Arrays.asList("a", "b", "c"),
            StreamProblems.removeDuplicates(Arrays.asList("a", "b", "a", "c", "b")));
    }

    // 03: Find the word that has the second highest length
    @Test
    @DisplayName("03 - Find word with second highest length")
    void test_findWordWithSecondHighestLength() {
        skip("findWordWithSecondHighestLength");
        // "programming"=11, "JavaScript"=10, "love"=4 -> second highest = "JavaScript"
        assertEquals("JavaScript",
            StreamProblems.findWordWithSecondHighestLength("I love programming in JavaScript"));
    }

    // 04: Find the 2nd highest length word (Optional)
    @Test
    @DisplayName("04 - Find 2nd highest length word as Optional")
    void test_find2ndHighestLengthWord() {
        skip("find2ndHighestLengthWord");
        Optional<String> result = StreamProblems.find2ndHighestLengthWord("I love programming in JavaScript");
        assertTrue(result.isPresent());
        assertEquals("JavaScript", result.get());
        // Single-word sentence – no second word
        assertEquals(Optional.empty(),
            StreamProblems.find2ndHighestLengthWord("Hello"));
    }

    // 05: Find the occurrence of each word in a sentence
    @Test
    @DisplayName("05 - Word occurrences in a sentence")
    void test_wordOccurrences() {
        skip("wordOccurrences");
        Map<String, Long> result = StreamProblems.wordOccurrences("the quick brown fox the quick");
        assertEquals(2L, result.get("the"));
        assertEquals(2L, result.get("quick"));
        assertEquals(1L, result.get("brown"));
        assertEquals(1L, result.get("fox"));
    }

    // 06: Find words with a specified number of vowels
    @Test
    @DisplayName("06 - Words with specified vowel count")
    void test_wordsWithVowelCount() {
        skip("wordsWithVowelCount");
        // "apple"=2(a,e), "orange"=3(o,a,e), "banana"=3(a,a,a)
        List<String> result = StreamProblems.wordsWithVowelCount("apple orange banana", 3);
        assertTrue(result.containsAll(Arrays.asList("orange", "banana")));
        assertFalse(result.contains("apple"));
    }

    // 07: Divide list into even and odd groups
    @Test
    @DisplayName("07 - Divide into even and odd lists")
    void test_divideEvenOdd() {
        skip("divideEvenOdd");
        Map<Boolean, List<Integer>> result =
            StreamProblems.divideEvenOdd(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(Arrays.asList(2, 4, 6), result.get(true));
        assertEquals(Arrays.asList(1, 3, 5), result.get(false));
    }

    // 08: Find occurrence of each character in a word
    @Test
    @DisplayName("08 - Character occurrences in a word")
    void test_charOccurrences() {
        skip("charOccurrences");
        Map<Character, Long> result = StreamProblems.charOccurrences("hello");
        assertEquals(1L, result.get('h'));
        assertEquals(1L, result.get('e'));
        assertEquals(2L, result.get('l'));
        assertEquals(1L, result.get('o'));
    }

    // 09: Sort numbers ascending and descending
    @Test
    @DisplayName("09 - Sort numbers ascending and descending")
    void test_sortNumbers() {
        skip("sortNumbers");
        assertEquals(Arrays.asList(1, 2, 5, 8, 9),
            StreamProblems.sortNumbers(Arrays.asList(5, 2, 8, 1, 9), true));
        assertEquals(Arrays.asList(9, 8, 5, 2, 1),
            StreamProblems.sortNumbers(Arrays.asList(5, 2, 8, 1, 9), false));
    }

    // 10: Sum of unique (non-duplicate) elements
    @Test
    @DisplayName("10 - Sum of unique elements")
    void test_sumOfUniqueElements() {
        skip("sumOfUniqueElements");
        // 1+2+3+2+4+3 -> duplicates: 2,3; unique: 1,4 -> sum=5
        assertEquals(5, StreamProblems.sumOfUniqueElements(Arrays.asList(1, 2, 3, 2, 4, 3)));
        // All unique
        assertEquals(10, StreamProblems.sumOfUniqueElements(Arrays.asList(1, 2, 3, 4)));
    }

    // 11: First non-repeated character
    @Test
    @DisplayName("11 - First non-repeated character")
    void test_firstNonRepeatedChar() {
        skip("firstNonRepeatedChar");
        // "swiss" -> s(3), w(1), i(1) -> first non-repeated = 'w'
        assertEquals(Optional.of('w'), StreamProblems.firstNonRepeatedChar("swiss"));
        assertEquals(Optional.of('j'), StreamProblems.firstNonRepeatedChar("java"));
        assertEquals(Optional.empty(), StreamProblems.firstNonRepeatedChar("aabb"));
    }

    // 12: First repeated character
    @Test
    @DisplayName("12 - First repeated character")
    void test_firstRepeatedChar() {
        skip("firstRepeatedChar");
        assertEquals(Optional.of('s'), StreamProblems.firstRepeatedChar("swiss"));
        assertEquals(Optional.of('a'), StreamProblems.firstRepeatedChar("java"));
        assertEquals(Optional.empty(), StreamProblems.firstRepeatedChar("abcd"));
    }

    // 13: Group numbers by range
    @Test
    @DisplayName("13 - Group numbers by range")
    void test_groupByRange() {
        skip("groupByRange");
        Map<String, List<Integer>> result =
            StreamProblems.groupByRange(Arrays.asList(5, 15, 25, 8, 12, 35), 10);
        assertTrue(result.get("0-9").containsAll(Arrays.asList(5, 8)));
        assertTrue(result.get("10-19").containsAll(Arrays.asList(15, 12)));
        assertTrue(result.get("20-29").contains(25));
        assertTrue(result.get("30-39").contains(35));
    }

    // 14: Extract integers from a mixed list of strings
    @Test
    @DisplayName("14 - Extract integers from list of strings")
    void test_extractIntegers() {
        skip("extractIntegers");
        assertEquals(Arrays.asList(1, 2, 3),
            StreamProblems.extractIntegers(Arrays.asList("1", "abc", "2", "xyz", "3")));
    }

    // 15: Product of first two elements
    @Test
    @DisplayName("15 - Product of first two elements")
    void test_productOfFirstTwo() {
        skip("productOfFirstTwo");
        assertEquals(15L, StreamProblems.productOfFirstTwo(Arrays.asList(3, 5, 7, 2)));
        assertEquals(6L,  StreamProblems.productOfFirstTwo(Arrays.asList(2, 3)));
    }

    // 16: Group anagrams
    @Test
    @DisplayName("16 - Group anagrams")
    void test_groupAnagrams() {
        skip("groupAnagrams");
        Map<String, List<String>> result =
            StreamProblems.groupAnagrams(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat"));
        // "eat","tea","ate" share the key "aet"
        assertTrue(result.values().stream()
            .anyMatch(g -> g.containsAll(Arrays.asList("eat", "tea", "ate"))));
        // "tan","nat" share "ant"
        assertTrue(result.values().stream()
            .anyMatch(g -> g.containsAll(Arrays.asList("tan", "nat"))));
        // "bat" stands alone
        assertTrue(result.values().stream()
            .anyMatch(g -> g.contains("bat") && g.size() == 1));
    }

    // 17: Multiply alternative (even-indexed) numbers
    @Test
    @DisplayName("17 - Multiply alternative (even-index) numbers")
    void test_multiplyAlternativeNumbers() {
        skip("multiplyAlternativeNumbers");
        // [2, 3, 4, 5, 6] -> indices 0,2,4 -> 2*4*6 = 48
        assertEquals(48L, StreamProblems.multiplyAlternativeNumbers(Arrays.asList(2, 3, 4, 5, 6)));
        // [1, 2, 3] -> indices 0,2 -> 1*3 = 3
        assertEquals(3L, StreamProblems.multiplyAlternativeNumbers(Arrays.asList(1, 2, 3)));
    }

    // 18: Multiply symmetric elements
    @Test
    @DisplayName("18 - Multiply symmetric elements (1st*last, 2nd*2nd-last, ...)")
    void test_multiplySymmetricElements() {
        skip("multiplySymmetricElements");
        // [1, 2, 3, 4, 5] -> [1*5, 2*4, 3*3] = [5, 8, 9]
        assertEquals(Arrays.asList(5L, 8L, 9L),
            StreamProblems.multiplySymmetricElements(Arrays.asList(1, 2, 3, 4, 5)));
        // [2, 3, 4, 5] -> [2*5, 3*4] = [10, 12]
        assertEquals(Arrays.asList(10L, 12L),
            StreamProblems.multiplySymmetricElements(Arrays.asList(2, 3, 4, 5)));
    }

    // 19: Move all zeros to beginning
    @Test
    @DisplayName("19 - Move all zeros to beginning of array")
    void test_moveZerosToBeginning() {
        skip("moveZerosToBeginning");
        assertEquals(Arrays.asList(0, 0, 1, 2, 3),
            StreamProblems.moveZerosToBeginning(Arrays.asList(1, 0, 2, 0, 3)));
        assertEquals(Arrays.asList(0, 0, 0, 5),
            StreamProblems.moveZerosToBeginning(Arrays.asList(0, 5, 0, 0)));
    }

    // 20: Check if all values are distinct
    @Test
    @DisplayName("20 - Return true if array contains only distinct values")
    void test_hasDistinctValues() {
        skip("hasDistinctValues");
        assertTrue(StreamProblems.hasDistinctValues(Arrays.asList(1, 2, 3, 4)));
        assertFalse(StreamProblems.hasDistinctValues(Arrays.asList(1, 2, 2, 4)));
    }

    // 21: Group strings by their middle character
    @Test
    @DisplayName("21 - Group strings by middle character")
    void test_groupByMiddleChar() {
        skip("groupByMiddleChar");
        // "abc" -> middle='b', "xyz" -> middle='y', "aec" -> middle='e'
        Map<Character, List<String>> result =
            StreamProblems.groupByMiddleChar(Arrays.asList("abc", "xyz", "aec"));
        assertTrue(result.get('b').contains("abc"));
        assertTrue(result.get('y').contains("xyz"));
        assertTrue(result.get('e').contains("aec"));
    }

    // 22: Sum of all elements
    @Test
    @DisplayName("22 - Sum of all elements in a list")
    void test_sumOfAllElements() {
        skip("sumOfAllElements");
        assertEquals(15, StreamProblems.sumOfAllElements(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(0,  StreamProblems.sumOfAllElements(Collections.emptyList()));
    }

    // 23: Sort strings alphabetically
    @Test
    @DisplayName("23 - Sort list of strings alphabetically")
    void test_sortAlphabetically() {
        skip("sortAlphabetically");
        assertEquals(Arrays.asList("apple", "banana", "cherry"),
            StreamProblems.sortAlphabetically(Arrays.asList("banana", "apple", "cherry")));
    }

    // 24: Square each number in the list
    @Test
    @DisplayName("24 - Convert integers to their squares (List)")
    void test_squareNumbers() {
        skip("squareNumbers");
        assertEquals(Arrays.asList(1, 4, 9, 16),
            StreamProblems.squareNumbers(Arrays.asList(1, 2, 3, 4)));
    }

    // 25: Distinct odd numbers
    @Test
    @DisplayName("25 - Distinct odd numbers")
    void test_distinctOddNumbers() {
        skip("distinctOddNumbers");
        List<Integer> result =
            StreamProblems.distinctOddNumbers(Arrays.asList(1, 2, 3, 3, 5, 4, 1));
        assertEquals(3, result.size());
        assertTrue(result.containsAll(Arrays.asList(1, 3, 5)));
    }

    // 26: Union of two lists
    @Test
    @DisplayName("26 - Union of two lists (distinct elements from both)")
    void test_union() {
        skip("union");
        List<Integer> result =
            StreamProblems.union(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 4));
        assertEquals(4, result.size());
        assertTrue(result.containsAll(Arrays.asList(1, 2, 3, 4)));
    }

    // 27: kth smallest element
    @Test
    @DisplayName("27 - Find kth smallest element")
    void test_kthSmallest() {
        skip("kthSmallest");
        // [5,2,8,1,9] sorted -> [1,2,5,8,9]
        assertEquals(1, StreamProblems.kthSmallest(Arrays.asList(5, 2, 8, 1, 9), 1));
        assertEquals(2, StreamProblems.kthSmallest(Arrays.asList(5, 2, 8, 1, 9), 2));
        assertEquals(9, StreamProblems.kthSmallest(Arrays.asList(5, 2, 8, 1, 9), 5));
    }

    // 28: Remove non-numeric characters from each string
    @Test
    @DisplayName("28 - Remove non-numeric characters from strings")
    void test_removeNonNumericChars() {
        skip("removeNonNumericChars");
        List<String> result =
            StreamProblems.removeNonNumericChars(Arrays.asList("abc123", "456", "hello", "789xyz"));
        assertEquals(Arrays.asList("123", "456", "789"), result);
    }

    // 29: Strings containing only digits
    @Test
    @DisplayName("29 - Find strings containing only digits")
    void test_stringsContainingOnlyDigits() {
        skip("stringsContainingOnlyDigits");
        assertEquals(Arrays.asList("123", "456"),
            StreamProblems.stringsContainingOnlyDigits(
                Arrays.asList("123", "abc", "456", "12a")));
    }

    // 30: Convert strings to uppercase
    @Test
    @DisplayName("30 - Convert list of strings to uppercase")
    void test_toUpperCase() {
        skip("toUpperCase");
        assertEquals(Arrays.asList("HELLO", "WORLD"),
            StreamProblems.toUpperCase(Arrays.asList("hello", "world")));
    }

    // 31: Average of all numbers
    @Test
    @DisplayName("31 - Calculate average of all numbers")
    void test_calculateAverage() {
        skip("calculateAverage");
        assertEquals(3.0, StreamProblems.calculateAverage(Arrays.asList(1, 2, 3, 4, 5)), 0.001);
        assertEquals(2.5, StreamProblems.calculateAverage(Arrays.asList(1, 2, 3, 4)), 0.001);
    }

    // 32: Intersection of two lists
    @Test
    @DisplayName("32 - Intersection of two lists")
    void test_intersection() {
        skip("intersection");
        List<Integer> result =
            StreamProblems.intersection(Arrays.asList(1, 2, 3, 4), Arrays.asList(2, 3, 5));
        assertEquals(2, result.size());
        assertTrue(result.containsAll(Arrays.asList(2, 3)));
    }

    // 33: Occurrence of email domains
    @Test
    @DisplayName("33 - Occurrence of domains in email list")
    void test_domainOccurrences() {
        skip("domainOccurrences");
        Map<String, Long> result = StreamProblems.domainOccurrences(
            Arrays.asList("a@gmail.com", "b@yahoo.com", "c@gmail.com", "d@gmail.com"));
        assertEquals(3L, result.get("gmail.com"));
        assertEquals(1L, result.get("yahoo.com"));
    }

    // 34: Fibonacci sequence
    @Test
    @DisplayName("34 - Generate first n Fibonacci numbers")
    void test_fibonacci() {
        skip("fibonacci");
        assertEquals(Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L),
            StreamProblems.fibonacci(10));
        assertEquals(Arrays.asList(0L, 1L, 1L),
            StreamProblems.fibonacci(3));
    }

    // 35: Square numbers using IntStream / primitive arrays
    @Test
    @DisplayName("35 - Square numbers to primitive int[] using IntStream")
    void test_squareNumbersToArray() {
        skip("squareNumbersToArray");
        assertArrayEquals(new int[]{1, 4, 9, 16},
            StreamProblems.squareNumbersToArray(new int[]{1, 2, 3, 4}));
    }

    // 36: Transform Person stream to a single string
    @Test
    @DisplayName("36 - Transform Person list into a single string")
    void test_transformPersonsToString() {
        skip("transformPersonsToString");
        List<StreamProblems.Person> persons = Arrays.asList(
            new StreamProblems.Person("John", "Doe", 30),
            new StreamProblems.Person("Jane", "Smith", 25)
        );
        assertEquals("John Doe (30), Jane Smith (25)",
            StreamProblems.transformPersonsToString(persons));
    }

    // 37: Group by first character and count
    @Test
    @DisplayName("37 - Group strings by first character and count")
    void test_groupByFirstCharAndCount() {
        skip("groupByFirstCharAndCount");
        Map<Character, Long> result = StreamProblems.groupByFirstCharAndCount(
            Arrays.asList("apple", "avocado", "banana", "blueberry", "cherry"));
        assertEquals(2L, result.get('a'));
        assertEquals(2L, result.get('b'));
        assertEquals(1L, result.get('c'));
    }

    // 38: List to map (string -> length)
    @Test
    @DisplayName("38 - Convert list of strings to map of string -> length")
    void test_listToMap() {
        skip("listToMap");
        Map<String, Integer> result =
            StreamProblems.listToMap(Arrays.asList("hello", "java", "world"));
        assertEquals(5, result.get("hello"));
        assertEquals(4, result.get("java"));
        assertEquals(5, result.get("world"));
    }

    // 39: Product of all elements
    @Test
    @DisplayName("39 - Multiply all elements together")
    void test_multiplyAllElements() {
        skip("multiplyAllElements");
        assertEquals(24L, StreamProblems.multiplyAllElements(Arrays.asList(1, 2, 3, 4)));
        assertEquals(120L, StreamProblems.multiplyAllElements(Arrays.asList(1, 2, 3, 4, 5)));
    }

    // 40: Can we reuse a stream?
    @Test
    @DisplayName("40 - Streams cannot be reused (should return false)")
    void test_canReuseStream() {
        skip("canReuseStream");
        assertFalse(StreamProblems.canReuseStream());
    }

    // 41: Uppercase and concatenate all strings
    @Test
    @DisplayName("41 - Convert to uppercase and concatenate")
    void test_toUpperCaseAndConcat() {
        skip("toUpperCaseAndConcat");
        assertEquals("HELLOWORLD",
            StreamProblems.toUpperCaseAndConcat(Arrays.asList("hello", "world")));
        assertEquals("JAVA",
            StreamProblems.toUpperCaseAndConcat(Arrays.asList("java")));
    }

    // Difference between map and flatMap: extract all words from sentences using flatMap
    @Test
    @DisplayName("map vs flatMap - Extract all words from a list of sentences")
    void test_getAllWordsUsingFlatMap() {
        skip("getAllWordsUsingFlatMap");
        List<String> result = StreamProblems.getAllWordsUsingFlatMap(
            Arrays.asList("hello world", "foo bar", "java streams"));
        assertEquals(Arrays.asList("hello", "world", "foo", "bar", "java", "streams"), result);
    }

    // 42: Concatenate two streams
    @Test
    @DisplayName("42 - Concatenate 2 streams (lists)")
    void test_concatenateStreams() {
        skip("concatenateStreams");
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6),
            StreamProblems.concatenateStreams(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6)));
        assertEquals(Arrays.asList("a", "b", "c", "d"),
            StreamProblems.concatenateStreams(Arrays.asList("a", "b"), Arrays.asList("c", "d")));
    }

    // 44: Best Practices #1 – Avoid complex pipelines (count non-null strings with length > 3)
    @Test
    @DisplayName("44 - Best Practices #1: Avoid complex pipelines")
    void test_avoidComplexPipeline() {
        skip("avoidComplexPipeline");
        // "hello"(5), "hey"(3 not >3), "world"(5), null -> 2 strings have length > 3
        assertEquals(2L, StreamProblems.avoidComplexPipeline(
            Arrays.asList("hello", "hey", null, "world")));
    }

    // 45: Filter, reduction, average, min
    @Test
    @DisplayName("45 - Implement filter, reduction, average, min")
    void test_filterReductionAverageMin() {
        skip("filterReductionAverageMin");
        // Threshold=5 -> filtered=[6,7,8,9,10], sum=40, avg=8.0, min=6
        Map<String, Object> result = StreamProblems.filterReductionAverageMin(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5);
        assertEquals(Arrays.asList(6, 7, 8, 9, 10), result.get("filtered"));
        assertEquals(40,  result.get("sum"));
        assertEquals(8.0, (Double) result.get("average"), 0.001);
        assertEquals(6,   result.get("min"));
    }

    // 46: Best Practices #2 – Avoid stream reuse (returns even numbers)
    @Test
    @DisplayName("46 - Best Practices #2: Avoid re-using streams")
    void test_avoidStreamReuse() {
        skip("avoidStreamReuse");
        assertEquals(Arrays.asList(2, 4, 6),
            StreamProblems.avoidStreamReuse(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }

    // 47: Best Practices #3 – Limit infinite stream to generate first n even numbers
    @Test
    @DisplayName("47 - Best Practices #3: Limiting infinite streams")
    void test_limitInfiniteStream() {
        skip("limitInfiniteStream");
        assertEquals(Arrays.asList(0, 2, 4, 6, 8),
            StreamProblems.limitInfiniteStream(5));
        assertEquals(Arrays.asList(0, 2, 4),
            StreamProblems.limitInfiniteStream(3));
    }

    // Calculate average age of male and female employees
    @Test
    @DisplayName("avgAgeByGender - Average age of male and female employees")
    void test_avgAgeByGender() {
        skip("avgAgeByGender");
        // Female: Alice(30), Carol(25) -> avg 27.5
        // Male: Bob(35), Charlie(28), Dave(40) -> avg 34.33...
        Map<String, Double> result = StreamProblems.avgAgeByGender(EMPLOYEES);
        assertEquals(27.5,   result.get("Female"), 0.01);
        assertEquals(34.333, result.get("Male"),   0.01);
    }

    // 48: Middle character of a string
    @Test
    @DisplayName("48 - Print middle character of a string")
    void test_middleCharacter() {
        skip("middleCharacter");
        assertEquals('l', StreamProblems.middleCharacter("hello")); // index 2
        assertEquals('b', StreamProblems.middleCharacter("abc"));
        assertEquals('a', StreamProblems.middleCharacter("a"));
    }

    // 49: Distinct numbers starting with "1" in descending order
    @Test
    @DisplayName("49 - Distinct numbers starting with '1' in descending order")
    void test_distinctNumbersStartingWith1() {
        skip("distinctNumbersStartingWith1");
        // Input: [10, 1, 15, 12, 20, 15, 100]
        // Starts with '1': 10, 1, 15, 12, 15, 100 -> distinct: 100, 15, 12, 10, 1 (desc)
        assertEquals(Arrays.asList(100, 15, 12, 10, 1),
            StreamProblems.distinctNumbersStartingWith1(
                Arrays.asList(10, 1, 15, 12, 20, 15, 100)));
    }

    // 50: Filter employees by salary threshold and increase salary by 10%
    @Test
    @DisplayName("50 - Filter employees and increase salary by 10%")
    void test_filterAndModifySalary() {
        skip("filterAndModifySalary");
        // salary > 75000: Alice(80000->88000), Bob(90000->99000)
        List<StreamProblems.Employee> result =
            StreamProblems.filterAndModifySalary(EMPLOYEES, 75000);
        assertEquals(2, result.size());
        assertTrue(result.stream().anyMatch(e -> e.name.equals("Alice") && e.salary == 88000.0));
        assertTrue(result.stream().anyMatch(e -> e.name.equals("Bob")   && e.salary == 99000.0));
    }

    // 51: Comparator for Person by firstName then lastName
    @Test
    @DisplayName("51 - Person comparator: by firstName then lastName")
    void test_personComparator() {
        skip("personComparator");
        List<StreamProblems.Person> persons = Arrays.asList(
            new StreamProblems.Person("Zara",  "Ali",   20),
            new StreamProblems.Person("Alice", "Zhao",  30),
            new StreamProblems.Person("Alice", "Adams", 25)
        );
        persons.sort(StreamProblems.personComparator());
        assertEquals("Alice", persons.get(0).firstName);
        assertEquals("Adams", persons.get(0).lastName);
        assertEquals("Alice", persons.get(1).firstName);
        assertEquals("Zhao",  persons.get(1).lastName);
        assertEquals("Zara",  persons.get(2).firstName);
    }

    // 52: Count occurrences of a substring
    @Test
    @DisplayName("52 - Count occurrences of a substring")
    void test_countSubstring() {
        skip("countSubstring");
        assertEquals(2L, StreamProblems.countSubstring("hello world hello java", "hello"));
        assertEquals(3L, StreamProblems.countSubstring("ababab", "ab"));
        assertEquals(0L, StreamProblems.countSubstring("hello", "xyz"));
    }

    // 53: Department with the most employees
    @Test
    @DisplayName("53 - Find department with maximum number of employees")
    void test_departmentWithMaxPeople() {
        skip("departmentWithMaxPeople");
        // Engineering=3, HR=2 -> "Engineering"
        assertEquals("Engineering", StreamProblems.departmentWithMaxPeople(EMPLOYEES));
    }

    // 54: Average salary per department
    @Test
    @DisplayName("54 - Average salary from each department")
    void test_avgSalaryByDepartment() {
        skip("avgSalaryByDepartment");
        // Engineering: (80000+90000+75000)/3 = 81666.67
        // HR: (60000+70000)/2 = 65000.0
        Map<String, Double> result = StreamProblems.avgSalaryByDepartment(EMPLOYEES);
        assertEquals(81666.67, result.get("Engineering"), 0.1);
        assertEquals(65000.0,  result.get("HR"),          0.1);
    }

    // 55: Reorder timestamped messages chronologically
    @Test
    @DisplayName("55 - Reorder messages in chronological order")
    void test_reorderChronologically() {
        skip("reorderChronologically");
        List<String> input    = Arrays.asList("[10:05] Hello", "[09:00] Good morning", "[10:01] Hi");
        List<String> expected = Arrays.asList("[09:00] Good morning", "[10:01] Hi", "[10:05] Hello");
        assertEquals(expected, StreamProblems.reorderChronologically(input));
    }

    // 56: Character with maximum frequency
    @Test
    @DisplayName("56 - Return character with the maximum frequency")
    void test_charWithMaxFrequency() {
        skip("charWithMaxFrequency");
        assertEquals('a', StreamProblems.charWithMaxFrequency("aababc")); // a=3
        assertEquals('l', StreamProblems.charWithMaxFrequency("hello"));  // l=2
    }

    // 57: String -> length map
    @Test
    @DisplayName("57 - Convert list of strings to map of string -> length")
    void test_stringToLengthMap() {
        skip("stringToLengthMap");
        Map<String, Integer> result =
            StreamProblems.stringToLengthMap(Arrays.asList("hello", "world", "java"));
        assertEquals(5, result.get("hello"));
        assertEquals(5, result.get("world"));
        assertEquals(4, result.get("java"));
    }

    // 58: Transform Employee list to EmployeeDTO list
    @Test
    @DisplayName("58 - Transform Employee to EmployeeDTO")
    void test_transformToDTO() {
        skip("transformToDTO");
        List<StreamProblems.EmployeeDTO> result = StreamProblems.transformToDTO(EMPLOYEES);
        assertEquals(5, result.size());
        assertTrue(result.stream().anyMatch(d -> d.name.equals("Alice") && d.salary == 80000.0));
        assertTrue(result.stream().anyMatch(d -> d.name.equals("Bob")   && d.salary == 90000.0));
    }
}
