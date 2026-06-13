package org.data.functional;

/**
 * Demonstrates key generics concepts:
 * - Generic class (type parameter {@code <T>})
 * - Generic methods (with their own type variables)
 * - Bounded type parameters ({@code <T extends Comparable<T>>})
 *
 * @param <T> the type of the value stored in this box
 */
public class GenericBox<T> {

    private T value;

    /** Creates an empty box. */
    public GenericBox() {
    }

    /** Stores a value in the box. Returns the box for chaining. */
    public GenericBox<T> setValue(T value) {
        this.value = value;
        return this;
    }

    /** Retrieves the stored value (may be null). */
    public T getValue() {
        return value;
    }

    /** Checks whether the box is empty (value == null). */
    public boolean isEmpty() {
        return value == null;
    }

    /**
     * Creates a box pre‑filled with the given value.
     * The type {@code <U>} is inferred from the argument.
     */
    public static <U> GenericBox<U> of(U value) {
        GenericBox<U> box = new GenericBox<>();
        box.setValue(value);
        return box;
    }

    /**
     * Generic method that swaps the contents of two boxes.
     * The type variable {@code <S>} is unrelated to the class parameter {@code <T>}.
     */
    public static <S> void swap(GenericBox<S> a, GenericBox<S> b) {
        S temp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }

    /**
     * Finds the maximum between two values of a type that implements {@link Comparable}.
     * The bound {@code <T extends Comparable<T>>} guarantees that {@code compareTo} is available.
     */
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }
}
