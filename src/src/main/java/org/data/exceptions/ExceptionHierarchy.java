package org.data.exceptions;

public class ExceptionHierarchy {
    /** Throws a checked exception (must be declared in the throws clause or caught). */
    public static void throwCheckedException() throws Exception {
        throw new Exception("This is a checked exception");
    }
    /** Throws an unchecked exception (subclass of RuntimeException). */
    public static void throwUncheckedException() {
        throw new RuntimeException("This is an unchecked exception");
    }
    /** Catches a specific checked exception and returns its message. */
    public static String catchChecked() {
        try {
            throwCheckedException();
            return "no exception";
        } catch (Exception e) {
            return "Caught: " + e.getMessage();
        }
    }
    /** Demonstrates catching multiple exception types in one catch block. */
    public static String multiCatch(int code) {
        try {
            if (code == 0) throw new IllegalArgumentException("bad arg");
            if (code == 1) throw new NullPointerException("null!");
            return "ok";
        } catch (IllegalArgumentException | NullPointerException e) {
            return "Multi‑caught: " + e.getMessage();
        }
    }
    /** Shows that finally runs even after a return statement in try. */
    public static String finallyDemo() {
        StringBuilder log = new StringBuilder();
        try {
            log.append("try;");
            return "result";
        } finally {
            log.append("finally;");
            System.out.println("finally executed: " + log);
        }
    }

    /** Calls a method that throws, without catching, letting it bubble up. */
    public static void propagateUnchecked() {
        methodThatThrows();
    }
    private static void methodThatThrows() {
        throw new IllegalArgumentException("propagated");
    }

    /** Shows that a try can have a nested try‑catch inside catch or finally. */
    public static String nestedTry() {
        try {
            throw new Exception("original");
        } catch (Exception e) {
            try {
                throw new Exception("inside catch");
            } catch (Exception inner) {
                return "inner: " + inner.getMessage();
            }
        }
    }
}
