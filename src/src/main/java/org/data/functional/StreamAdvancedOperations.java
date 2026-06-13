package org.data.functional;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class StreamAdvancedOperations {

    // ------------------------------------------------------------
    // Advanced collectors (grouping, partitioning, joining, toMap with merge)
    // ------------------------------------------------------------

    /** Groups strings by their first character. */
    public static Map<Character, List<String>> groupingByFirstChar(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
    }

    /** Groups strings by length, counting how many fall into each bucket. */
    public static Map<Integer, Long> groupingByLengthWithCount(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
    }

    /** Splits strings into two groups: longer than 5 characters, or not. */
    public static Map<Boolean, List<String>> partitioningByLength(List<String> list, int threshold) {
        return list.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > threshold));
    }

    /**
     * Collects strings into a Map keyed by the string itself, with value = length.
     * Uses a merge function to resolve duplicate keys (keeps the first value).
     */
    public static Map<String, Integer> toMapWithMerge(List<String> list) {
        return list.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        String::length,
                        (existing, replacement) -> existing)); // keep first
    }

    /**
     * Converts strings to upper case, collects into a list, then wraps it in an
     * unmodifiable list using collectingAndThen.
     */
    public static List<String> collectAndThenUnmodifiable(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        Collections::unmodifiableList));
    }

    /** Joins all strings with a comma and a prefix / suffix. */
    public static String joinWithPrefixSuffix(List<String> list) {
        return list.stream()
                .collect(Collectors.joining(", ", "[", "]"));
    }

    // ------------------------------------------------------------
    // Java 9+ intermediate operations
    // ------------------------------------------------------------

    /** Takes elements while the string length is less than 6. */
    public static List<String> takeWhileLengthLessThan(List<String> list, int maxLength) {
        return list.stream()
                .takeWhile(s -> s.length() < maxLength)
                .collect(Collectors.toList());
    }

    /** Drops elements while the string length is less than 6. */
    public static List<String> dropWhileLengthLessThan(List<String> list, int minLength) {
        return list.stream()
                .dropWhile(s -> s.length() < minLength)
                .collect(Collectors.toList());
    }

    /** Finite iterate: starts at 0, adds 2 while value < 10. */
    public static List<Integer> finiteIterate() {
        return Stream.iterate(0, n -> n < 10, n -> n + 2)
                .collect(Collectors.toList());
    }

    /** Returns a stream containing a single non‑null element, or empty. */
    public static List<String> ofNullable(String nullableValue) {
        return Stream.ofNullable(nullableValue)
                .collect(Collectors.toList());
    }

    // ------------------------------------------------------------
    // Advanced flatMap (characters, optionals, arrays)
    // ------------------------------------------------------------

    /** Flattens a list of strings into a list of all characters (as strings). */
    public static List<String> flatMapToCharacters(List<String> list) {
        return list.stream()
                .flatMap(s -> s.chars()
                        .mapToObj(c -> String.valueOf((char) c)))
                .collect(Collectors.toList());
    }

    /** Flattens a list of Optionals, keeping only present values. */
    public static List<String> flatMapOptionals(List<Optional<String>> optionals) {
        return optionals.stream()
                .flatMap(Optional::stream)          // Java 9+
                .collect(Collectors.toList());
    }

    /**
     * Flattens a list of String arrays into a single list of strings.
     * (Example of "flatMap with arrays".)
     */
    public static List<String> flatMapArrays(List<String[]> arrayList) {
        return arrayList.stream()
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }

    // ------------------------------------------------------------
    // Parallelism
    // ------------------------------------------------------------

    /** Processes elements in parallel but prints them in encounter order. */
    public static void parallelForEachOrdered(List<String> list) {
        list.parallelStream()
                .forEachOrdered(System.out::println);
    }

    /** Shows difference: findAny returns any element (faster in parallel), findFirst the first. */
    public static String findAnyInParallel(List<String> list) {
        return list.parallelStream()
                .findAny()
                .orElse("none");
    }

    // ------------------------------------------------------------
    // Three‑argument reduce (identity, accumulator, combiner)
    // ------------------------------------------------------------

    /**
     * Sums the lengths of strings using a parallel‑ready reduce.
     * The combiner merges partial results.
     */
    public static int reduceSumLengths(List<String> list) {
        return list.parallelStream()
                .reduce(0,
                        (sum, s) -> sum + s.length(),
                        Integer::sum);
    }

    // ------------------------------------------------------------
    // Stream concatenation
    // ------------------------------------------------------------

    /** Concatenates two streams into one. */
    public static List<String> concatStreams(List<String> first, List<String> second) {
        return Stream.concat(first.stream(), second.stream())
                .collect(Collectors.toList());
    }

    // ------------------------------------------------------------
    // mapMulti (Java 16+), replacement for flatMap
    // ------------------------------------------------------------

    /**
     * Expands each string into individual characters using mapMulti.
     * For Java 16 and later; skip if your project uses an older version.
     */
    public static List<String> mapMultiToCharacters(List<String> list) {
        return list.stream()
                .mapMulti((String s, Consumer<String> consumer) -> {
                    for (char ch : s.toCharArray()) {
                        consumer.accept(String.valueOf(ch));
                    }
                })
                .collect(Collectors.toList());
    }

    // ------------------------------------------------------------
    // Primitive streams (Int, Long, Double)
    // ------------------------------------------------------------

    // --- IntStream ---

    /** Creates an IntStream from a range (exclusive end), returns sum. */
    public static int intStreamRangeSum(int start, int end) {
        return IntStream.range(start, end).sum();
    }

    /** Creates an IntStream from a closed range (inclusive end), returns sum. */
    public static int intStreamRangeClosedSum(int start, int end) {
        return IntStream.rangeClosed(start, end).sum();
    }

    /** Returns an IntSummaryStatistics object for string lengths. */
    public static IntSummaryStatistics intStreamSummaryStats(List<String> list) {
        return list.stream()
                .mapToInt(String::length)
                .summaryStatistics();
    }

    /** Converts an IntStream of characters back to a Stream<String>. */
    public static List<String> intStreamBoxed(List<String> list) {
        return list.stream()
                .flatMapToInt(String::chars)
                .boxed()                             // Stream<Integer>
                .map(Character::toString)
                .collect(Collectors.toList());
    }

    // --- LongStream ---

    /** Creates a LongStream from numbers, returns sum. */
    public static long longStreamSum(long... values) {
        return LongStream.of(values).sum();
    }

    /** Creates a LongStream.range and returns as list (boxed). */
    public static List<Long> longStreamRange(long start, long end) {
        return LongStream.range(start, end)
                .boxed()
                .collect(Collectors.toList());
    }

    // --- DoubleStream ---

    /** Creates a DoubleStream from numbers, returns average. */
    public static double doubleStreamAverage(double... values) {
        return DoubleStream.of(values).average().orElse(0.0);
    }

    /** Creates a DoubleStream from a list of strings (converting to double). */
    public static double doubleStreamSumFromStrings(List<String> numbers) {
        return numbers.stream()
                .mapToDouble(Double::parseDouble)
                .sum();
    }
}
