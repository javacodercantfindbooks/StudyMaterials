package org.data.concurrency;

import java.util.*;
import java.util.concurrent.*;

public class ExecutorServiceDemo {

    /** Creates a fixed thread pool with the given number of threads. */
    public static ExecutorService createFixedThreadPool(int nThreads) {
        return Executors.newFixedThreadPool(nThreads);
    }

    /** Creates a single‑thread executor. */
    public static ExecutorService createSingleThreadExecutor() {
        return Executors.newSingleThreadExecutor();
    }

    /** Creates a cached thread pool (grows/shrinks as needed). */
    public static ExecutorService createCachedThreadPool() {
        return Executors.newCachedThreadPool();
    }

    /** Submits a Runnable task (returns a Future<?>; get() waits for completion). */
    public static Future<?> submitRunnable(ExecutorService executor, Runnable task) {
        return executor.submit(task);
    }

    /** Submits a Callable task and returns a Future that provides the result. */
    public static <T> Future<T> submitCallable(ExecutorService executor, Callable<T> task) {
        return executor.submit(task);
    }

    /** Submits a collection of Callable tasks and returns a list of Futures. */
    public static <T> List<Future<T>> invokeAll(ExecutorService executor, Collection<? extends Callable<T>> tasks) 
            throws InterruptedException {
        return executor.invokeAll(tasks);
    }

    /** Submits a collection of tasks and returns the result of the first one that succeeds. */
    public static <T> T invokeAny(ExecutorService executor, Collection<? extends Callable<T>> tasks) 
            throws InterruptedException, ExecutionException {
        return executor.invokeAny(tasks);
    }

    /** Initiates an orderly shutdown: previously submitted tasks are executed, no new tasks accepted. */
    public static ExecutorService shutdown(ExecutorService executor) {
        executor.shutdown();
        return executor;
    }

    /** Attempts to stop all actively executing tasks and halts waiting tasks. */
    public static ExecutorService shutdownNow(ExecutorService executor) {
        executor.shutdownNow();
        return executor;
    }

    /** Returns true if this executor has been shut down. */
    public static boolean isShutdown(ExecutorService executor) {
        return executor.isShutdown();
    }

    /** Returns true if all tasks have completed following shutdown. */
    public static boolean isTerminated(ExecutorService executor) {
        return executor.isTerminated();
    }

    /** Blocks until all tasks have completed after a shutdown request, or the timeout occurs. */
    public static boolean awaitTermination(ExecutorService executor, long timeout, TimeUnit unit) 
            throws InterruptedException {
        return executor.awaitTermination(timeout, unit);
    }
}