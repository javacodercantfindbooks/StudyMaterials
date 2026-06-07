package org.data.variables;

import java.util.Locale;
import java.util.stream.Collectors;

public class StringOperations {
    public static String replaceAllInString(String str, String regex, String replacement) {
        return str.replaceAll(regex, replacement);
    }
    public static byte[] getStringBytes(String str) {
        byte[] bytes = str.getBytes();
        return bytes;
    }
    public static String getLowerCaseStr(String str) {
        return str.toLowerCase(Locale.ROOT); //sets string to lowercase
    }
    public static String getUpperCaseStr(String str) {
        return str.toUpperCase(Locale.ROOT); //sets string to uppercase
    }
    public static String replaceStr(String str, char regex, char replacement) {
        return str.replace(regex, replacement);
    }
    public static String concatStr(String str, String addition) {
        return str.concat(addition); //adds a String to existing String
    }
    public static void internStr(String str){
        String intern = str.intern(); //it brings the original String out of the intern pool
        String nonIntern = new String(str); //for comparison
        System.out.println("str == intern ? " + (str == nonIntern));
        System.out.println("str == intern ? " + (str == intern));
        System.out.println("str.equals(nonIntern) ? " + str.equals(nonIntern));
    }
    public static String replaceFirstStr(String str, String regex, String replacement) {
        return str.replaceFirst(regex, replacement);
    }
    public static String substringStr(String str, int startIndex, int end) {
        return str.substring(startIndex, end);
    }
    public static char charAtStr(String text, int charAt) {
        char ch = text.charAt(charAt);
        System.out.println(ch);
        return ch;
    }
    public static String trimStr(String str) {
        return str.trim();
    }
    public static void charsStr(String str) {
        str.chars().forEach(c -> System.out.print((char) c + " "));;
    }
    public static void extractLettersWithCharsStr(String str) {
        str = str.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("Letters: " + str);
    }
    public static int getCodePointStr(String str, int index) {
        return str.codePointAt(index);
    }
    public static void codePointsStr(String str) {
        str.codePoints().forEach(System.out::println);
    }
    public static int compareStr(String str, String regex) {
        return str.compareTo(regex);
    }
    public static boolean containsStr(String str, String regex) {
        return (str.contains(regex));
    }
    public static boolean contentEqualsStr(String str, String regex) {
       return str.contentEquals(regex);
    }
    public static String describeConstableStr(String str) {
        return String.valueOf(str.describeConstable());
    }
    public static int lastIndexOfStr(String str, String regex, int fromIndex, int ch ) {
        return str.lastIndexOf(ch);
    }
    public static int lastIndexOfStr(String str, int fromIndex, int ch ) {
        return str.lastIndexOf(ch, fromIndex);
    }
    public static int lastIndexOfStr(String str, String regex) {
        return str.lastIndexOf(regex);
    }
    public static int lastIndexOfStr(String str, String regex, int fromIndex) {
        return str.lastIndexOf(regex, fromIndex);
    }
    public static boolean isEmptyStr(String str) {
        return str.isEmpty();
    }
    public static int lengthStr(String str) {
        return str.length();
    }
    public static boolean regionMatchesStr(String str, String regex, int toffset, int ooffset, int length) {
        return str.regionMatches(toffset, regex, ooffset, length);
    }
    public static void splitStr(String str, String regex, int limit) {
        str.split(regex, limit);
    }
    public static char[] doStr(String str) {
        return str.toCharArray();
    }
}
