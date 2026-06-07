package org.data.collections;

import java.util.*;

public class DequeOperations {

    /** Inserts at the front; throws IllegalStateException if the deque is full (ArrayDeque never is). */
    public static Deque<String> addFirstToDeque(Deque<String> deque, String element) {
        deque.addFirst(element);
        return deque;
    }

    /** Inserts at the front; returns true on success, false if the deque is capacity‑constrained and full. */
    public static Deque<String> offerFirstToDeque(Deque<String> deque, String element) {
        deque.offerFirst(element);
        return deque;
    }

    /** Inserts at the back; throws IllegalStateException if full. */
    public static Deque<String> addLastToDeque(Deque<String> deque, String element) {
        deque.addLast(element);
        return deque;
    }

    /** Inserts at the back; returns true on success, false if full. */
    public static Deque<String> offerLastToDeque(Deque<String> deque, String element) {
        deque.offerLast(element);
        return deque;
    }

    /** Retrieves and removes the first element; throws NoSuchElementException if empty. */
    public static Deque<String> removeFirstFromDeque(Deque<String> deque) {
        deque.removeFirst();          // element ignored; we return the deque
        return deque;
    }

    /** Retrieves and removes the first element; returns null if empty. */
    public static Deque<String> pollFirstFromDeque(Deque<String> deque) {
        deque.pollFirst();
        return deque;
    }

    /** Retrieves and removes the last element; throws NoSuchElementException if empty. */
    public static Deque<String> removeLastFromDeque(Deque<String> deque) {
        deque.removeLast();
        return deque;
    }

    /** Retrieves and removes the last element; returns null if empty. */
    public static Deque<String> pollLastFromDeque(Deque<String> deque) {
        deque.pollLast();
        return deque;
    }

    /** Retrieves, but does not remove, the first element; throws NoSuchElementException if empty. */
    public static String getFirstOfDeque(Deque<String> deque) {
        return deque.getFirst();
    }

    /** Retrieves, but does not remove, the first element; returns null if empty. */
    public static String peekFirstOfDeque(Deque<String> deque) {
        return deque.peekFirst();
    }

    /** Retrieves, but does not remove, the last element; throws NoSuchElementException if empty. */
    public static String getLastOfDeque(Deque<String> deque) {
        return deque.getLast();
    }

    /** Retrieves, but does not remove, the last element; returns null if empty. */
    public static String peekLastOfDeque(Deque<String> deque) {
        return deque.peekLast();
    }

    /** Pushes an element onto the stack represented by the deque (equivalent to addFirst). */
    public static Deque<String> pushToDeque(Deque<String> deque, String element) {
        deque.push(element);
        return deque;
    }

    /** Pops an element from the stack (equivalent to removeFirst); throws NoSuchElementException if empty. */
    public static Deque<String> popFromDeque(Deque<String> deque) {
        deque.pop();
        return deque;
    }

    /** Adds an element at the back (Queue’s add); throws exception if full. */
    public static Deque<String> addToDeque(Deque<String> deque, String element) {
        deque.add(element);
        return deque;
    }

    /** Inserts at the back (Queue’s offer); returns false if full. */
    public static Deque<String> offerToDeque(Deque<String> deque, String element) {
        deque.offer(element);
        return deque;
    }

    /** Removes and returns the front element (Queue’s remove); throws exception if empty. */
    public static Deque<String> removeFromDeque(Deque<String> deque) {
        deque.remove();
        return deque;
    }

    /** Removes and returns the front element (Queue’s poll); returns null if empty. */
    public static Deque<String> pollFromDeque(Deque<String> deque) {
        deque.poll();
        return deque;
    }

    /** Examines the front element (Queue’s element); throws exception if empty. */
    public static String elementOfDeque(Deque<String> deque) {
        return deque.element();
    }

    /** Examines the front element (Queue’s peek); returns null if empty. */
    public static String peekOfDeque(Deque<String> deque) {
        return deque.peek();
    }

    /** Returns the number of elements in the deque. */
    public static int sizeOfDeque(Deque<String> deque) {
        return deque.size();
    }

    /** Checks whether the deque is empty. */
    public static boolean isEmptyDeque(Deque<String> deque) {
        return deque.isEmpty();
    }

    /** Checks if the deque contains the specified element. */
    public static boolean containsInDeque(Deque<String> deque, String element) {
        return deque.contains(element);
    }

    /** Removes all elements from the deque. */
    public static Deque<String> clearDeque(Deque<String> deque) {
        deque.clear();
        return deque;
    }

    /** Adds all elements from the given collection to the back of the deque. */
    public static Deque<String> addAllToDeque(Deque<String> deque, Collection<String> elements) {
        deque.addAll(elements);
        return deque;
    }

    /** Removes the first occurrence of the element (if present). */
    public static Deque<String> removeFirstOccurrenceFromDeque(Deque<String> deque, String element) {
        deque.removeFirstOccurrence(element);
        return deque;
    }

    /** Removes the last occurrence of the element (if present). */
    public static Deque<String> removeLastOccurrenceFromDeque(Deque<String> deque, String element) {
        deque.removeLastOccurrence(element);
        return deque;
    }

    /** Returns an iterator over the elements in the deque (head to tail). */
    public static Iterator<String> iteratorDeque(Deque<String> deque) {
        return deque.iterator();
    }

    /** Returns an iterator over the elements in reverse order (tail to head). */
    public static Iterator<String> descendingIteratorDeque(Deque<String> deque) {
        return deque.descendingIterator();
    }
}
