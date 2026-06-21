package org.data.mathUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class BigDecimalOperations {

    /** Creates a BigDecimal from a string. (Never use new BigDecimal(double) – it may introduce rounding errors.) */
    public static BigDecimal valueOf(String value) {
        return new BigDecimal(value);
    }

    /** Returns the constant ZERO (BigDecimal.ZERO). */
    public static BigDecimal zeroConstant() {
        return BigDecimal.ZERO;
    }

    /** Returns the constant ONE. */
    public static BigDecimal oneConstant() {
        return BigDecimal.ONE;
    }

    /** Returns the constant TEN. */
    public static BigDecimal tenConstant() {
        return BigDecimal.TEN;
    }

    /** Adds two BigDecimals. */
    public static BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    /** Subtracts b from a. */
    public static BigDecimal subtract(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    /** Multiplies two BigDecimals. */
    public static BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    /** Divides a by b with a given scale and rounding mode (e.g., 2 decimals, HALF_UP). */
    public static BigDecimal divide(BigDecimal a, BigDecimal b, int scale, RoundingMode mode) {
        return a.divide(b, scale, mode);
    }

    /** Divides a by b, using the standard divide (may throw ArithmeticException if non‑terminating). */
    public static BigDecimal divideExact(BigDecimal a, BigDecimal b) {
        return a.divide(b);
    }

    /** Remainder of division (a % b). */
    public static BigDecimal remainder(BigDecimal a, BigDecimal b) {
        return a.remainder(b);
    }

    /** Raises a to the power n (n must be non‑negative integer). */
    public static BigDecimal pow(BigDecimal a, int n) {
        return a.pow(n);
    }

    /** Returns the scale (number of digits to the right of the decimal point). */
    public static int scale(BigDecimal a) {
        return a.scale();
    }

    /** Returns a BigDecimal with the specified scale, using the given rounding mode. */
    public static BigDecimal setScale(BigDecimal a, int newScale, RoundingMode mode) {
        return a.setScale(newScale, mode);
    }

    /** Removes trailing zeros (e.g., "2.3000" → "2.3"). */
    public static BigDecimal stripTrailingZeros(BigDecimal a) {
        return a.stripTrailingZeros();
    }

    /** Moves the decimal point left by n places. */
    public static BigDecimal movePointLeft(BigDecimal a, int n) {
        return a.movePointLeft(n);
    }

    /** Moves the decimal point right by n places. */
    public static BigDecimal movePointRight(BigDecimal a, int n) {
        return a.movePointRight(n);
    }

    /** Returns the precision (total number of significant digits). */
    public static int precision(BigDecimal a) {
        return a.precision();
    }

    /** Returns -1, 0, or 1 as this BigDecimal is negative, zero, or positive. */
    public static int signum(BigDecimal a) {
        return a.signum();
    }

    /** Compares two BigDecimals numerically (returns -1, 0, 1). */
    public static int compareTo(BigDecimal a, BigDecimal b) {
        return a.compareTo(b);
    }

    /** Returns true if the values are equal (ignoring scale: "2.0" equals "2.00"). */
    public static boolean isEqual(BigDecimal a, BigDecimal b) {
        return a.compareTo(b) == 0;
    }

    /** Returns the minimum of two BigDecimals. */
    public static BigDecimal min(BigDecimal a, BigDecimal b) {
        return a.min(b);
    }

    /** Returns the maximum of two BigDecimals. */
    public static BigDecimal max(BigDecimal a, BigDecimal b) {
        return a.max(b);
    }

    /** Converts to a plain string (no scientific notation, always shows exact value). */
    public static String toPlainString(BigDecimal a) {
        return a.toPlainString();
    }

    /** Converts to engineering notation string (if needed). */
    public static String toEngineeringString(BigDecimal a) {
        return a.toEngineeringString();
    }

    /** Converts to a double (may lose precision). */
    public static double toDouble(BigDecimal a) {
        return a.doubleValue();
    }

    /** Converts to an int (truncates fractional part, may overflow). */
    public static int toInt(BigDecimal a) {
        return a.intValue();
    }

    /** Converts to a long (truncates fractional part, may overflow). */
    public static long toLong(BigDecimal a) {
        return a.longValue();
    }

    /** Negates the value (returns -a). */
    public static BigDecimal negate(BigDecimal a) {
        return a.negate();
    }

    /** Returns the absolute value. */
    public static BigDecimal abs(BigDecimal a) {
        return a.abs();
    }
}