package org.data.mathUtils;

/**
 * Demonstrates all key methods of the {@link java.lang.Math} class.
 * Each static method performs exactly one mathematical operation.
 */
public class MathOperations {

    /** Returns the mathematical constant π (pi). */
    public static double piConstant() {
        return Math.PI;
    }

    /** Returns the mathematical constant e (Euler's number). */
    public static double eConstant() {
        return Math.E;
    }

    /** Raises a to the power of b (a^b). */
    public static double powOperation(double a, double b) {
        return Math.pow(a, b);
    }

    /** Returns the positive square root of x. */
    public static double sqrtOperation(double x) {
        return Math.sqrt(x);
    }

    /** Returns the cube root of x. Works for negative inputs as well. */
    public static double cbrtOperation(double x) {
        return Math.cbrt(x);
    }

    /** Returns e raised to the power of x (e^x). */
    public static double expOperation(double x) {
        return Math.exp(x);
    }

    /** Returns the natural logarithm (base e) of x. */
    public static double logOperation(double x) {
        return Math.log(x);
    }

    /** Returns the base-10 logarithm of x. */
    public static double log10Operation(double x) {
        return Math.log10(x);
    }

    /** Converts an angle from degrees to radians. */
    public static double toRadiansOperation(double degrees) {
        return Math.toRadians(degrees);
    }

    /** Converts an angle from radians to degrees. */
    public static double toDegreesOperation(double radians) {
        return Math.toDegrees(radians);
    }

    /** Returns the sine of an angle (in radians). */
    public static double sinOperation(double radians) {
        return Math.sin(radians);
    }

    /** Returns the cosine of an angle (in radians). */
    public static double cosOperation(double radians) {
        return Math.cos(radians);
    }

    /** Returns the tangent of an angle (in radians). */
    public static double tanOperation(double radians) {
        return Math.tan(radians);
    }

    /** Returns the arc sine (inverse sine) of a value, in radians. */
    public static double asinOperation(double value) {
        return Math.asin(value);
    }

    /** Returns the arc cosine (inverse cosine) of a value, in radians. */
    public static double acosOperation(double value) {
        return Math.acos(value);
    }

    /** Returns the arc tangent (inverse tangent) of a value, in radians. */
    public static double atanOperation(double value) {
        return Math.atan(value);
    }

    /** Returns the angle (in radians) from the positive X axis to the point (x, y). */
    public static double atan2Operation(double y, double x) {
        return Math.atan2(y, x);
    }

    /** Returns the hyperbolic sine of x. */
    public static double sinhOperation(double x) {
        return Math.sinh(x);
    }

    /** Returns the hyperbolic cosine of x. */
    public static double coshOperation(double x) {
        return Math.cosh(x);
    }

    /** Returns the hyperbolic tangent of x. */
    public static double tanhOperation(double x) {
        return Math.tanh(x);
    }

    /** Returns the sign of x: -1.0 for negative, 0.0 for zero, 1.0 for positive. */
    public static double signumOperation(double x) {
        return Math.signum(x);
    }

    /** Rounds x to the nearest whole number (ties round up). */
    public static long roundOperation(double x) {
        return Math.round(x);
    }

    /** Returns the smallest integer ≥ x (as a double). */
    public static double ceilOperation(double x) {
        return Math.ceil(x);
    }

    /** Returns the largest integer ≤ x (as a double). */
    public static double floorOperation(double x) {
        return Math.floor(x);
    }

    /** Rounds x to the nearest integer, with ties rounding to the nearest even value. */
    public static double rintOperation(double x) {
        return Math.rint(x);
    }

    /** Integer division rounding toward negative infinity. */
    public static int floorDivOperation(int x, int y) {
        return Math.floorDiv(x, y);
    }

    /** Remainder after floor division (positive when divisor positive). */
    public static int floorModOperation(int x, int y) {
        return Math.floorMod(x, y);
    }

    /** Returns the absolute value of x. */
    public static int absOperation(int x) {
        return Math.abs(x);
    }

    /** Returns the smaller of two values. */
    public static int minOperation(int a, int b) {
        return Math.min(a, b);
    }

    /** Returns the larger of two values. */
    public static int maxOperation(int a, int b) {
        return Math.max(a, b);
    }

    /** Returns a pseudorandom double in [0.0, 1.0). */
    public static double randomOperation() {
        return Math.random();
    }

    /** Adds two ints, throwing ArithmeticException on overflow. */
    public static int addExactOperation(int a, int b) {
        return Math.addExact(a, b);
    }

    /** Subtracts two ints, throwing exception on overflow. */
    public static int subtractExactOperation(int a, int b) {
        return Math.subtractExact(a, b);
    }

    /** Multiplies two ints, throwing exception on overflow. */
    public static int multiplyExactOperation(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    /** Converts a long to int, throwing exception if value out of int range. */
    public static int toIntExactOperation(long value) {
        return Math.toIntExact(value);
    }

    /** Returns the smallest floating-point value greater than x. */
    public static double nextUpOperation(double x) {
        return Math.nextUp(x);
    }

    /** Returns the largest floating-point value smaller than x. */
    public static double nextDownOperation(double x) {
        return Math.nextDown(x);
    }

    /** Fused multiply–add: returns (a * b + c) with greater precision. */
    public static double fmaOperation(double a, double b, double c) {
        return Math.fma(a, b, c);
    }

    /** Returns sqrt(x^2 + y^2) without intermediate overflow or underflow. */
    public static double hypotOperation(double x, double y) {
        return Math.hypot(x, y);
    }
}
