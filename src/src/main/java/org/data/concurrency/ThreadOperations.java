package org.data.concurrency;


public class ThreadOperations {

    /** Creates a new Thread by extending the Thread class. */
    public static Thread createThreadSubclass(String name) {
        return new CustomThread(name);
    }

    /** Creates a new Thread from a Runnable. */
    public static Thread createThreadFromRunnable(Runnable task, String name) {
        return new Thread(task, name);
    }

    /** Creates a new Thread using a lambda expression. */
    public static Thread createThreadFromLambda(String name) {
        return new Thread(() -> System.out.println(name + " running"));
    }

    /** Starts the thread, which will execute its run() method. */
    public static Thread startThread(Thread thread) {
        thread.start();
        return thread;
    }

    /** Puts the current thread to sleep for the given milliseconds. */
    public static void sleepMillis(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupt status
        }
    }

    /** Waits for this thread to die. */
    public static Thread joinThread(Thread thread) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return thread;
    }

    /** Interrupts the target thread (sets its interrupted flag). */
    public static Thread interruptThread(Thread thread) {
        thread.interrupt();
        return thread;
    }

    /** Checks if the thread has been interrupted (static, refers to current thread). */
    public static boolean isInterrupted() {
        return Thread.interrupted(); // clears the flag
    }

    /** Checks if the specified thread has been interrupted (non‑static, does not clear flag). */
    public static boolean isInterruptedThread(Thread thread) {
        return thread.isInterrupted();
    }

    /** Returns a reference to the currently executing thread. */
    public static Thread currentThread() {
        return Thread.currentThread();
    }

    /** Returns the current thread's name. */
    public static String currentThreadName() {
        return Thread.currentThread().getName();
    }

    /** Sets the thread's name. */
    public static Thread setName(Thread thread, String name) {
        thread.setName(name);
        return thread;
    }

    /** Gets the thread's name. */
    public static String getName(Thread thread) {
        return thread.getName();
    }

    /** Sets the thread's priority (MIN_PRIORITY to MAX_PRIORITY). */
    public static Thread setPriority(Thread thread, int priority) {
        thread.setPriority(priority);
        return thread;
    }

    /** Gets the thread's priority. */
    public static int getPriority(Thread thread) {
        return thread.getPriority();
    }

    /** Marks the thread as a daemon (background) thread. */
    public static Thread setDaemon(Thread thread, boolean on) {
        thread.setDaemon(on);
        return thread;
    }

    /** Checks if the thread is a daemon. */
    public static boolean isDaemon(Thread thread) {
        return thread.isDaemon();
    }

    /** Checks if the thread is still alive (started and not yet terminated). */
    public static boolean isAlive(Thread thread) {
        return thread.isAlive();
    }

    /** Returns the estimated number of active threads in the current thread's group. */
    public static int activeCount() {
        return Thread.activeCount();
    }

    /** Hints the scheduler that the current thread is willing to yield its current use of a processor. */
    public static void yieldThread() {
        Thread.yield();
    }

    static class CustomThread extends Thread {
        public CustomThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(getName() + " is running");
        }
    }
}