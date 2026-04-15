import java.util.*;

/**
 * Runner for Stream API practice problems.
 *
 * HOW TO USE:
 *   1. Change RUN_PROBLEM to the number of the problem you just implemented
 *   2. Run this class (mvn exec:java  OR  right-click -> Run in your IDE)
 *   3. The input and output for that problem will be printed to the console
 */
public class Main {

    // ─────────────────────────────────────────────
    //  ★  CHANGE THIS NUMBER to run a problem  ★
    // ─────────────────────────────────────────────
    private static final int RUN_PROBLEM = 1;
    // ─────────────────────────────────────────────

    public static void main(String[] args) {
        System.out.println("════════════════════════════════════════");
        System.out.println("  Running Problem " + RUN_PROBLEM);
        System.out.println("════════════════════════════════════════");
        try {
            run(RUN_PROBLEM);
        } catch (UnsupportedOperationException e) {
            System.out.println("⚠  Not implemented yet. Implement this method in StreamProblems.java first.");
        }
        System.out.println("════════════════════════════════════════");
    }

    // ─────────────────────────────────────────────
    // Shared sample data
    // ─────────────────────────────────────────────
    private static final List<StreamProblems.Employee> EMPLOYEES = Arrays.asList(
        new StreamProblems.Employee("Alice",   "Engineering", "Female", 80000.0, 30),
        new StreamProblems.Employee("Bob",     "Engineering", "Male",   90000.0, 35),
        new StreamProblems.Employee("Charlie", "Engineering", "Male",   75000.0, 28),
        new StreamProblems.Employee("Carol",   "HR",          "Female", 60000.0, 25),
        new StreamProblems.Employee("Dave",    "HR",          "Male",   70000.0, 40)
    );

    private static void run(int problem) {
        switch (problem) {

            case 1 -> {
                // 01: Given a sentence, find the word that has the highest length
                String sentence = "I love programming in Java";
                System.out.println("Input  : " + sentence);
                System.out.println("Output : " + StreamProblems.findWordWithHighestLength(sentence));
            }

            case 2 -> {
                // 02: Remove duplicates from the list and return in the same order
                List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana");
                System.out.println("Input  : " + words);
                System.out.println("Output : " + StreamProblems.removeDuplicates(words));
            }

            case 3 -> {
                // 03: Find the word that has the second highest length
                String sentence = "I love programming in JavaScript";
                System.out.println("Input  : " + sentence);
                System.out.println("Output : " + StreamProblems.findWordWithSecondHighestLength(sentence));
            }

            case 4 -> {
                // 04: Find the 2nd highest length word (as Optional)
                String sentence = "I love programming in JavaScript";
                System.out.println("Input  : " + sentence);
                System.out.println("Output : " + StreamProblems.find2ndHighestLengthWord(sentence));
            }

            case 5 -> {
                // 05: Find the occurrence of each word in a sentence
                String sentence = "the quick brown fox the quick";
                System.out.println("Input  : " + sentence);
                System.out.println("Output : " + StreamProblems.wordOccurrences(sentence));
            }

            case 6 -> {
                // 06: Find words with a specified number of vowels
                String sentence = "apple orange banana";
                int vowelCount = 3;
                System.out.println("Input  : \"" + sentence + "\", vowelCount=" + vowelCount);
                System.out.println("Output : " + StreamProblems.wordsWithVowelCount(sentence, vowelCount));
            }

            case 7 -> {
                // 07: Divide integer list into even and odd
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
                System.out.println("Input  : " + numbers);
                System.out.println("Output : " + StreamProblems.divideEvenOdd(numbers));
            }

            case 8 -> {
                // 08: Find occurrence of each character in a word
                String word = "hello";
                System.out.println("Input  : " + word);
                System.out.println("Output : " + StreamProblems.charOccurrences(word));
            }

            case 9 -> {
                // 09: Sort numbers ascending and descending
                List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
                System.out.println("Input      : " + numbers);
                System.out.println("Ascending  : " + StreamProblems.sortNumbers(numbers, true));
                System.out.println("Descending : " + StreamProblems.sortNumbers(numbers, false));
            }

            case 10 -> {
                // 10: Sum of unique elements
                List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3);
                System.out.println("Input  : " + numbers);
                System.out.println("Output : " + StreamProblems.sumOfUniqueElements(numbers));
            }

            case 11 -> {
                // 11: First non-repeated character
                String s = "swiss";
                System.out.println("Input  : " + s);
                System.out.println("Output : " + StreamProblems.firstNonRepeatedChar(s));
            }

            case 12 -> {
                // 12: First repeated character
                String s = "swiss";
                System.out.println("Input  : " + s);
                System.out.println("Output : " + StreamProblems.firstRepeatedChar(s));
            }

            case 13 -> {
                // 13: Group numbers by range (rangeSize=10)
                List<Integer> numbers = Arrays.asList(5, 15, 25, 8, 12, 35);
                System.out.println("Input  : " + numbers + ", rangeSize=10");
                System.out.println("Output : " + StreamProblems.groupByRange(numbers, 10));
            }

            case 14 -> {
                // 14: Extract integers from a mixed list of strings
                List<String> strings = Arrays.asList("1", "abc", "2", "xyz", "3");
                System.out.println("Input  : " + strings);
                System.out.println("Output : " + StreamProblems.extractIntegers(strings));
            }

            case 15 -> {
                // 15: Product of first two elements
                List<Integer> numbers = Arrays.asList(3, 5, 7, 2);
                System.out.println("Input  : " + numbers);
                System.out.println("Output : " + StreamProblems.productOfFirstTwo(numbers));
            }

            case 16 -> {
                // 16: Group anagrams
                List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
                System.out.println("Input  : " + words);
                System.out.println("Output : " + StreamProblems.groupAnagrams(words));
            }

            case 17 -> {
                // 17: Multiply alternative (even-index) numbers
                List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);
                System.out.println("Input  : " + numbers + " -> indices 0,2,4");
                System.out.println("Output : " + StreamProblems.multiplyAlternativeNumbers(numbers));
            }

            case 18 -> {
                // 18: Multiply symmetric elements (1st*last, 2nd*2nd-last, ...)
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
                System.out.println("Input  : " + numbers);
                System.out.println("Output : " + StreamProblems.multiplySymmetricElements(numbers));
            }

            case 19 -> {
                // 19: Move all zeros to beginning
                List<Integer> numbers = Arrays.asList(1, 0, 2, 0, 3);
                System.out.println("Input  : " + numbers);
                System.out.println("Output : " + StreamProblems.moveZerosToBeginning(numbers));
            }

            case 20 -> {
                // 20: Return true if array contains only distinct values
                List<Integer> a = Arrays.asList(1, 2, 3, 4);
                List<Integer> b = Arrays.asList(1, 2, 2, 4);
                System.out.println("Input  : " + a + " -> " + StreamProblems.hasDistinctValues(a));
                System.out.println("Input  : " + b + " -> " + StreamProblems.hasDistinctValues(b));
            }

            case 21 -> {
                // 21: Group strings by their middle character
                List<String> words = Arrays.asList("abc", "xyz", "aec");
                System.out.println("Input  : " + words);
                System.out.println("Output : " + StreamProblems.groupByMiddleChar(words));
            }

            case 22 -> {
                // 22: Sum of all elements
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
                System.out.println("Input  : " + numbers);
                System.out.println("Output : " + StreamProblems.sumOfAllElements(numbers));
            }

            case 23 -> {
                // 23: Sort strings alphabetically
                List<String> strings = Arrays.asList("banana", "apple", "cherry");
                System.out.println("Input  : " + strings);
                System.out.println("Output : " + StreamProblems.sortAlphabetically(strings));
            }

            case 24 -> {
                // 24: Convert integers to their squares (List)
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
                System.out.println("Input  : " + numbers);
                System.out.println("Output : " + StreamProblems.squareNumbers(numbers));
            }

            case 25 -> {
                // 25: Distinct odd numbers
                List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 5, 4, 1);
                System.out.println("Input  : " + numbers);
                System.out.println("Output : " + StreamProblems.distinctOddNumbers(numbers));
            }

            case 26 -> {
                // 26: Union of two lists
                List<Integer> a = Arrays.asList(1, 2, 3);
                List<Integer> b = Arrays.asList(2, 3, 4);
                System.out.println("Input  : " + a + " ∪ " + b);
                System.out.println("Output : " + StreamProblems.union(a, b));
            }

            case 27 -> {
                // 27: Kth smallest element
                List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
                System.out.println("Input  : " + numbers);
                System.out.println("1st smallest : " + StreamProblems.kthSmallest(numbers, 1));
                System.out.println("2nd smallest : " + StreamProblems.kthSmallest(numbers, 2));
                System.out.println("5th smallest : " + StreamProblems.kthSmallest(numbers, 5));
            }

            case 28 -> {
                // 28: Remove non-numeric characters from each string
                List<String> list = Arrays.asList("abc123", "456", "hello", "789xyz");
                System.out.println("Input  : " + list);
                System.out.println("Output : " + StreamProblems.removeNonNumericChars(list));
            }

            case 29 -> {
                // 29: Strings containing only digits
                List<String> strings = Arrays.asList("123", "abc", "456", "12a");
                System.out.println("Input  : " + strings);
                System.out.println("Output : " + StreamProblems.stringsContainingOnlyDigits(strings));
            }

            case 30 -> {
                // 30: Convert strings to uppercase
                List<String> strings = Arrays.asList("hello", "world", "java");
                System.out.println("Input  : " + strings);
                System.out.println("Output : " + StreamProblems.toUpperCase(strings));
            }

            case 31 -> {
                // 31: Average of all numbers
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
                System.out.println("Input  : " + numbers);
                System.out.println("Output : " + StreamProblems.calculateAverage(numbers));
            }

            case 32 -> {
                // 32: Intersection of two lists
                List<Integer> a = Arrays.asList(1, 2, 3, 4);
                List<Integer> b = Arrays.asList(2, 3, 5);
                System.out.println("Input  : " + a + " ∩ " + b);
                System.out.println("Output : " + StreamProblems.intersection(a, b));
            }

            case 33 -> {
                // 33: Occurrence of email domains
                List<String> emails = Arrays.asList(
                    "a@gmail.com", "b@yahoo.com", "c@gmail.com", "d@gmail.com");
                System.out.println("Input  : " + emails);
                System.out.println("Output : " + StreamProblems.domainOccurrences(emails));
            }

            case 34 -> {
                // 34: First n Fibonacci numbers
                int n = 10;
                System.out.println("Input  : n=" + n);
                System.out.println("Output : " + StreamProblems.fibonacci(n));
            }

            case 35 -> {
                // 35: Square numbers to primitive int[] using IntStream
                int[] input = {1, 2, 3, 4};
                System.out.println("Input  : " + Arrays.toString(input));
                System.out.println("Output : " + Arrays.toString(StreamProblems.squareNumbersToArray(input)));
            }

            case 36 -> {
                // 36: Transform Person list into a single string
                List<StreamProblems.Person> persons = Arrays.asList(
                    new StreamProblems.Person("John", "Doe",   30),
                    new StreamProblems.Person("Jane", "Smith", 25)
                );
                System.out.println("Input  : " + persons);
                System.out.println("Output : " + StreamProblems.transformPersonsToString(persons));
            }

            case 37 -> {
                // 37: Group by first character and count
                List<String> strings = Arrays.asList("apple", "avocado", "banana", "blueberry", "cherry");
                System.out.println("Input  : " + strings);
                System.out.println("Output : " + StreamProblems.groupByFirstCharAndCount(strings));
            }

            case 38 -> {
                // 38: List of strings to map (string -> length)
                List<String> strings = Arrays.asList("hello", "java", "world");
                System.out.println("Input  : " + strings);
                System.out.println("Output : " + StreamProblems.listToMap(strings));
            }

            case 39 -> {
                // 39: Product of all elements
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
                System.out.println("Input  : " + numbers);
                System.out.println("Output : " + StreamProblems.multiplyAllElements(numbers));
            }

            case 40 -> {
                // 40: Can we reuse a stream in Java 8?
                System.out.println("Can we reuse a stream? -> " + StreamProblems.canReuseStream());
                System.out.println("Explanation: Once a terminal operation is called, the stream is closed.");
            }

            case 41 -> {
                // 41: Convert to uppercase and concatenate
                List<String> strings = Arrays.asList("hello", "world", "java");
                System.out.println("Input  : " + strings);
                System.out.println("Output : " + StreamProblems.toUpperCaseAndConcat(strings));
            }

            case 42 -> {
                // Difference between map and flatMap
                List<String> sentences = Arrays.asList("hello world", "foo bar", "java streams");
                System.out.println("Input  : " + sentences);
                System.out.println("Output : " + StreamProblems.getAllWordsUsingFlatMap(sentences));
                System.out.println("Note   : flatMap flattens Stream<String[]> -> Stream<String>");
            }

            case 43 -> {
                // 42: Concatenate 2 streams
                List<Integer> a = Arrays.asList(1, 2, 3);
                List<Integer> b = Arrays.asList(4, 5, 6);
                System.out.println("Input  : " + a + " + " + b);
                System.out.println("Output : " + StreamProblems.concatenateStreams(a, b));
            }

            case 44 -> {
                // 44: Best Practices #1 – Avoid complex pipelines
                List<String> strings = Arrays.asList("hello", "hey", null, "world", "hi");
                System.out.println("Input  : " + strings + " (filter nulls, then length > 3)");
                System.out.println("Output : " + StreamProblems.avoidComplexPipeline(strings));
            }

            case 45 -> {
                // 45: Filter, reduction, average, min
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                int threshold = 5;
                System.out.println("Input     : " + numbers + ", threshold=" + threshold);
                System.out.println("Output    : " + StreamProblems.filterReductionAverageMin(numbers, threshold));
            }

            case 46 -> {
                // 46: Best Practices #2 – Avoid re-using streams (returns even numbers)
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
                System.out.println("Input  : " + numbers);
                System.out.println("Output : " + StreamProblems.avoidStreamReuse(numbers));
            }

            case 47 -> {
                // 47: Best Practices #3 – Limit infinite stream (first n even numbers)
                int n = 7;
                System.out.println("Input  : first " + n + " even numbers");
                System.out.println("Output : " + StreamProblems.limitInfiniteStream(n));
            }

            case 48 -> {
                // Calculate average age by gender
                System.out.println("Input  : " + EMPLOYEES.stream().map(e -> e.name).toList());
                System.out.println("Output : " + StreamProblems.avgAgeByGender(EMPLOYEES));
            }

            case 49 -> {
                // 48: Middle character of a string
                String[] inputs = {"hello", "abc", "java"};
                for (String s : inputs) {
                    System.out.println("middleCharacter(\"" + s + "\") -> " + StreamProblems.middleCharacter(s));
                }
            }

            case 50 -> {
                // 49: Distinct numbers starting with "1" in descending order
                List<Integer> numbers = Arrays.asList(10, 1, 15, 12, 20, 15, 100);
                System.out.println("Input  : " + numbers);
                System.out.println("Output : " + StreamProblems.distinctNumbersStartingWith1(numbers));
            }

            case 51 -> {
                // 50: Filter employees and increase salary by 10%
                System.out.println("Input  : salary threshold = 75000");
                List<StreamProblems.Employee> result =
                    StreamProblems.filterAndModifySalary(EMPLOYEES, 75000);
                result.forEach(e ->
                    System.out.println("  " + e.name + " -> new salary: " + e.salary));
            }

            case 52 -> {
                // 51: Person comparator (firstName then lastName)
                List<StreamProblems.Person> persons = Arrays.asList(
                    new StreamProblems.Person("Zara",  "Ali",   20),
                    new StreamProblems.Person("Alice", "Zhao",  30),
                    new StreamProblems.Person("Alice", "Adams", 25)
                );
                System.out.println("Before : " + persons.stream().map(p -> p.firstName + " " + p.lastName).toList());
                persons.sort(StreamProblems.personComparator());
                System.out.println("After  : " + persons.stream().map(p -> p.firstName + " " + p.lastName).toList());
            }

            case 53 -> {
                // 52: Count occurrences of a substring
                String text = "hello world hello java hello";
                String sub  = "hello";
                System.out.println("Text      : \"" + text + "\"");
                System.out.println("Substring : \"" + sub + "\"");
                System.out.println("Count     : " + StreamProblems.countSubstring(text, sub));
            }

            case 54 -> {
                // 53: Department with the most employees
                System.out.println("Employees : " + EMPLOYEES.stream().map(e -> e.name + "(" + e.department + ")").toList());
                System.out.println("Output    : " + StreamProblems.departmentWithMaxPeople(EMPLOYEES));
            }

            case 55 -> {
                // 54: Average salary per department
                System.out.println("Output : " + StreamProblems.avgSalaryByDepartment(EMPLOYEES));
            }

            case 56 -> {
                // 55: Reorder messages chronologically
                List<String> messages = Arrays.asList(
                    "[10:05] Hello",
                    "[09:00] Good morning",
                    "[10:01] Hi"
                );
                System.out.println("Input  : " + messages);
                System.out.println("Output : " + StreamProblems.reorderChronologically(messages));
            }

            case 57 -> {
                // 56: Character with maximum frequency
                String[] inputs = {"aababc", "hello", "mississippi"};
                for (String s : inputs) {
                    System.out.println("charWithMaxFrequency(\"" + s + "\") -> "
                        + StreamProblems.charWithMaxFrequency(s));
                }
            }

            case 58 -> {
                // 57: String to length map
                List<String> strings = Arrays.asList("hello", "world", "java");
                System.out.println("Input  : " + strings);
                System.out.println("Output : " + StreamProblems.stringToLengthMap(strings));
            }

            case 59 -> {
                // 58: Transform Employee to EmployeeDTO
                List<StreamProblems.EmployeeDTO> dtos = StreamProblems.transformToDTO(EMPLOYEES);
                dtos.forEach(d -> System.out.println("  " + d));
            }

            default -> System.out.println("Problem " + problem + " not found. Valid range: 1 – 59");
        }
    }
}
