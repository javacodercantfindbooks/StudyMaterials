package org.data.variables;


public class BooleanOperations {

    /** Boxes a primitive boolean into a Boolean object. */
    public static Boolean boxBoolean(boolean value) {
        return Boolean.valueOf(value);
    }

    /** Unboxes a Boolean object to a primitive boolean. */
    public static boolean unboxBoolean(Boolean obj) {
        return obj.booleanValue();
    }

    /** Parses a string and returns a primitive boolean ("true" → true, everything else → false). */
    public static boolean parseBooleanFromString(String str) {
        return Boolean.parseBoolean(str);
    }

    /** Returns a Boolean object representing the parsed string. */
    public static Boolean valueOfBooleanFromString(String str) {
        return Boolean.valueOf(str);
    }

    /** Compares two boolean primitives numerically (false < true). Returns 0, 1, or -1. */
    public static int compareBoolean(boolean x, boolean y) {
        return Boolean.compare(x, y);
    }

    /** Checks if two Boolean objects are equal (same value). */
    public static boolean equalsBoolean(Boolean a, Boolean b) {
        return a.equals(b);
    }

    /** Compares this Boolean with another Boolean object (useful for sorting). */
    public static int compareToBoolean(Boolean a, Boolean b) {
        return a.compareTo(b);
    }

    /** Logical AND: returns true only if both booleans are true. */
    public static boolean logicalAndBoolean(boolean x, boolean y) {
        return Boolean.logicalAnd(x, y);
    }

    /** Logical OR: returns true if at least one boolean is true. */
    public static boolean logicalOrBoolean(boolean x, boolean y) {
        return Boolean.logicalOr(x, y);
    }

    /** Logical XOR: returns true if exactly one boolean is true. */
    public static boolean logicalXorBoolean(boolean x, boolean y) {
        return Boolean.logicalXor(x, y);
    }

    /** Returns a hash code for a boolean value. */
    public static int hashCodeBoolean(boolean value) {
        return Boolean.hashCode(value);
    }

    /** Converts a boolean primitive to a String ("true" or "false"). */
    public static String toStringBooleanPrimitive(boolean value) {
        return Boolean.toString(value);
    }

    /** Converts a Boolean object to a String. */
    public static String toStringBooleanObject(Boolean obj) {
        return obj.toString();
    }

    /** Returns the Boolean constant TRUE. */
    public static Boolean trueBoolean() {
        return Boolean.TRUE;
    }

    /** Returns the Boolean constant FALSE. */
    public static Boolean falseBoolean() {
        return Boolean.FALSE;
    }
}
