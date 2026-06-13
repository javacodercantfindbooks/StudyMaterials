package org.data.functional;

import java.util.*;
import java.util.stream.*;

/**
 * Demonstrates the core operations of the {@link Stream} API.
 * All intermediate operations return a Stream for further chaining;
 * terminal operations return a concrete result.
 * The source is always a {@code List<String>} (or an already created stream).
 */
public class StreamBasicOperations {

    /** Obtains a sequential stream from a list (the starting point). */
    public static Stream<String> streamFromList(List<String> list) {
        return list.stream();
    }

    /** Obtains a parallel stream from a list. */
    public static Stream<String> parallelStreamFromList(List<String> list) {
        return list.parallelStream();
    }

    /** Keeps only elements that satisfy the predicate. */
    public static Stream<String> filterOperation(Stream<String> stream) {
        return stream.filter(s -> s.length() > 2);
    }

    /** Transforms each element using the given function. */
    public static Stream<String> mapOperation(Stream<String> stream) {
        return stream.map(String::toUpperCase);
    }

    /** Flattens a stream of collections/arrays into a single stream of elements. */
    public static Stream<String> flatMapOperation(Stream<String> stream) {
        return stream.flatMap(s -> Arrays.stream(s.split(",")));
    }

    /** Removes duplicate elements (according to equals). */
    public static Stream<String> distinctOperation(Stream<String> stream) {
        return stream.distinct();
    }

    /** Sorts elements in natural order. */
    public static Stream<String> sortedOperation(Stream<String> stream) {
        return stream.sorted();
    }

    /** Sorts elements using a custom comparator (here, reverse order). */
    public static Stream<String> sortedWithComparatorOperation(Stream<String> stream) {
        return stream.sorted(Comparator.reverseOrder());
    }

    /** Truncates the stream to at most maxSize elements. */
    public static Stream<String> limitOperation(Stream<String> stream, long maxSize) {
        return stream.limit(maxSize);
    }

    /** Skips the first n elements. */
    public static Stream<String> skipOperation(Stream<String> stream, long n) {
        return stream.skip(n);
    }

    /** Allows an action to be performed on each element as they are consumed (debugging). */
    public static Stream<String> peekOperation(Stream<String> stream) {
        return stream.peek(s -> System.out.println("Processing: " + s));
    }

    /** Collects stream elements into a List. */
    public static List<String> collectToList(Stream<String> stream) {
        return stream.collect(Collectors.toList());
    }

    /** Collects stream elements into a Set (removes duplicates). */
    public static Set<String> collectToSet(Stream<String> stream) {
        return stream.collect(Collectors.toSet());
    }

    /** Reduces the stream to a single value using an associative accumulator (concatenation). */
    public static Optional<String> reduceOperation(Stream<String> stream) {
        return stream.reduce((a, b) -> a + ", " + b);
    }

    /** Counts the number of elements in the stream. */
    public static long countOperation(Stream<String> stream) {
        return stream.count();
    }

    /** Returns the first element (if any). */
    public static Optional<String> findFirstOperation(Stream<String> stream) {
        return stream.findFirst();
    }

    /** Returns any element (useful for parallel streams). */
    public static Optional<String> findAnyOperation(Stream<String> stream) {
        return stream.findAny();
    }

    /** Returns true if any element matches the predicate. */
    public static boolean anyMatchOperation(Stream<String> stream) {
        return stream.anyMatch(s -> s.startsWith("A"));
    }

    /** Returns true if all elements match the predicate. */
    public static boolean allMatchOperation(Stream<String> stream) {
        return stream.allMatch(s -> s.length() > 1);
    }

    /** Returns true if no elements match the predicate. */
    public static boolean noneMatchOperation(Stream<String> stream) {
        return stream.noneMatch(String::isBlank);
    }

    /** Performs an action for each element. */
    public static void forEachOperation(Stream<String> stream) {
        stream.forEach(System.out::println);
    }

    /** Returns the minimum element according to natural order. */
    public static Optional<String> minOperation(Stream<String> stream) {
        return stream.min(Comparator.naturalOrder());
    }

    /** Returns the maximum element according to natural order. */
    public static Optional<String> maxOperation(Stream<String> stream) {
        return stream.max(Comparator.naturalOrder());
    }
}
