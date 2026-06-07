package org.data.variables;

/**
 * Demonstrates key methods of the java.lang.Character class.
 * Each static method performs exactly one operation.
 */
public class CharacterOperations {

    /** Boxes a primitive char into a Character object. */
    public static Character boxCharacter(char ch) {
        return Character.valueOf(ch);
    }

    /** Unboxes a Character object to a primitive char. */
    public static char unboxCharacter(Character obj) {
        return obj.charValue();
    }

    /** Returns true if the character is a digit. */
    public static boolean isDigitCharacter(char ch) {
        return Character.isDigit(ch);
    }

    /** Returns true if the character is a letter. */
    public static boolean isLetterCharacter(char ch) {
        return Character.isLetter(ch);
    }

    /** Returns true if the character is a letter or digit. */
    public static boolean isLetterOrDigitCharacter(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    /** Returns true if the character is an uppercase letter. */
    public static boolean isUpperCaseCharacter(char ch) {
        return Character.isUpperCase(ch);
    }

    /** Returns true if the character is a lowercase letter. */
    public static boolean isLowerCaseCharacter(char ch) {
        return Character.isLowerCase(ch);
    }

    /** Returns true if the character is whitespace (space, tab, newline, etc.). */
    public static boolean isWhitespaceCharacter(char ch) {
        return Character.isWhitespace(ch);
    }

    /** Returns true if the character is a Unicode space character (includes non-breaking spaces). */
    public static boolean isSpaceCharCharacter(char ch) {
        return Character.isSpaceChar(ch);
    }

    /** Returns true if the character can start a Java identifier (letter, underscore, dollar sign). */
    public static boolean isJavaIdentifierStartCharacter(char ch) {
        return Character.isJavaIdentifierStart(ch);
    }

    /** Returns true if the character can be part of a Java identifier. */
    public static boolean isJavaIdentifierPartCharacter(char ch) {
        return Character.isJavaIdentifierPart(ch);
    }

    /** Returns true if the character is an ISO control character (0x00-0x1F or 0x7F-0x9F). */
    public static boolean isISOControlCharacter(char ch) {
        return Character.isISOControl(ch);
    }

    /** Converts the character to uppercase. */
    public static char toUpperCaseCharacter(char ch) {
        return Character.toUpperCase(ch);
    }

    /** Converts the character to lowercase. */
    public static char toLowerCaseCharacter(char ch) {
        return Character.toLowerCase(ch);
    }

    /** Returns the numeric value of the digit character (e.g., '5' → 5). Returns -1 if not a digit. */
    public static int digitCharacter(char ch) {
        return Character.digit(ch, 10);
    }

    /** Returns the numeric value of the character in the given radix (e.g., 'A' → 10 in radix 16). */
    public static int digitInRadixCharacter(char ch, int radix) {
        return Character.digit(ch, radix);
    }

    /** Converts a numeric value (0–35) back to its digit character in the given radix. */
    public static char forDigitCharacter(int digit, int radix) {
        return Character.forDigit(digit, radix);
    }

    /** Returns the number of char units needed to represent a code point (1 or 2). */
    public static int charCountCharacter(int codePoint) {
        return Character.charCount(codePoint);
    }

    /** Returns the numeric value of the code point (e.g., '5' → 5). */
    public static int getNumericValueCharacter(int codePoint) {
        return Character.getNumericValue(codePoint);
    }

    /** Converts a code point to a String containing the character(s). */
    public static String toStringCharacter(int codePoint) {
        return Character.toString(codePoint);
    }

    /** Converts a code point to a char array (may be 1 or 2 chars). */
    public static char[] toCharsCharacter(int codePoint) {
        return Character.toChars(codePoint);
    }

    /** Checks if a code point is a valid Unicode code point. */
    public static boolean isValidCodePointCharacter(int codePoint) {
        return Character.isValidCodePoint(codePoint);
    }

    /** Checks if a code point is in the supplementary (BMP+) range. */
    public static boolean isSupplementaryCodePointCharacter(int codePoint) {
        return Character.isSupplementaryCodePoint(codePoint);
    }

    /** Determines if the code point is a letter. */
    public static boolean isLetterCodePointCharacter(int codePoint) {
        return Character.isLetter(codePoint);
    }

    /** Determines if the code point is a digit. */
    public static boolean isDigitCodePointCharacter(int codePoint) {
        return Character.isDigit(codePoint);
    }

    /** Compares two Character objects numerically. */
    public static int compareCharacter(char x, char y) {
        return Character.compare(x, y);
    }

    /** Checks if two Character objects are equal (same value). */
    public static boolean equalsCharacter(Character a, Character b) {
        return a.equals(b);
    }

    /** Returns the hash code of a Character value (the char value itself). */
    public static int hashCodeCharacter(char value) {
        return Character.hashCode(value);
    }

    /** Returns a String representation of a character. */
    public static String toStringCharacter(char ch) {
        return Character.toString(ch);
    }

    /** Returns the char value of a Character (same as unbox). */
    public static char charValueCharacter(Character ch) {
        return ch.charValue();
    }
}