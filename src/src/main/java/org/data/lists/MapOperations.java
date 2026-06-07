package org.data.lists;

import java.util.*;

public class MapOperations {

    /** Put a key-value pair, returns the old value (or null). */
    public static String put(Map<String, String> map, String key, String value) {
        return map.put(key, value);
    }

    /** Get the value for the key, or null if absent. */
    public static String get(Map<String, String> map, String key) {
        return map.get(key);
    }

    /** Remove the mapping for the key, return the old value. */
    public static String remove(Map<String, String> map, String key) {
        return map.remove(key);
    }

    /** Remove only if the key is mapped to the exact value. */
    public static boolean removeIfMapped(Map<String, String> map, String key, String value) {
        return map.remove(key, value);
    }

    /** Check if the map contains the key. */
    public static boolean containsKey(Map<String, String> map, String key) {
        return map.containsKey(key);
    }

    /** Check if the map contains the value. */
    public static boolean containsValue(Map<String, String> map, String value) {
        return map.containsValue(value);
    }

    /** Return the number of entries. */
    public static int size(Map<String, String> map) {
        return map.size();
    }

    /** Clear all mappings, return the now empty map. */
    public static Map<String, String> clear(Map<String, String> map) {
        map.clear();
        return map;
    }

    /** Add all entries from another map, return the modified map. */
    public static Map<String, String> putAll(Map<String, String> target, Map<String, String> source) {
        target.putAll(source);
        return target;
    }

    /** Return a Set view of the keys (backed by the map). */
    public static Set<String> keySet(Map<String, String> map) {
        return map.keySet();
    }

    /** Return a Collection view of the values (backed by the map). */
    public static Collection<String> values(Map<String, String> map) {
        return map.values();
    }

    /** Return a Set view of the entries (backed by the map). */
    public static Set<Map.Entry<String, String>> entrySet(Map<String, String> map) {
        return map.entrySet();
    }

    /** Return the value, or a default if the key is missing. */
    public static String getOrDefault(Map<String, String> map, String key, String defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    /** Add the key-value pair only if the key is absent. Returns the current value after the operation. */
    public static String putIfAbsent(Map<String, String> map, String key, String value) {
        return map.putIfAbsent(key, value);
    }

    /** Replace the value for the key only if it is currently mapped to oldValue. */
    public static boolean replaceIfSame(Map<String, String> map, String key, String oldValue, String newValue) {
        return map.replace(key, oldValue, newValue);
    }

    /** Replace the value unconditionally; returns the old value. */
    public static String replace(Map<String, String> map, String key, String value) {
        return map.replace(key, value);
    }

    /** Replace all values using a BiFunction. Example: append "!" to every value. */
    public static Map<String, String> replaceAll(Map<String, String> map) {
        map.replaceAll((k, v) -> v + "!");
        return map;
    }

    /** Compute a new value: if key absent, put "computed". */
    public static String computeIfAbsent(Map<String, String> map, String key) {
        return map.computeIfAbsent(key, k -> "computed_for_" + k);
    }

    /** Compute only if present: convert value to uppercase. Returns new value or null if removed. */
    public static String computeIfPresent(Map<String, String> map, String key) {
        return map.computeIfPresent(key, (k, v) -> v.toUpperCase());
    }

    /** merge: if key absent, put "initial"; else concatenate old+new. */
    public static String merge(Map<String, String> map, String key, String newValue) {
        return map.merge(key, newValue, (oldVal, val) -> oldVal + "_" + val);
    }

    /** Iterate and print all entries. */
    public static void forEach(Map<String, String> map) {
        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
