package org.data.variables;

import java.util.Locale;
import java.util.stream.Collectors;

public class StringOperations {
    public String replaceAllInString(String str, String regex, String replacement) {
        return str.replaceAll(regex, replacement);
    }
    public byte[] getStringBytes(String str) {
        byte[] bytes = str.getBytes();
        return bytes;
    }
    public String getLowerCaseStr(String str) {
        return str.toLowerCase(Locale.ROOT); //sets string to lowercase
    }
    public String getUpperCaseStr(String str) {
        return str.toUpperCase(Locale.ROOT); //sets string to uppercase
    }
    public String replaceStr(String str, char regex, char replacement) {
        return str.replace(regex, replacement);
    }
    public String concatStr(String str, String addition) {
        return str.concat(addition); //adds a String to existing String
    }
    public void internStr(String str){
        String intern = str.intern(); //it brings the original String out of the intern pool
        String nonIntern = new String(str); //for comparison
        System.out.println("str == intern ? " + (str == nonIntern));
        System.out.println("str == intern ? " + (str == intern));
        System.out.println("str.equals(nonIntern) ? " + str.equals(nonIntern));
    }
    public String replaceFirstStr(String str, String regex, String replacement) {
        return str.replaceFirst(regex, replacement);
    }
    public String substringStr(String str, int startIndex, int end) {
        return str.substring(startIndex, end);
    }
    public char charAtStr(String text, int charAt) {
        char ch = text.charAt(charAt);
        System.out.println(ch);
        return ch;
    }
    public String trimStr(String str) {
        return str.trim();
    }
    public void charsStr(String str) {
        str.chars().forEach(c -> System.out.print((char) c + " "));;
    }
    public void extractLettersWithCharsStr(String str) {
        str = str.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("Letters: " + str);
    }
    public int getCodePointStr(String str, int index) {
        return str.codePointAt(index);
    }
    public void codePointsStr(String str) {
        str.codePoints().forEach(System.out::println);
    }
    public int compareStr(String str, String regex) {
        return str.compareTo(regex);
    }
    public boolean containsStr(String str, String regex) {
        return (str.contains(regex));
    }
    public boolean contentEqualsStr(String str, String regex) {
       return str.contentEquals(regex);
    }
    public String describeConstableStr(String str) {
        return String.valueOf(str.describeConstable());
    }
    public int lastIndexOfStr(String str, String regex, int fromIndex, int ch ) {
        return str.lastIndexOf(ch);
    }
    public int lastIndexOfStr(String str, int fromIndex, int ch ) {
        return str.lastIndexOf(ch, fromIndex);
    }
    public int lastIndexOfStr(String str, String regex) {
        return str.lastIndexOf(regex);
    }
    public int lastIndexOfStr(String str, String regex, int fromIndex) {
        return str.lastIndexOf(regex, fromIndex);
    }
    public boolean isEmptyStr(String str) {
        return str.isEmpty();
    }
    public int lengthStr(String str) {
        return str.length();
    }
    public boolean regionMatchesStr(String str, String regex, int toffset, int ooffset, int length) {
        return str.regionMatches(toffset, regex, ooffset, length);
    }
    public void splitStr(String str, String regex, int limit) {
        str.split(regex, limit);
    }
    public char[] doStr(String str) {
        return str.toCharArray();
    }
}
