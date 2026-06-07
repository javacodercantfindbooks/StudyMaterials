package org.data.collections;


import java.util.*;

public class QueueOperations {

    /** Inserts the element at the back of the queue. Throws IllegalStateException if full (but LinkedList is unlimited). */
    public static Queue<String> addToQueue(Queue<String> queue, String element) {
        queue.add(element);
        return queue;
    }

    /** Inserts the element at the back of the queue. Returns true if successful, false if full (but LinkedList never rejects). */
    public static Queue<String> offerToQueue(Queue<String> queue, String element) {
        queue.offer(element);
        return queue;
    }

    /** Retrieves and removes the front element. Throws NoSuchElementException if empty. */
    public static Queue<String> removeFromQueue(Queue<String> queue) {
        queue.remove();          // element returned, but we ignore here to keep the queue as return value
        return queue;
    }

    /** Retrieves and removes the front element, or returns null if the queue is empty. */
    public static Queue<String> pollFromQueue(Queue<String> queue) {
        queue.poll();
        return queue;
    }

    /** Retrieves, but does not remove, the front element. Throws NoSuchElementException if empty. */
    public static String elementOfQueue(Queue<String> queue) {
        return queue.element();
    }

    /** Retrieves, but does not remove, the front element, or returns null if empty. */
    public static String peekOfQueue(Queue<String> queue) {
        return queue.peek();
    }

    /** Returns the number of elements in the queue. */
    public static int sizeOfQueue(Queue<String> queue) {
        return queue.size();
    }

    /** Returns true if the queue is empty. */
    public static boolean isEmptyQueue(Queue<String> queue) {
        return queue.isEmpty();
    }

    /** Checks if the queue contains the specified element. */
    public static boolean containsInQueue(Queue<String> queue, String element) {
        return queue.contains(element);
    }

    /** Adds all elements from the given collection to the back of the queue. */
    public static Queue<String> addAllToQueue(Queue<String> queue, Collection<String> elements) {
        queue.addAll(elements);
        return queue;
    }

    /** Removes all elements from the queue. */
    public static Queue<String> clearQueue(Queue<String> queue) {
        queue.clear();
        return queue;
    }

    /** Applies the given action to each element in the queue until all have been processed. */
    public static Queue<String> forEachQueue(Queue<String> queue) {
        queue.forEach(System.out::println);
        return queue;
    }

    /** Returns an array containing all elements of the queue. */
    public static Object[] toArrayQueue(Queue<String> queue) {
        return queue.toArray();
    }

    /** Returns a typed array containing all elements of the queue. */
    public static String[] toTypedArrayQueue(Queue<String> queue) {
        return queue.toArray(new String[0]);
    }
}
