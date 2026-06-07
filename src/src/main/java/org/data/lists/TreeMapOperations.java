package org.data.lists;

import java.util.*;

public class TreeMapOperations {

    // --- SortedMap methods ---

    /** Returns the first (lowest) key. */
    public static String firstKey(TreeMap<String, String> map) {
        return map.firstKey();
    }

    /** Returns the last (highest) key. */
    public static String lastKey(TreeMap<String, String> map) {
        return map.lastKey();
    }

    /** Returns the Comparator used to order the keys, or null if natural ordering is used. */
    public static Comparator<? super String> comparator(TreeMap<String, String> map) {
        return map.comparator();
    }

    /** Returns a view of the portion of the map whose keys are strictly less than toKey. */
    public static SortedMap<String, String> headMap(TreeMap<String, String> map, String toKey) {
        return map.headMap(toKey);
    }

    /** Returns a view of the portion of the map whose keys are greater than or equal to fromKey. */
    public static SortedMap<String, String> tailMap(TreeMap<String, String> map, String fromKey) {
        return map.tailMap(fromKey);
    }

    /** Returns a view of the portion of the map from fromKey (inclusive) to toKey (exclusive). */
    public static SortedMap<String, String> subMap(TreeMap<String, String> map, String fromKey, String toKey) {
        return map.subMap(fromKey, toKey);
    }

    // --- NavigableMap methods ---

    /** Returns the entry with the greatest key strictly less than the given key, or null. */
    public static Map.Entry<String, String> lowerEntry(TreeMap<String, String> map, String key) {
        return map.lowerEntry(key);
    }

    /** Returns the entry with the greatest key less than or equal to the given key, or null. */
    public static Map.Entry<String, String> floorEntry(TreeMap<String, String> map, String key) {
        return map.floorEntry(key);
    }

    /** Returns the entry with the smallest key greater than or equal to the given key, or null. */
    public static Map.Entry<String, String> ceilingEntry(TreeMap<String, String> map, String key) {
        return map.ceilingEntry(key);
    }

    /** Returns the entry with the smallest key strictly greater than the given key, or null. */
    public static Map.Entry<String, String> higherEntry(TreeMap<String, String> map, String key) {
        return map.higherEntry(key);
    }

    /** Returns the greatest key strictly less than the given key, or null. */
    public static String lowerKey(TreeMap<String, String> map, String key) {
        return map.lowerKey(key);
    }

    /** Returns the greatest key less than or equal to the given key, or null. */
    public static String floorKey(TreeMap<String, String> map, String key) {
        return map.floorKey(key);
    }

    /** Returns the smallest key greater than or equal to the given key, or null. */
    public static String ceilingKey(TreeMap<String, String> map, String key) {
        return map.ceilingKey(key);
    }

    /** Returns the smallest key strictly greater than the given key, or null. */
    public static String higherKey(TreeMap<String, String> map, String key) {
        return map.higherKey(key);
    }

    /** Removes and returns the first (lowest) entry; returns null if the map is empty. */
    public static Map.Entry<String, String> pollFirstEntry(TreeMap<String, String> map) {
        return map.pollFirstEntry();
    }

    /** Removes and returns the last (highest) entry; returns null if the map is empty. */
    public static Map.Entry<String, String> pollLastEntry(TreeMap<String, String> map) {
        return map.pollLastEntry();
    }

    /** Returns a reverse‑order view of the map. */
    public static NavigableMap<String, String> descendingMap(TreeMap<String, String> map) {
        return map.descendingMap();
    }

    /** Returns a NavigableSet view of the keys contained in the map (allows navigation operations on the keys). */
    public static NavigableSet<String> navigableKeySet(TreeMap<String, String> map) {
        return map.navigableKeySet();
    }

    /** Returns a view of the portion of the map from fromKey to toKey, with explicit inclusivity flags. */
    public static NavigableMap<String, String> subMapInclusive(TreeMap<String, String> map, String from, boolean fromInc, String to, boolean toInc) {
        return map.subMap(from, fromInc, to, toInc);
    }

    /** Returns a view of the head of the map (keys less than, or equal to, toKey depending on the inclusive flag). */
    public static NavigableMap<String, String> headMapInclusive(TreeMap<String, String> map, String to, boolean inclusive) {
        return map.headMap(to, inclusive);
    }

    /** Returns a view of the tail of the map (keys greater than, or equal to, fromKey depending on the inclusive flag). */
    public static NavigableMap<String, String> tailMapInclusive(TreeMap<String, String> map, String from, boolean inclusive) {
        return map.tailMap(from, inclusive);
    }
}
