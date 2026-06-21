package org.data.exceptions;

public class CustomExceptions {
    /** A custom **checked** exception – must be declared or caught. */
    public static class InvalidUserException extends Exception {
        public InvalidUserException(String message) {
            super(message);
        }
        public InvalidUserException(String message, Throwable cause) {
            super(message, cause);
        }
    }
    /** A custom **unchecked** exception – extends RuntimeException. */
    public static class ConfigurationException extends RuntimeException {
        public ConfigurationException(String message) {
            super(message);
        }
        public ConfigurationException(String message, Throwable cause) {
            super(message, cause);
        }
    }
    /** Throws the custom checked exception. */
    public static void throwCheckedCustom() throws InvalidUserException {
        throw new InvalidUserException("User not found: alice");
    }

    /** Catches the custom checked exception and returns its message. */
    public static String catchCheckedCustom() {
        try {
            throwCheckedCustom();
            return "no error";
        } catch (InvalidUserException e) {
            return "Caught: " + e.getMessage();
        }
    }
    /** Throws the custom unchecked exception. */
    public static void throwUncheckedCustom() {
        throw new ConfigurationException("Missing config key: db.url");
    }
    /** Catches the custom unchecked exception and returns its message. */
    public static String catchUncheckedCustom() {
        try {
            throwUncheckedCustom();
            return "no error";
        } catch (ConfigurationException e) {
            return "Caught: " + e.getMessage();
        }
    }
    public static void throwChained() throws InvalidUserException {
        try {
            // Simulate an I/O error that happens during user loading
            throw new java.io.IOException("Disk read failure");
        } catch (java.io.IOException e) {
            throw new InvalidUserException("Failed to load user", e);
        }
    }
    public static String catchChained() {
        try {
            throwChained();
            return "no error";
        } catch (InvalidUserException e) {
            Throwable cause = e.getCause();
            return "Root cause: " + (cause != null ? cause.getMessage() : "none");
        }
    }
}
