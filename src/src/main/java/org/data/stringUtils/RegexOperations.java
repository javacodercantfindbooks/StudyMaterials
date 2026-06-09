package org.data.stringUtils;

import java.util.regex.*;
import java.util.*;

/**
 * Demonstrates key operations of the {@link Pattern} and {@link Matcher} classes for regular expressions.
 * Every static method performs exactly one regex-related operation.
 */
public class RegexOperations {

    /** Compiles a regex string into a Pattern. */
    public static Pattern compilePattern(String regex) {
        return Pattern.compile(regex);
    }

    /** Compiles a regex with flags (e.g., Pattern.CASE_INSENSITIVE). */
    public static Pattern compilePatternWithFlags(String regex, int flags) {
        return Pattern.compile(regex, flags);
    }

    /** Creates a Matcher from a pattern and input text. */
    public static Matcher createMatcher(Pattern pattern, String input) {
        return pattern.matcher(input);
    }

    /** Finds the next subsequence that matches the pattern. Returns true if a match is found. */
    public static boolean find(Matcher matcher) {
        return matcher.find();
    }

    /** Finds matches starting at the given index. */
    public static boolean findFrom(Matcher matcher, int start) {
        return matcher.find(start);
    }

    /** Returns the entire matched substring (must call find() first). */
    public static String group(Matcher matcher) {
        return matcher.group();
    }

    /** Returns the captured group with the given index (0 = entire match). */
    public static String groupAtIndex(Matcher matcher, int group) {
        return matcher.group(group);
    }

    /** Returns the number of capturing groups in the pattern. */
    public static int groupCount(Matcher matcher) {
        return matcher.groupCount();
    }

    /** Attempts to match the entire input against the pattern. */
    public static boolean matches(Matcher matcher) {
        return matcher.matches();
    }

    /** Attempts to match the input, starting at the beginning, but not requiring the whole input. */
    public static boolean lookingAt(Matcher matcher) {
        return matcher.lookingAt();
    }

    /** Replaces every occurrence of the pattern in the input with the given replacement. */
    public static String replaceAll(Matcher matcher, String replacement) {
        return matcher.replaceAll(replacement);
    }

    /** Replaces the first occurrence of the pattern with the replacement. */
    public static String replaceFirst(Matcher matcher, String replacement) {
        return matcher.replaceFirst(replacement);
    }

    /** Sets the limits of the region to be considered for matching. */
    public static Matcher region(Matcher matcher, int start, int end) {
        return matcher.region(start, end);
    }

    /** Uses transparent bounds: lookahead/lookbehind can see beyond the region boundaries. */
    public static Matcher useTransparentBounds(Matcher matcher, boolean b) {
        return matcher.useTransparentBounds(b);
    }

    /** Splits the input string around matches of the pattern. */
    public static String[] split(Pattern pattern, String input) {
        return pattern.split(input);
    }

    /** Splits the input string around matches of the pattern, limiting the number of results. */
    public static String[] splitWithLimit(Pattern pattern, String input, int limit) {
        return pattern.split(input, limit);
    }

    /** Compiles the regex and attempts to match the entire input (static convenience). */
    public static boolean matchesRegex(String regex, String input) {
        return Pattern.matches(regex, input);
    }

    /** Returns a literal pattern String for the given string (escapes special characters). */
    public static String quote(String literal) {
        return Pattern.quote(literal);
    }
}
