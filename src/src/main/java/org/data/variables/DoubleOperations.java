package org.data.variables;


public class DoubleOperations {

    /** Boxes a primitive double into a Double object (auto-boxing would also work). */
    public static Double boxDouble(double d) {
        return Double.valueOf(d);
    }

    /** Unboxes a Double object to a primitive double. */
    public static double unboxDouble(Double obj) {
        return obj.doubleValue();
    }

    /** Parses a decimal string and returns a primitive double. Throws NumberFormatException on error. */
    public static double parseDoubleFromString(String str) {
        return Double.parseDouble(str);
    }

    /** Parses a string and returns a Double object (caches are not used for Double). */
    public static Double valueOfDoubleFromString(String str) {
        return Double.valueOf(str);
    }

    /** Compares two primitive doubles numerically (handles NaN, -0.0 correctly). Returns 0, <0, or >0. */
    public static int compareDoubleValues(double x, double y) {
        return Double.compare(x, y);
    }

    /** Checks if two Double objects are equal using the equals contract (NaN==NaN is true, +0.0==-0.0 is false). */
    public static boolean equalsDoubleObjects(Double a, Double b) {
        return a.equals(b);
    }

    /** Returns true if the value is NaN. */
    public static boolean isNaNDouble(double v) {
        return Double.isNaN(v);
    }

    /** Returns true if the value is infinite (positive or negative). */
    public static boolean isInfiniteDouble(double v) {
        return Double.isInfinite(v);
    }

    /** Returns true if the value is finite (neither NaN nor infinite). */
    public static boolean isFiniteDouble(double v) {
        return Double.isFinite(v);
    }

    /** Returns the larger of two doubles as per Math.max, but uses Double.max (Java 8+). */
    public static double maxDouble(double x, double y) {
        return Double.max(x, y);
    }

    /** Returns the smaller of two doubles as per Math.min, but uses Double.min (Java 8+). */
    public static double minDouble(double x, double y) {
        return Double.min(x, y);
    }

    /** Returns the sum of two doubles (exactly like the + operator). */
    public static double sumDouble(double x, double y) {
        return Double.sum(x, y);
    }

    /** Converts a double to its IEEE 754 long bit representation. */
    public static long doubleToLongBitsDouble(double value) {
        return Double.doubleToLongBits(value);
    }

    /** Converts a double to its IEEE 754 long bit representation, preserving NaN payloads. */
    public static long doubleToRawLongBitsDouble(double value) {
        return Double.doubleToRawLongBits(value);
    }

    /** Recreates a double from its IEEE 754 bit representation (as returned by doubleToLongBits). */
    public static double longBitsToDoubleLongBits(long bits) {
        return Double.longBitsToDouble(bits);
    }

    /** Returns the positive infinity constant. */
    public static double positiveInfinityDouble() {
        return Double.POSITIVE_INFINITY;
    }

    /** Returns the negative infinity constant. */
    public static double negativeInfinityDouble() {
        return Double.NEGATIVE_INFINITY;
    }

    /** Returns the NaN constant. */
    public static double nanDouble() {
        return Double.NaN;
    }

    /** Returns the maximum finite value a double can represent. */
    public static double maxValueDouble() {
        return Double.MAX_VALUE;
    }

    /** Returns the smallest positive non-zero value a double can represent. */
    public static double minNormalDouble() {
        return Double.MIN_NORMAL;
    }

    /** Returns the smallest positive non-zero value (including subnormals). */
    public static double minValueDouble() {
        return Double.MIN_VALUE;
    }

    /** Returns a hash code for a double value, consistent with Double.hashCode(). */
    public static int hashCodeDouble(double value) {
        return Double.hashCode(value);
    }

    /** Returns a hexadecimal string representation of the double. */
    public static String toHexStringDouble(double d) {
        return Double.toHexString(d);
    }

    /** Returns a decimal string representation of the double. */
    public static String toStringDouble(double d) {
        return Double.toString(d);
    }
}
