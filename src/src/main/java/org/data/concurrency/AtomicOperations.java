package org.data.concurrency;

import java.util.concurrent.atomic.*;


public class AtomicOperations {


    /** Creates a new {@code AtomicInteger} with the given initial value. */
    public static AtomicInteger createAtomicInteger(int initialValue) {
        return new AtomicInteger(initialValue);
    }

    /** Gets the current value. */
    public static int getAtomicInteger(AtomicInteger ai) {
        return ai.get();
    }

    /** Sets to the given value. */
    public static void setAtomicInteger(AtomicInteger ai, int newValue) {
        ai.set(newValue);
    }

    /** Atomically sets to the given value and returns the old value. */
    public static int getAndSetAtomicInteger(AtomicInteger ai, int newValue) {
        return ai.getAndSet(newValue);
    }

    /** Atomically increments by one and returns the updated value. */
    public static int incrementAndGetAtomicInteger(AtomicInteger ai) {
        return ai.incrementAndGet();
    }

    /** Atomically decrements by one and returns the updated value. */
    public static int decrementAndGetAtomicInteger(AtomicInteger ai) {
        return ai.decrementAndGet();
    }

    /** Atomically adds the given delta and returns the updated value. */
    public static int addAndGetAtomicInteger(AtomicInteger ai, int delta) {
        return ai.addAndGet(delta);
    }

    /** Atomically sets the value if the current value equals the expected value. */
    public static boolean compareAndSetAtomicInteger(AtomicInteger ai, int expect, int update) {
        return ai.compareAndSet(expect, update);
    }

    /** Creates a new {@code AtomicLong} with the given initial value. */
    public static AtomicLong createAtomicLong(long initialValue) {
        return new AtomicLong(initialValue);
    }

    /** Gets the current value. */
    public static long getAtomicLong(AtomicLong al) {
        return al.get();
    }

    /** Atomically increments by one and returns the updated value. */
    public static long incrementAndGetAtomicLong(AtomicLong al) {
        return al.incrementAndGet();
    }

    /** Atomically adds the given delta and returns the updated value. */
    public static long addAndGetAtomicLong(AtomicLong al, long delta) {
        return al.addAndGet(delta);
    }

    /** Atomically sets the value if the current value equals the expected value. */
    public static boolean compareAndSetAtomicLong(AtomicLong al, long expect, long update) {
        return al.compareAndSet(expect, update);
    }

    /** Creates a new {@code AtomicBoolean} with the given initial value. */
    public static AtomicBoolean createAtomicBoolean(boolean initialValue) {
        return new AtomicBoolean(initialValue);
    }

    /** Gets the current value. */
    public static boolean getAtomicBoolean(AtomicBoolean ab) {
        return ab.get();
    }

    /** Sets to the given value. */
    public static void setAtomicBoolean(AtomicBoolean ab, boolean newValue) {
        ab.set(newValue);
    }

    /** Atomically sets the value if the current value equals the expected value. */
    public static boolean compareAndSetAtomicBoolean(AtomicBoolean ab, boolean expect, boolean update) {
        return ab.compareAndSet(expect, update);
    }

    /** Atomically sets to true and returns the previous value. */
    public static boolean getAndSetTrueAtomicBoolean(AtomicBoolean ab) {
        return ab.getAndSet(true);
    }

    /** Creates a new {@code AtomicReference} with the given initial value. */
    public static <V> AtomicReference<V> createAtomicReference(V initialValue) {
        return new AtomicReference<>(initialValue);
    }

    /** Gets the current value. */
    public static <V> V getAtomicReference(AtomicReference<V> ref) {
        return ref.get();
    }

    /** Sets to the given value. */
    public static <V> void setAtomicReference(AtomicReference<V> ref, V newValue) {
        ref.set(newValue);
    }

    /** Atomically sets to the given value and returns the old value. */
    public static <V> V getAndSetAtomicReference(AtomicReference<V> ref, V newValue) {
        return ref.getAndSet(newValue);
    }

    /** Atomically updates the value using the given function and returns the previous value. */
    public static <V> V getAndUpdateAtomicReference(AtomicReference<V> ref,
                                                     java.util.function.UnaryOperator<V> updateFunction) {
        return ref.getAndUpdate(updateFunction);
    }

    /** Atomically sets the value if the current value equals the expected value. */
    public static <V> boolean compareAndSetAtomicReference(AtomicReference<V> ref, V expect, V update) {
        return ref.compareAndSet(expect, update);
    }

    /** Creates a new {@code AtomicIntegerArray} of the given length. */
    public static AtomicIntegerArray createAtomicIntegerArray(int length) {
        return new AtomicIntegerArray(length);
    }

    /** Gets the current value at index i. */
    public static int getAtomicIntegerArray(AtomicIntegerArray array, int i) {
        return array.get(i);
    }

    /** Sets the value at index i. */
    public static void setAtomicIntegerArray(AtomicIntegerArray array, int i, int newValue) {
        array.set(i, newValue);
    }

    /** Atomically increments the element at index i and returns the updated value. */
    public static int incrementAndGetAtomicIntegerArray(AtomicIntegerArray array, int i) {
        return array.incrementAndGet(i);
    }

    /** Atomically sets the element at index i if it equals the expected value. */
    public static boolean compareAndSetAtomicIntegerArray(AtomicIntegerArray array, int i, int expect, int update) {
        return array.compareAndSet(i, expect, update);
    }
}