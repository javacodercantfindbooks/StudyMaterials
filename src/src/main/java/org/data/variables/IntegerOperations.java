package org.data.variables;

public class IntegerOperations {
    // Simple boxing: primitive int → Integer wrapper (auto-boxing would also work)
    public Integer getIntegerBoxing(int i) {
        return (Integer) i;
    }

    // WARNING: Integer.getInteger(String) reads a *system property* by that name,
// NOT a numeric string. Returns null if property not found.
    public Integer getIntegerOfString(String str) {
        return Integer.getInteger(str);
    }

    // Like above, but returns the default val if the system property is missing.
    public Integer getIntegerOfString(String str, int val) {
        return Integer.getInteger(str, val);
    }

    // Parses a decimal numeric string and returns an Integer object.
// Throws NumberFormatException if the string is not a valid int.
    public Integer getIntegerValueOfString(String str) {
        return Integer.valueOf(str);
    }

    // Parses a string in the given radix (e.g., 16 for hex) and returns an int.
// The Integer.valueOf() result is auto-unboxed to int.
    public int getIntegerValueOfString(String str, int radix) {
        return Integer.valueOf(str, radix);
    }

    // Population count: number of 1-bits in the two’s complement representation.
    public int getBitCountInteger(int value) {
        return Integer.bitCount(value);
    }

    // Compares two ints numerically, returning 0, <0, or >0. Auto-boxes to Integer.
    public Integer compareInteger(int x, int y) {
        return Integer.compare(x, y);
    }

    // Unsigned comparison: treats both ints as unsigned 32-bit values.
    public Integer compareUnsignedInteger(int x, int y) {
        return Integer.compareUnsigned(x, y);
    }

    // Decodes a string that may start with "0x"/"#"/"0" (hex/octal) and returns Integer.
// Useful for parsing numbers written in different bases with standard prefixes.
    public Integer decodeInteger(String nm) {
        return Integer.decode(nm);
    }

    // Unsigned division: interprets dividend & divisor as unsigned, returns unsigned quotient.
    public int divideUnsignedInteger(int dividend, int divisor) {
        return Integer.divideUnsigned(dividend, divisor);
    }

    // Hash code of an int – simply returns the same value.
    public int getHashCodeInteger(int value) {
        return Integer.hashCode(value);
    }

    // Returns the highest (leftmost) one-bit, e.g., 10 (1010) → 8 (1000).
    public int getHighestOneBitInteger(int val) {
        return Integer.highestOneBit(val);
    }

    // Returns the larger of two ints (similar to Math.max).
    public int getMaxInteger(int x, int y) {
        return Integer.max(x, y);
    }

    // Counts zeros before the highest one-bit; leading zeros of 0 is 32.
    public int getNumberOfLeadingZeroesInteger(int number) {
        return Integer.numberOfLeadingZeros(number);
    }

    // Counts zeros after the lowest one-bit; trailing zeros of 0 is 32.
    public int getNumberOfTrailingZeroesInteger(int number) {
        return Integer.numberOfTrailingZeros(number);
    }

    // Parses a decimal string and returns primitive int. Throws NumberFormatException on error.
    public int parseInteger(String str) {
        return Integer.parseInt(str);
    }

    // Parses a string in the given radix (2–36) and returns int.
    public int parseInteger(String str, int i) {
        return Integer.parseInt(str, i);
    }

    // Parses a string as an *unsigned* decimal int (supports values up to 2³²-1).
// Returns int, but the bits may represent a negative number if > Integer.MAX_VALUE.
    public Integer parseUnsignedInteger(String str) {
        return Integer.parseUnsignedInt(str);
    }

    // Reverses all bits (bitwise reversal, not byte-order).
    public int reverseInteger(int i) {
        return Integer.reverse(i);
    }

    // Rotates bits left by the given distance; bits shifted out wrap around.
    public int rotateLeftInteger(int value, int distance) {
        return Integer.rotateLeft(value, distance);
    }

    // Rotates bits right by the given distance.
    public int rotateRightInteger(int value, int distance) {
        return Integer.rotateRight(value, distance);
    }

    // Returns -1, 0, or 1 indicating the sign of the argument.
    public int getSignumInteger(int i) {
        return Integer.signum(i);
    }

    // Sum of two ints (exactly x + y, provided as a convenience).
    public int getSumInteger(int x, int y) {
        return Integer.sum(x, y);
    }

    // Binary string representation (no leading zeros, e.g., 10 → "1010").
    public String getIntegerToBinaryString(int i) {
        return Integer.toBinaryString(i);
    }

    // Like valueOf(str, radix) but with parameters swapped for flexibility.
// Auto-unboxes to int.
    public int getValueOfInteger(int radix, String str) {
        return Integer.valueOf(str, radix);
    }
}
