package org.data.concurrency;

import java.util.concurrent.*;
import java.util.function.*;

public class CompletableFutureDemo {

    /** Creates a CompletableFuture that is already completed with the given value. */
    public static <T> CompletableFuture<T> completedFuture(T value) {
        return CompletableFuture.completedFuture(value);
    }

    /** Runs a task asynchronously (no return value) using the common fork‑join pool. */
    public static CompletableFuture<Void> runAsync(Runnable task) {
        return CompletableFuture.runAsync(task);
    }

    /** Runs a Supplier asynchronously and returns a CompletableFuture that provides the result. */
    public static <T> CompletableFuture<T> supplyAsync(Supplier<T> supplier) {
        return CompletableFuture.supplyAsync(supplier);
    }

    /** Transforms the result when it becomes available (thenApply). */
    public static <T, U> CompletableFuture<U> thenApply(CompletableFuture<T> future, Function<T, U> fn) {
        return future.thenApply(fn);
    }

    /** Consumes the result without returning a new value (thenAccept). */
    public static <T> CompletableFuture<Void> thenAccept(CompletableFuture<T> future, Consumer<T> action) {
        return future.thenAccept(action);
    }

    /** Runs an action after completion, regardless of result (thenRun). */
    public static CompletableFuture<Void> thenRun(CompletableFuture<?> future, Runnable action) {
        return future.thenRun(action);
    }

    /** Chains another asynchronous task that depends on the previous result (thenCompose). */
    public static <T, U> CompletableFuture<U> thenCompose(CompletableFuture<T> future,
                                                          Function<T, CompletableFuture<U>> fn) {
        return future.thenCompose(fn);
    }

    /** Combines two independent futures when both complete (thenCombine). */
    public static <T, U, V> CompletableFuture<V> thenCombine(CompletableFuture<T> f1,
                                                             CompletableFuture<U> f2,
                                                             BiFunction<T, U, V> combiner) {
        return f1.thenCombine(f2, combiner);
    }

    /** Recovers from an exception by providing a fallback value. */
    public static <T> CompletableFuture<T> exceptionally(CompletableFuture<T> future,
                                                         Function<Throwable, T> fallback) {
        return future.exceptionally(fallback);
    }

    /** Handles both success and failure in one callback. */
    public static <T, U> CompletableFuture<U> handle(CompletableFuture<T> future,
                                                     BiFunction<T, Throwable, U> handler) {
        return future.handle(handler);
    }

    /** Waits for all given futures to complete. */
    public static CompletableFuture<Void> allOf(CompletableFuture<?>... futures) {
        return CompletableFuture.allOf(futures);
    }

    /** Completes when any one of the given futures completes. */
    public static CompletableFuture<Object> anyOf(CompletableFuture<?>... futures) {
        return CompletableFuture.anyOf(futures);
    }

    /** Blocks and retrieves the result of a completed future. */
    public static <T> T join(CompletableFuture<T> future) {
        return future.join();
    }

    /** Blocks with a timeout; throws TimeoutException if not done in time. */
    public static <T> T getWithTimeout(CompletableFuture<T> future, long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        return future.get(timeout, unit);
    }

    /** Completes the future with a value if not already completed. */
    public static <T> boolean complete(CompletableFuture<T> future, T value) {
        return future.complete(value);
    }

    /** Completes the future exceptionally. */
    public static boolean completeExceptionally(CompletableFuture<?> future, Throwable ex) {
        return future.completeExceptionally(ex);
    }
}