package org.data.collections;

import java.util.*;


public class CollectionsUtility {

    /** Sorts the list into ascending order according to natural ordering. Returns the sorted list. */
    public static List<String> sort(List<String> list) {
        Collections.sort(list);
        return list;
    }

    /** Sorts the list using the given comparator. */
    public static List<String> sortWithComparator(List<String> list, Comparator<String> comparator) {
        Collections.sort(list, comparator);
        return list;
    }

    /** Searches a sorted list for the key using binary search. Returns the index (≥0 if found). */
    public static int binarySearch(List<String> list, String key) {
        return Collections.binarySearch(list, key);
    }

    /** Binary search using a custom comparator. */
    public static int binarySearchWithComparator(List<String> list, String key, Comparator<String> comparator) {
        return Collections.binarySearch(list, key, comparator);
    }

    /** Reverses the order of elements in the list. Returns the list. */
    public static List<String> reverse(List<String> list) {
        Collections.reverse(list);
        return list;
    }

    /** Rotates the list by the given distance (positive → right, negative → left). */
    public static List<String> rotate(List<String> list, int distance) {
        Collections.rotate(list, distance);
        return list;
    }

    /** Randomly permutes the elements. Returns the shuffled list. */
    public static List<String> shuffle(List<String> list) {
        Collections.shuffle(list);
        return list;
    }

    /** Shuffles using a specific Random instance (reproducible). */
    public static List<String> shuffleWithRandom(List<String> list, Random rnd) {
        Collections.shuffle(list, rnd);
        return list;
    }

    /** Swaps the elements at indices i and j. */
    public static List<String> swap(List<String> list, int i, int j) {
        Collections.swap(list, i, j);
        return list;
    }

    /** Replaces every element with the given value. */
    public static List<String> fill(List<String> list, String value) {
        Collections.fill(list, value);
        return list;
    }

    /** Copies all elements from src to dest. dest must be at least as large. */
    public static List<String> copy(List<String> dest, List<String> src) {
        Collections.copy(dest, src);
        return dest;
    }

    /** Returns the minimum element according to natural ordering. */
    public static String min(Collection<String> coll) {
        return Collections.min(coll);
    }

    /** Returns the minimum element using a custom comparator. */
    public static String minWithComparator(Collection<String> coll, Comparator<String> comp) {
        return Collections.min(coll, comp);
    }

    /** Returns the maximum element according to natural ordering. */
    public static String max(Collection<String> coll) {
        return Collections.max(coll);
    }

    /** Returns the maximum element using a custom comparator. */
    public static String maxWithComparator(Collection<String> coll, Comparator<String> comp) {
        return Collections.max(coll, comp);
    }

    /** Returns how many times 'element' occurs in the collection. */
    public static int frequency(Collection<String> coll, String element) {
        return Collections.frequency(coll, element);
    }

    /** Returns true if the two collections have no elements in common. */
    public static boolean disjoint(Collection<String> c1, Collection<String> c2) {
        return Collections.disjoint(c1, c2);
    }

    /** Returns an unmodifiable view of the list (any modification attempt throws an exception). */
    public static List<String> unmodifiableList(List<String> list) {
        return Collections.unmodifiableList(list);
    }

    /** Returns a synchronized (thread-safe) view of the list. */
    public static List<String> synchronizedList(List<String> list) {
        return Collections.synchronizedList(list);
    }

    /** Returns an immutable list containing a single element. */
    public static List<String> singletonList(String element) {
        return Collections.singletonList(element);
    }

    /** Returns an immutable empty list. */
    public static List<String> emptyList() {
        return Collections.emptyList();
    }

    /** Returns an immutable list consisting of n copies of the object. */
    public static List<String> nCopies(int n, String value) {
        return Collections.nCopies(n, value);
    }

    /** Returns a comparator that enforces the reverse of natural ordering. */
    public static Comparator<String> reverseOrder() {
        return Collections.reverseOrder();
    }

    /** Returns a comparator that reverses the given comparator. */
    public static Comparator<String> reverseOrder(Comparator<String> base) {
        return Collections.reverseOrder(base);
    }
}
