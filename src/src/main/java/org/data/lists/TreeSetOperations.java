package org.data.lists;
import java.util.*;

public class TreeSetOperations {
    /** Returns the first (lowest) element. */
    public static String first(TreeSet<String> set) {
        return set.first();
    }

    /** Returns the last (highest) element. */
    public static String last(TreeSet<String> set) {
        return set.last();
    }

    /** Returns the comparator used, or null if natural ordering. */
    public static Comparator<? super String> comparator(TreeSet<String> set) {
        return set.comparator();
    }

    /** Returns a view of elements strictly less than 'toElement'. */
    public static SortedSet<String> headSet(TreeSet<String> set, String toElement) {
        return set.headSet(toElement);
    }

    /** Returns a view of elements greater than or equal to 'fromElement'. */
    public static SortedSet<String> tailSet(TreeSet<String> set, String fromElement) {
        return set.tailSet(fromElement);
    }

    /** Returns a view from 'from' (inclusive) to 'to' (exclusive). */
    public static SortedSet<String> subSet(TreeSet<String> set, String from, String to) {
        return set.subSet(from, to);
    }

    /** Greatest element strictly less than e, or null. */
    public static String lower(TreeSet<String> set, String e) {
        return set.lower(e);
    }

    /** Greatest element ≤ e, or null. */
    public static String floor(TreeSet<String> set, String e) {
        return set.floor(e);
    }

    /** Smallest element ≥ e, or null. */
    public static String ceiling(TreeSet<String> set, String e) {
        return set.ceiling(e);
    }

    /** Smallest element strictly greater than e, or null. */
    public static String higher(TreeSet<String> set, String e) {
        return set.higher(e);
    }

    /** Remove and return the first element; returns null if empty. */
    public static String pollFirst(TreeSet<String> set) {
        return set.pollFirst();
    }

    /** Remove and return the last element; returns null if empty. */
    public static String pollLast(TreeSet<String> set) {
        return set.pollLast();
    }

    /** Returns a reverse‑order view of the set. */
    public static NavigableSet<String> descendingSet(TreeSet<String> set) {
        return set.descendingSet();
    }

    /** Sub‑set with inclusive/exclusive bounds. */
    public static NavigableSet<String> subSetInclusive(TreeSet<String> set, String from, boolean fromInc, String to, boolean toInc) {
        return set.subSet(from, fromInc, to, toInc);
    }

    /** Head set with inclusive flag. */
    public static NavigableSet<String> headSetInclusive(TreeSet<String> set, String to, boolean inclusive) {
        return set.headSet(to, inclusive);
    }

    /** Tail set with inclusive flag. */
    public static NavigableSet<String> tailSetInclusive(TreeSet<String> set, String from, boolean inclusive) {
        return set.tailSet(from, inclusive);
    }
}

