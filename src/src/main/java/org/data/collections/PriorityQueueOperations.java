package org.data.collections;

import java.util.*;

public class PriorityQueueOperations {

    /** Inserts an element; returns the queue. Throws IllegalStateException only if the queue is capacity‑constrained (not the case here). */
    public static PriorityQueue<String> addElement(PriorityQueue<String> queue, String element) {
        queue.add(element);
        return queue;
    }

    /** Inserts an element; returns the queue. Safer version that returns false on failure (never fails for an unbounded queue). */
    public static PriorityQueue<String> offerElement(PriorityQueue<String> queue, String element) {
        queue.offer(element);
        return queue;
    }

    /** Removes and returns the head (priority) element. Throws NoSuchElementException if empty. */
    public static PriorityQueue<String> removeHead(PriorityQueue<String> queue) {
        queue.remove();          // element discarded for demo; the queue itself is returned
        return queue;
    }

    /** Removes and returns the head element, or returns null if empty. */
    public static PriorityQueue<String> pollHead(PriorityQueue<String> queue) {
        queue.poll();
        return queue;
    }

    /** Retrieves, but does not remove, the head element. Throws NoSuchElementException if empty. */
    public static String elementHead(PriorityQueue<String> queue) {
        return queue.element();
    }

    /** Retrieves, but does not remove, the head element, or returns null if empty. */
    public static String peekHead(PriorityQueue<String> queue) {
        return queue.peek();
    }

    /** Returns the comparator used to order the elements, or null if natural ordering is in effect. */
    public static Comparator<? super String> comparatorOfQueue(PriorityQueue<String> queue) {
        return queue.comparator();
    }

    /** Returns the number of elements in the priority queue. */
    public static int sizeOfQueue(PriorityQueue<String> queue) {
        return queue.size();
    }

    /** Checks if the priority queue is empty. */
    public static boolean isEmptyQueue(PriorityQueue<String> queue) {
        return queue.isEmpty();
    }

    /** Checks if the priority queue contains the specified element. */
    public static boolean containsInQueue(PriorityQueue<String> queue, String element) {
        return queue.contains(element);
    }

    /** Adds all elements from the given collection to the priority queue. */
    public static PriorityQueue<String> addAllToQueue(PriorityQueue<String> queue, Collection<String> elements) {
        queue.addAll(elements);
        return queue;
    }

    /** Removes all elements from the priority queue. */
    public static PriorityQueue<String> clearQueue(PriorityQueue<String> queue) {
        queue.clear();
        return queue;
    }

    /** Performs the given action on each element (iteration order is arbitrary; use poll() for sorted order). */
    public static PriorityQueue<String> forEachQueue(PriorityQueue<String> queue) {
        queue.forEach(System.out::println);
        return queue;
    }

    /** Returns an array containing all elements of the priority queue (no particular order). */
    public static Object[] toArrayQueue(PriorityQueue<String> queue) {
        return queue.toArray();
    }

    /** Returns a typed array containing all elements. */
    public static String[] toTypedArrayQueue(PriorityQueue<String> queue) {
        return queue.toArray(new String[0]);
    }

    /** Creates a new PriorityQueue that uses a reverse‑order comparator (max‑heap) and adds the given elements. */
    public static PriorityQueue<String> createMaxPriorityQueue(String... elements) {
        PriorityQueue<String> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());
        maxPQ.addAll(Arrays.asList(elements));
        return maxPQ;
    }
}
