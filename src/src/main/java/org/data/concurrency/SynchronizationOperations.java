package org.data.concurrency;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;


public class SynchronizationOperations {

    /**
     * Executes the given task inside a synchronized block on the provided lock object.
     * This demonstrates the basic intrinsic lock / monitor mechanism.
     */
    public static void synchronizedBlock(Object lock, Runnable task) {
        synchronized (lock) {
            task.run();
        }
    }

    /** Acquires the lock, blocking until it is available. */
    public static Lock lockAcquire(Lock lock) {
        lock.lock();
        return lock;
    }

    /** Releases the lock. Must only be called after a successful lock(). */
    public static Lock lockRelease(Lock lock) {
        lock.unlock();
        return lock;
    }

    /** Attempts to acquire the lock without blocking. Returns true if successful. */
    public static boolean tryLockOnce(Lock lock) {
        return lock.tryLock();
    }

    /** Attempts to acquire the lock within a given timeout. Returns true on success. */
    public static boolean tryLockWithTimeout(Lock lock, long time, TimeUnit unit) throws InterruptedException {
        return lock.tryLock(time, unit);
    }

    /** Queries whether the lock is held by the current thread. */
    public static boolean isHeldByCurrentThread(Lock lock) {
        return lock instanceof ReentrantLock && ((ReentrantLock) lock).isHeldByCurrentThread();
    }

    /** Acquires the read lock (shared lock). Multiple readers may proceed concurrently. */
    public static Lock readLockAcquire(ReadWriteLock rwLock) {
        rwLock.readLock().lock();
        return rwLock.readLock();
    }

    /** Releases the read lock. */
    public static Lock readLockRelease(ReadWriteLock rwLock) {
        rwLock.readLock().unlock();
        return rwLock.readLock();
    }

    /** Acquires the write lock (exclusive lock). No other reader or writer can proceed. */
    public static Lock writeLockAcquire(ReadWriteLock rwLock) {
        rwLock.writeLock().lock();
        return rwLock.writeLock();
    }

    /** Releases the write lock. */
    public static Lock writeLockRelease(ReadWriteLock rwLock) {
        rwLock.writeLock().unlock();
        return rwLock.writeLock();
    }

    /** Decrements the latch by one, releasing waiting threads when the count reaches zero. */
    public static CountDownLatch countDownLatch(CountDownLatch latch) {
        latch.countDown();
        return latch;
    }

    /** Causes the current thread to wait until the latch has counted down to zero. */
    public static CountDownLatch awaitLatch(CountDownLatch latch) throws InterruptedException {
        latch.await();
        return latch;
    }

    /** Waits with a timeout; returns true if the count reached zero, false otherwise. */
    public static boolean awaitLatchWithTimeout(CountDownLatch latch, long timeout, TimeUnit unit)
            throws InterruptedException {
        return latch.await(timeout, unit);
    }

    /** Returns the current count of the latch. */
    public static long latchCount(CountDownLatch latch) {
        return latch.getCount();
    }

    /** Waits for all parties to invoke await on this barrier (broken if timeout). */
    public static int awaitBarrier(CyclicBarrier barrier) throws InterruptedException, BrokenBarrierException {
        return barrier.await();
    }

    /** Waits for all parties with a timeout. */
    public static int awaitBarrierWithTimeout(CyclicBarrier barrier, long timeout, TimeUnit unit)
            throws InterruptedException, BrokenBarrierException, TimeoutException {
        return barrier.await(timeout, unit);
    }

    /** Checks whether the barrier is broken. */
    public static boolean isBarrierBroken(CyclicBarrier barrier) {
        return barrier.isBroken();
    }

    /** Returns the number of parties required to trip the barrier. */
    public static int barrierParties(CyclicBarrier barrier) {
        return barrier.getParties();
    }

    /** Acquires a permit from the semaphore, blocking until one is available. */
    public static Semaphore acquireSemaphore(Semaphore semaphore) throws InterruptedException {
        semaphore.acquire();
        return semaphore;
    }

    /** Releases a permit, returning it to the semaphore. */
    public static Semaphore releaseSemaphore(Semaphore semaphore) {
        semaphore.release();
        return semaphore;
    }

    /** Attempts to acquire a permit without blocking. Returns true if successful. */
    public static boolean tryAcquireSemaphore(Semaphore semaphore) {
        return semaphore.tryAcquire();
    }

    /** Returns the current number of available permits. */
    public static int availablePermits(Semaphore semaphore) {
        return semaphore.availablePermits();
    }
}