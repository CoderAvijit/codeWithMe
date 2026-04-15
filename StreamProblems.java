import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 * Java Streams API – 58 Practice Problems
 * Playlist: https://www.youtube.com/playlist?list=PL63BDXJjNfTElajNCfg_2u_pbe1Xi7uTy
 *
 * Each method stub throws UnsupportedOperationException until you implement it.
 * Solve each method using the Java Streams API.
 */
public class StreamProblems {

    // =========================================================
    // Helper / Model Classes
    // =========================================================

    public static class Person {
        public String firstName;
        public String lastName;
        public int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " (" + age + ")";
        }
    }

    public static class Employee {
        public String name;
        public String department;
        public String gender;
        public double salary;
        public int age;

        public Employee(String name, String department, String gender, double salary, int age) {
            this.name = name;
            this.department = department;
            this.gender = gender;
            this.salary = salary;
            this.age = age;
        }
    }

    public static class EmployeeDTO {
        public String name;
        public double salary;

        public EmployeeDTO(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "EmployeeDTO{name='" + name + "', salary=" + salary + "}";
        }
    }

    // =========================================================
    // Problems
    // =========================================================

    // 01: Given a sentence, find the word that has the highest length
    public static String findWordWithHighestLength(String sentence) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 02: Remove duplicates from the list of strings and return in the same order
    public static List<String> removeDuplicates(List<String> words) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 03: Find the word that has the second highest length
    //     Return the word itself (not just the length)
    public static String findWordWithSecondHighestLength(String sentence) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 04: Find the 2nd highest length word in the given sentence
    //     Return as Optional (handle ties or missing values safely)
    public static Optional<String> find2ndHighestLengthWord(String sentence) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 05: Given a sentence, find the occurrence of each word
    public static Map<String, Long> wordOccurrences(String sentence) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 06: Given a sentence, find the words with a specified number of vowels
    public static List<String> wordsWithVowelCount(String sentence, int vowelCount) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 07: Divide given integer list into lists of even and odd numbers
    //     Key: true  -> even numbers
    //     Key: false -> odd numbers
    public static Map<Boolean, List<Integer>> divideEvenOdd(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 08: Given a word, find the occurrence of each character
    public static Map<Character, Long> charOccurrences(String word) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 09: Arrange the numbers in Ascending (ascending=true) or Descending (ascending=false) order
    public static List<Integer> sortNumbers(List<Integer> numbers, boolean ascending) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 10: Given an array, find the sum of unique elements
    //     (i.e., elements that appear exactly once)
    public static int sumOfUniqueElements(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 11: Given a string, find the first non-repeated character
    public static Optional<Character> firstNonRepeatedChar(String s) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 12: Given a string, find the first repeated character
    public static Optional<Character> firstRepeatedChar(String s) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 13: Given an array of integers, group the numbers by range
    //     e.g. rangeSize=10: [0..9] -> "0-9", [10..19] -> "10-19", etc.
    public static Map<String, List<Integer>> groupByRange(List<Integer> numbers, int rangeSize) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 14: Given a list of strings, create a list that contains only integers
    //     (parse valid numeric strings; skip non-numeric ones)
    public static List<Integer> extractIntegers(List<String> strings) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 15: Find the product of the first two elements in an array
    public static long productOfFirstTwo(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 16: Group / Pair anagrams from a list of Strings
    //     Key: sorted characters of each word (canonical form)
    public static Map<String, List<String>> groupAnagrams(List<String> words) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 17: Write a stream program to multiply alternative numbers in an array
    //     Multiply elements at even indices: index 0, 2, 4, ...
    public static long multiplyAlternativeNumbers(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 18: Write a program to multiply 1st and last element, 2nd and 2nd last element, etc.
    //     e.g. [1, 2, 3, 4, 5] -> [1*5, 2*4, 3*3] = [5, 8, 9]
    public static List<Long> multiplySymmetricElements(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 19: Write a stream program to move all zeros to the beginning of the array
    //     Non-zero elements retain their relative order
    public static List<Integer> moveZerosToBeginning(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 20: In a given array of integers, return true if it contains only distinct values
    public static boolean hasDistinctValues(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 21: Given a list of strings, group them based on their middle character
    //     Only applies to odd-length strings; skip even-length strings
    public static Map<Character, List<String>> groupByMiddleChar(List<String> words) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 22: Find the sum of all the elements in a list
    public static int sumOfAllElements(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 23: Sort a list of strings in alphabetical order
    public static List<String> sortAlphabetically(List<String> strings) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 24: Convert a list of integers to a list of their squares
    public static List<Integer> squareNumbers(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 25: Find and return the distinct odd numbers
    public static List<Integer> distinctOddNumbers(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 26: Find the union of two lists of integers (distinct elements from both lists)
    public static List<Integer> union(List<Integer> list1, List<Integer> list2) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 27: Find the kth smallest element in a list of integers (1-based index)
    public static int kthSmallest(List<Integer> numbers, int k) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 28: Remove all non-numeric characters from each string in the list
    //     Strings that become empty after cleaning are excluded from the result
    public static List<String> removeNonNumericChars(List<String> list) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 29: Find and return strings that contain only digits
    public static List<String> stringsContainingOnlyDigits(List<String> strings) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 30: Convert a list of strings to uppercase
    public static List<String> toUpperCase(List<String> strings) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 31: Calculate the average of all the numbers
    public static double calculateAverage(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 32: Find the intersection of two lists using Java streams
    //     (elements present in both lists, distinct)
    public static List<Integer> intersection(List<Integer> list1, List<Integer> list2) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 33: Find the occurrence of domains using Java streams
    //     e.g. ["user@gmail.com", "admin@gmail.com", "x@yahoo.com"] -> {gmail.com=2, yahoo.com=1}
    public static Map<String, Long> domainOccurrences(List<String> emails) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 34: Generate the first n numbers of the Fibonacci Sequence
    //     e.g. n=7 -> [0, 1, 1, 2, 3, 5, 8]
    public static List<Long> fibonacci(int n) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 35: Convert an int array to an array of squares using IntStream / mapToInt
    //     (primitive array variant – contrast with problem 24 which uses List)
    public static int[] squareNumbersToArray(int[] numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 36: Transform a list of Person objects into a single comma-separated string
    //     e.g. "John Doe (30), Jane Smith (25)"
    public static String transformPersonsToString(List<Person> persons) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 37: Group a list of strings by their first character and count the strings per group
    public static Map<Character, Long> groupByFirstCharAndCount(List<String> strings) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 38: Convert a list of strings to a map of String -> its length
    public static Map<String, Integer> listToMap(List<String> strings) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 39: Multiply all array elements together (product of all elements)
    public static long multiplyAllElements(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 40: Can we reuse a stream in Java 8?
    //     Returns false — once a terminal operation is called the stream is closed
    public static boolean canReuseStream() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 41: Convert a list of strings to uppercase and then concatenate them all
    public static String toUpperCaseAndConcat(List<String> strings) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // Difference between map and flatMap:
    //   map  – one-to-one transformation (returns Stream<Stream<T>> if mapping to a stream)
    //   flatMap – one-to-many transformation that flattens the nested structure
    //   Example: given a list of sentences, extract all individual words using flatMap
    public static List<String> getAllWordsUsingFlatMap(List<String> sentences) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 42: Concatenate 2 streams into a single stream
    public static <T> List<T> concatenateStreams(List<T> list1, List<T> list2) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 44: Best Practices #1 – Avoid Complex Stream Pipelines
    //     Break a complex pipeline into clearly named intermediate variables.
    //     Task: filter out nulls, then count strings longer than 3 characters
    public static long avoidComplexPipeline(List<String> strings) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 45: Implement filter, reduction, average, and min in a single program
    //     Given a list and a threshold, return a map with:
    //       "filtered"  -> List<Integer> elements > threshold
    //       "sum"       -> Integer sum of filtered elements
    //       "average"   -> Double average of filtered elements
    //       "min"       -> Integer minimum of filtered elements
    public static Map<String, Object> filterReductionAverageMin(List<Integer> numbers, int threshold) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 46: Best Practices #2 – Avoid re-using streams
    //     Streams are single-use; create a new stream for each operation.
    //     Task: return only even numbers from the list (demonstrate correct, single-use stream usage)
    public static List<Integer> avoidStreamReuse(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 47: Best Practices #3 – Limiting infinite streams
    //     Use Stream.iterate / Stream.generate with limit() to avoid infinite loops.
    //     Task: generate the first n non-negative even numbers (0, 2, 4, ...)
    public static List<Integer> limitInfiniteStream(int n) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // Calculate the average age of male and female employees separately
    //   Key: "Male" / "Female", Value: average age
    public static Map<String, Double> avgAgeByGender(List<Employee> employees) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 48: Print the middle character of a given String
    //     Assumes odd-length input string
    public static char middleCharacter(String s) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 49: Print distinct numbers which start with "1" in descending order
    public static List<Integer> distinctNumbersStartingWith1(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 50: Return the employees whose salary exceeds the threshold, with salary increased by 10%
    //     Return new Employee objects with the updated salary
    public static List<Employee> filterAndModifySalary(List<Employee> employees, double threshold) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 51: Return a Comparator for Person that sorts by firstName, then by lastName
    public static Comparator<Person> personComparator() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 52: Print the count of occurrences of a particular substring within a string
    public static long countSubstring(String text, String substring) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 53: Find the department with the maximum number of employees
    public static String departmentWithMaxPeople(List<Employee> employees) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 54: Find the average salary from each department
    //   Key: department name, Value: average salary
    public static Map<String, Double> avgSalaryByDepartment(List<Employee> employees) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 55: Reorder messages from a timestamped format in chronological order
    //     Input format: "[HH:MM] message text"
    //     e.g. ["[10:05] Hello", "[09:00] Good morning"] -> ["[09:00] Good morning", "[10:05] Hello"]
    public static List<String> reorderChronologically(List<String> messages) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 56: Return the character with the maximum frequency in a string
    public static char charWithMaxFrequency(String s) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 57: Convert a list of strings into a map of String -> its length
    public static Map<String, Integer> stringToLengthMap(List<String> strings) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // 58: Transform Employee objects to EmployeeDTO objects (name + salary only)
    public static List<EmployeeDTO> transformToDTO(List<Employee> employees) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
