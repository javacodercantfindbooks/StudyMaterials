package org.data.stringUtils;

/**
 * Demonstrates key methods of {@link StringBuilder}.
 * Each static method performs exactly one StringBuilder operation.
 * Modification methods return the StringBuilder itself for chaining.
 */
public class StringBuilderOperations {

    /** Appends a string to the builder. Returns the builder. */
    public static StringBuilder appendString(StringBuilder sb, String str) {
        return sb.append(str);
    }

    /** Appends an integer to the builder. */
    public static StringBuilder appendInt(StringBuilder sb, int value) {
        return sb.append(value);
    }

    /** Appends a boolean to the builder. */
    public static StringBuilder appendBoolean(StringBuilder sb, boolean value) {
        return sb.append(value);
    }

    /** Inserts a string at the specified offset. */
    public static StringBuilder insertString(StringBuilder sb, int offset, String str) {
        return sb.insert(offset, str);
    }

    /** Inserts an integer at the specified offset. */
    public static StringBuilder insertInt(StringBuilder sb, int offset, int value) {
        return sb.insert(offset, value);
    }

    /** Deletes characters from start to end (exclusive). */
    public static StringBuilder deleteRange(StringBuilder sb, int start, int end) {
        return sb.delete(start, end);
    }

    /** Deletes the character at the specified index. */
    public static StringBuilder deleteCharAt(StringBuilder sb, int index) {
        return sb.deleteCharAt(index);
    }

    /** Replaces characters in the given range with the specified string. */
    public static StringBuilder replaceRange(StringBuilder sb, int start, int end, String str) {
        return sb.replace(start, end, str);
    }

    /** Reverses the character sequence. */
    public static StringBuilder reverse(StringBuilder sb) {
        return sb.reverse();
    }

    /** Sets the character at the specified index. */
    public static StringBuilder setCharAt(StringBuilder sb, int index, char ch) {
        sb.setCharAt(index, ch);
        return sb;
    }

    /** Returns the current length (number of characters). */
    public static int length(StringBuilder sb) {
        return sb.length();
    }

    /** Sets the length of the character sequence. */
    public static StringBuilder setLength(StringBuilder sb, int newLength) {
        sb.setLength(newLength);
        return sb;
    }

    /** Returns the current capacity (size of internal buffer). */
    public static int capacity(StringBuilder sb) {
        return sb.capacity();
    }

    /** Ensures the capacity is at least the given minimum. */
    public static StringBuilder ensureCapacity(StringBuilder sb, int minCapacity) {
        sb.ensureCapacity(minCapacity);
        return sb;
    }

    /** Trims the capacity to the current length. */
    public static StringBuilder trimToSize(StringBuilder sb) {
        sb.trimToSize();
        return sb;
    }

    /** Returns the character at the given index. */
    public static char charAt(StringBuilder sb, int index) {
        return sb.charAt(index);
    }

    /** Returns the index of the first occurrence of the substring, or -1. */
    public static int indexOf(StringBuilder sb, String str) {
        return sb.indexOf(str);
    }

    /** Returns the index of the first occurrence of the substring starting from the given index. */
    public static int indexOfFrom(StringBuilder sb, String str, int fromIndex) {
        return sb.indexOf(str, fromIndex);
    }

    /** Returns the index of the last occurrence of the substring. */
    public static int lastIndexOf(StringBuilder sb, String str) {
        return sb.lastIndexOf(str);
    }

    /** Returns the index of the last occurrence of the substring, searching backward from fromIndex. */
    public static int lastIndexOfFrom(StringBuilder sb, String str, int fromIndex) {
        return sb.lastIndexOf(str, fromIndex);
    }

    /** Returns a new String containing the characters from start to end (exclusive). */
    public static String substring(StringBuilder sb, int start, int end) {
        return sb.substring(start, end);
    }

    /** Returns a new String containing characters from start to the end. */
    public static String substringFrom(StringBuilder sb, int start) {
        return sb.substring(start);
    }

    /** Converts the StringBuilder content to a String. */
    public static String toString(StringBuilder sb) {
        return sb.toString();
    }

    /** Compares the content of two StringBuilder objects for equality (character by character). */
    public static boolean contentEquals(StringBuilder a, StringBuilder b) {
        return a.toString().equals(b.toString());
    }
}
