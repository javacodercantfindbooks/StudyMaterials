package org.data.collections;

import java.util.*;

public class SetOperations {

    /** Adds an element to the set; returns the set (unchanged if the element was already present). */
    public static Set<String> addElement(Set<String> set, String element) {
        set.add(element);
        return set;
    }

    /** Removes the element from the set if it exists; returns the set. */
    public static Set<String> removeElement(Set<String> set, String element) {
        set.remove(element);
        return set;
    }

    /** Removes all elements from the set; returns the now empty set. */
    public static Set<String> clearSet(Set<String> set) {
        set.clear();
        return set;
    }

    /** Adds all elements from the given collection to the set; returns the set. */
    public static Set<String> addAll(Set<String> set, Collection<String> elements) {
        set.addAll(elements);
        return set;
    }

    /** Retains only the elements that are also in the given collection; returns the set. */
    public static Set<String> retainAll(Set<String> set, Collection<String> elements) {
        set.retainAll(elements);
        return set;
    }

    /** Removes all elements that are also in the given collection; returns the set. */
    public static Set<String> removeAll(Set<String> set, Collection<String> elements) {
        set.removeAll(elements);
        return set;
    }

    /** Returns true if the set contains the element. */
    public static boolean contains(Set<String> set, String element) {
        return set.contains(element);
    }

    /** Returns true if the set contains all elements of the given collection. */
    public static boolean containsAll(Set<String> set, Collection<String> elements) {
        return set.containsAll(elements);
    }

    /** Returns the number of elements in the set. */
    public static int size(Set<String> set) {
        return set.size();
    }

    /** Returns true if the set is empty. */
    public static boolean isEmpty(Set<String> set) {
        return set.isEmpty();
    }

    /** Returns an Iterator over the elements in the set. Has no guaranteed order (except for LinkedHashSet/TreeSet). */
    public static Iterator<String> iterator(Set<String> set) {
        return set.iterator();
    }

    /** Returns an array containing all elements of the set. */
    public static Object[] toArray(Set<String> set) {
        return set.toArray();
    }

    /** Returns a typed array containing all elements of the set. */
    public static String[] toTypedArray(Set<String> set) {
        return set.toArray(new String[0]);
    }

    /** Performs the given action on each element until all have been processed. (Prints each element as a demo.) */
    public static void forEach(Set<String> set) {
        set.forEach(System.out::println);
    }

    /** Creates a Spliterator over the elements in the set. */
    public static Spliterator<String> spliterator(Set<String> set) {
        return set.spliterator();
    }

    /** Returns a new set containing the union of two sets (a ∪ b). Does not modify the original sets. */
    public static Set<String> union(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    /** Returns a new set containing the intersection of two sets (a ∩ b). */
    public static Set<String> intersection(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    /** Returns a new set containing the difference of two sets (a \ b). */
    public static Set<String> difference(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }
}
