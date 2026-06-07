package org.data.collections;
import java.util.*;

public class ArrayListOperations {

    // Adds an element to the end of the list, returns the modified list.
    public static List<String> addElement(List<String> list, String element) {
        list.add(element);
        return list;
    }

    // Removes the first occurrence of the element, returns the modified list.
    public static List<String> removeElement(List<String> list, String element) {
        list.remove(element);
        return list;
    }

    // Sorts the list in natural (lexicographic) order, returns the modified list.
    public static List<String> sortList(List<String> list) {
        list.sort(Comparator.naturalOrder());
        return list;
    }

    // Removes all elements, returns the now empty list.
    public static List<String> clearList(List<String> list) {
        list.clear();
        return list;
    }

    // Inserts an element at the specified index, shifting others to the right.
    public static List<String> addAtIndex(List<String> list, int index, String element) {
        list.add(index, element);
        return list;
    }

    // Adds all elements from another collection to the end of the list.
    public static List<String> addAll(List<String> list, Collection<String> elements) {
        list.addAll(elements);
        return list;
    }

    // Adds an element at the beginning (uses add(0, ...), efficient for LinkedList).
    public static List<String> addFirst(List<String> list, String element) {
        list.add(0, element);   // or list.addFirst(element) if using Java 21+
        return list;
    }

    // Adds an element at the end – same as add(), but explicit.
    public static List<String> addLast(List<String> list, String element) {
        list.add(element);      // or list.addLast(element) if using Java 21+
        return list;
    }

    // Removes all elements that are also in the given collection, returns the modified list.
    public static List<String> removeAll(List<String> list, Collection<String> toRemove) {
        list.removeAll(toRemove);
        return list;
    }

    // Keeps only the elements that are also in the given collection, returns the modified list.
    public static List<String> retainAll(List<String> list, Collection<String> toRetain) {
        list.retainAll(toRetain);
        return list;
    }

    // Replaces every element by applying the given transformation (here it appends "!").
    public static List<String> replaceAll(List<String> list) {
        list.replaceAll(s -> s + "!");   // example: you can pass any UnaryOperator<String>
        return list;
    }

// Query / non‑modifying methods – return the requested information

    // Returns true if the list contains the given element.
    public static boolean contains(List<String> list, String element) {
        return list.contains(element);
    }

    // Returns true if the list contains all elements of the given collection.
    public static boolean containsAll(List<String> list, Collection<String> elements) {
        return list.containsAll(elements);
    }

    // Returns the element at the specified index.
    public static String getElement(List<String> list, int index) {
        return list.get(index);
    }

    // Returns the index of the first occurrence of the element, or -1 if not found.
    public static int indexOf(List<String> list, String element) {
        return list.indexOf(element);
    }

    // Returns the index of the last occurrence of the element, or -1 if not found.
    public static int lastIndexOf(List<String> list, String element) {
        return list.lastIndexOf(element);
    }

    // Returns a view of the portion between fromIndex (inclusive) and toIndex (exclusive).
    public static List<String> sublist(List<String> list, int from, int to) {
        return list.subList(from, to);
    }

    // Returns a reversed view of the list (Java 21+). Modifications to the view affect the original.
    public static List<String> reversed(List<String> list) {
        return list.reversed();   // requires Java 21+; otherwise use new ArrayList<>(list) + Collections.reverse
    }

// Iterator methods – each demonstrates a single iterator capability

    // Returns a ListIterator starting at the beginning of the list.
    public static ListIterator<String> getIterator(List<String> list) {
        return list.listIterator();
    }

    // Returns a ListIterator starting at the specified index.
    public static ListIterator<String> getIteratorFromIndex(List<String> list, int index) {
        return list.listIterator(index);
    }

    // Demonstrates forward traversal: prints every element and returns the (unchanged) list.
    public static List<String> iterateForward(List<String> list) {
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        return list;   // list is unchanged
    }

    // Demonstrates backward traversal: prints elements in reverse order using hasPrevious()/previous().
    // Requires the iterator to be positioned at the end first.
    public static List<String> iterateBackward(List<String> list) {
        ListIterator<String> it = list.listIterator(list.size()); // start at the end
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
        return list;
    }

    // Uses iterator to update elements: replaces every occurrence of "old" with "new".
    // Returns the list with the replacements applied.
    public static List<String> updateWithIterator(List<String> list, String oldStr, String newStr) {
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            if (it.next().equals(oldStr)) {
                it.set(newStr);
            }
        }
        return list;
    }

    // Uses iterator to remove elements that match the given filter.
    // Returns the list with matching elements removed.
    public static List<String> removeWithIterator(List<String> list, String toRemove) {
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            if (it.next().equals(toRemove)) {
                it.remove();
            }
        }
        return list;
    }

    // Demonstrates forEachRemaining: prints all remaining elements after skipping the first 'skip' ones.
    public static List<String> forEachRemainingDemo(List<String> list, int skip) {
        ListIterator<String> it = list.listIterator();
        for (int i = 0; i < skip && it.hasNext(); i++) {
            it.next();           // advance
        }
        it.forEachRemaining(System.out::println);   // prints the rest
        return list;
    }

// Spliterator example – splits the list and prints elements in parallel-like manner

    // Returns a Spliterator over the list. Then demonstrates tryAdvance and splitting.
    public static void demonstrateSpliterator(List<String> list) {
        Spliterator<String> spliterator = list.spliterator();
        System.out.println("Estimated size: " + spliterator.estimateSize());

        // tryAdvance – consume one element at a time
        spliterator.tryAdvance(s -> System.out.println("First element: " + s));

        // Split the remaining work
        Spliterator<String> secondHalf = spliterator.trySplit();
        if (secondHalf != null) {
            System.out.println("Second half elements:");
            secondHalf.forEachRemaining(s -> System.out.print(s + " "));
            System.out.println();
        }
        System.out.println("First half remaining:");
        spliterator.forEachRemaining(s -> System.out.print(s + " "));
        System.out.println();
    }
}
