package org.data.exceptions;

import java.io.*;

public class TryWithResources {
    /**
     * Reads the first line of a file using try‑with‑resources.
     * The BufferedReader is automatically closed after the block.
     */
    public static String readFirstLineWithResource(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
        // br.close() is called automatically, even if an exception occurs.
    }
    /**
     * Opens two resources in one try‑with‑resources; they are closed in
     * reverse order of declaration.
     */
    public static String copyWithMultipleResources(String source, String dest) throws IOException {
        try (FileInputStream in = new FileInputStream(source);
             FileOutputStream out = new FileOutputStream(dest)) {
            byte[] buffer = new byte[4096];
            int n;
            while ((n = in.read(buffer)) != -1) {
                out.write(buffer, 0, n);
            }
            return "Copied";
        }
        // out.close() is called first, then in.close()
    }
    /** A simple custom resource that logs its lifecycle. */
    static class Logger implements AutoCloseable {
        private final String name;
        private boolean closed = false;

        Logger(String name) { this.name = name; }

        @Override
        public void close() {
            closed = true;
            System.out.println("Logger '" + name + "' closed.");
        }

        public void log(String msg) {
            if (closed) throw new IllegalStateException("Logger already closed");
            System.out.println("[" + name + "]: " + msg);
        }
    }
    /**
     * Uses a custom AutoCloseable resource; it's automatically closed
     * after the try block.
     */
    public static String useCustomResource() {
        try (Logger logger = new Logger("Demo")) {
            logger.log("Hello from try‑with‑resources");
            return "done";
        }
    }
    /**
     * Demonstrates that you can add catch and finally blocks to a
     * try‑with‑resources statement. The resource is still closed
     * before finally runs.
     */
    public static String tryWithCatchFinally(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return "Caught IOException: " + e.getMessage();
        } finally {
            System.out.println("Finally block executed (after close).");
        }
    }
    /**
     * When an exception is thrown in the try block and another during close(),
     * the close() exception is suppressed. This method shows how to retrieve it.
     */
    public static String suppressedExceptionExample() {
        try (FailingResource res = new FailingResource()) {
            throw new Exception("Primary exception");
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Primary: " + e.getMessage());
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable t : suppressed) {
                sb.append(" | Suppressed: ").append(t.getMessage());
            }
            return sb.toString();
        }
    }
    /** A resource that throws on close to demonstrate suppressed exceptions. */
    static class FailingResource implements AutoCloseable {
        @Override
        public void close() throws Exception {
            throw new Exception("Exception during close");
        }
    }
}
