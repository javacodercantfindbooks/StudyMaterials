package org.data.functional;

import java.util.*;

/**
 * Demonstrates wildcards in Java generics:
 * - Unbounded wildcard ({@code ?})
 * - Upper‑bounded wildcard ({@code ? extends T})
 * - Lower‑bounded wildcard ({@code ? super T})
 *
 * Every method shows a safe, real‑world use of a wildcard parameter.
 */
public class WildcardDemo {

    // ------------------------------------------------------------
    // Unbounded wildcard – "I just want to look, not touch"
    // ------------------------------------------------------------

    /**
     * Prints every element of a list of unknown type.
     * Can only read as Object (or call toString()).
     * Cannot add any element except {@code null}.
     */
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    /**
     * Returns the number of non‑null elements in a list of unknown type.
     * Unbounded wildcard is perfect here – we only need Object methods.
     */
    public static long countNonNull(List<?> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .count();
    }

    // ------------------------------------------------------------
    // Upper‑bounded wildcard – Producer Extends (PECS)
    // ------------------------------------------------------------

    /**
     * Sums the double value of every element in a list of numbers.
     * Accepts List<Integer>, List<Double>, List<Number>, etc.
     * Safe because we only read elements as {@link Number}.
     */
    public static double sumOfNumbers(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number n : numbers) {
            sum += n.doubleValue();
        }
        return sum;
    }

    /**
     * Finds the maximum integer value in a list that contains Integers
     * (or any subtype of Integer – useful for covariant reading).
     */
    public static Integer maxInteger(List<? extends Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
    }

    // ------------------------------------------------------------
    // Lower‑bounded wildcard – Consumer Super (PECS)
    // ------------------------------------------------------------

    /**
     * Adds three integers to a list that can hold Integers or any supertype
     * (e.g., List<Number>, List<Object>).
     * We can safely add Integer (and its subtypes), but reading gives Object.
     */
    public static void addThreeIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    /**
     * Copies elements from a source list (producer) to a destination list
     * (consumer), using both upper and lower bounds correctly.
     */
    public static <T> void copy(List<? extends T> source, List<? super T> destination) {
        for (T item : source) {
            destination.add(item);
        }
    }
}
