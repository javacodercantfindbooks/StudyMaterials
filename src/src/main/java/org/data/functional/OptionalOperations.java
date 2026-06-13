package org.data.functional;

import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;


public class OptionalOperations {

    /** Creates an Optional that contains a non‑null value. (Throws NullPointerException if value is null.) */
    public static Optional<String> of(String value) {
        return Optional.of(value);
    }

    /** Creates an Optional that may hold a null value (returns empty Optional in that case). */
    public static Optional<String> ofNullable(String value) {
        return Optional.ofNullable(value);
    }

    /** Returns an empty Optional. */
    public static Optional<String> empty() {
        return Optional.empty();
    }

    /** Returns true if a value is present, false otherwise. */
    public static boolean isPresent(Optional<String> opt) {
        return opt.isPresent();
    }

    /** Returns true if no value is present. (Java 11+; alternative to !isPresent()) */
    public static boolean isEmpty(Optional<String> opt) {
        return opt.isEmpty();
    }

    /** Executes the given action if a value is present; returns the Optional unchanged. */
    public static Optional<String> ifPresent(Optional<String> opt, Consumer<String> action) {
        opt.ifPresent(action);
        return opt;
    }

    /** Executes the first action if present, otherwise the second (empty action). Java 9+. */
    public static Optional<String> ifPresentOrElse(Optional<String> opt, Consumer<String> action, Runnable emptyAction) {
        opt.ifPresentOrElse(action, emptyAction);
        return opt;
    }

    /** Returns the value if present, otherwise returns the given default. */
    public static String orElse(Optional<String> opt, String defaultValue) {
        return opt.orElse(defaultValue);
    }

    /** Returns the value if present, otherwise calls the Supplier and returns its result. */
    public static String orElseGet(Optional<String> opt, Supplier<String> supplier) {
        return opt.orElseGet(supplier);
    }

    /** Returns the value if present, otherwise throws an exception produced by the Supplier. */
    public static String orElseThrow(Optional<String> opt, Supplier<? extends RuntimeException> exceptionSupplier) {
        return opt.orElseThrow(exceptionSupplier);
    }

    /** Returns the value if present, otherwise throws NoSuchElementException (Java 10+). */
    public static String orElseThrowPlain(Optional<String> opt) {
        return opt.orElseThrow();   // throws NoSuchElementException if empty
    }

    /** Returns the Optional unchanged if present and matches the predicate; otherwise empty. */
    public static Optional<String> filter(Optional<String> opt, Predicate<String> predicate) {
        return opt.filter(predicate);
    }

    /** Applies the mapping function to the value (if present) and wraps the result in an Optional. */
    public static Optional<Integer> mapToLength(Optional<String> opt) {
        return opt.map(String::length);
    }

    /** Like map, but the mapping function already returns an Optional (avoids nested Optional<Optional<…>>). */
    public static Optional<String> flatMap(Optional<String> opt, Function<String, Optional<String>> mapper) {
        return opt.flatMap(mapper);
    }

    /** Returns a sequential stream containing the single value, or an empty stream. */
    public static long streamAndCount(Optional<String> opt) {
        return opt.stream().count();   // 0 or 1
    }

    /** Converts the Optional to a List containing the value or an empty list. */
    public static List<String> streamToList(Optional<String> opt) {
        return opt.stream().collect(Collectors.toList());
    }

    /** Compares two Optional instances for equality (both empty = equal, same value = equal). */
    public static boolean equalsOptional(Optional<String> first, Optional<String> second) {
        return first.equals(second);
    }

    /** Returns the hash code of the Optional (0 if empty, otherwise value.hashCode()). */
    public static int hashCodeOptional(Optional<String> opt) {
        return opt.hashCode();
    }
}
