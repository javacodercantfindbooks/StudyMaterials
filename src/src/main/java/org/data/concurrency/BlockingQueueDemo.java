package org.data.concurrency;

import java.util.*;
import java.util.concurrent.*;

public class BlockingQueueDemo {

    /** Creates a bounded ArrayBlockingQueue with the given capacity. */
    public static BlockingQueue<String> createArrayBlockingQueue(int capacity) {
        return new ArrayBlockingQueue<>(capacity);
    }

    /**
     * Inserts the element at the tail of the queue, waiting if necessary
     * for space to become available (blocks if the queue is full).
     */
    public static BlockingQueue<String> put(BlockingQueue<String> queue, String element)
            throws InterruptedException {
        queue.put(element);
        return queue;
    }

    /**
     * Inserts the element at the tail of the queue if possible, without blocking.
     * Returns true on success, false if the queue is full.
     */
    public static boolean offer(BlockingQueue<String> queue, String element) {
        return queue.offer(element);
    }

    /**
     * Inserts the element, waiting up to the specified time for space to become available.
     * Returns true on success, false on timeout.
     */
    public static boolean offerWithTimeout(BlockingQueue<String> queue, String element,
                                           long timeout, TimeUnit unit) throws InterruptedException {
        return queue.offer(element, timeout, unit);
    }

    /**
     * Retrieves and removes the head of the queue, waiting if necessary
     * until an element becomes available (blocks if the queue is empty).
     */
    public static String take(BlockingQueue<String> queue) throws InterruptedException {
        return queue.take();
    }

    /**
     * Retrieves and removes the head of the queue, or returns null if the queue is empty.
     */
    public static String poll(BlockingQueue<String> queue) {
        return queue.poll();
    }

    /**
     * Retrieves and removes the head of the queue, waiting up to the specified time
     * for an element to become available. Returns null on timeout.
     */
    public static String pollWithTimeout(BlockingQueue<String> queue, long timeout, TimeUnit unit)
            throws InterruptedException {
        return queue.poll(timeout, unit);
    }

    /**
     * Removes all available elements from the queue and adds them to the given collection.
     * Returns the number of elements transferred.
     */
    public static int drainTo(BlockingQueue<String> queue, Collection<? super String> target) {
        return queue.drainTo(target);
    }

    /** Returns the number of additional elements the queue can accept without blocking. */
    public static int remainingCapacity(BlockingQueue<String> queue) {
        return queue.remainingCapacity();
    }

    /** Returns the current number of elements in the queue. */
    public static int size(BlockingQueue<String> queue) {
        return queue.size();
    }

    /**
     * A small demonstration: one producer thread feeds two consumer threads
     * using a bounded BlockingQueue. Prints messages to show the flow.
     */
    public static void demonstrateProducerConsumer() throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        
        // Producer
        Thread producer = new Thread(() -> {
            String[] items = {"apple", "banana", "cherry", "date", "elderberry"};
            for (String item : items) {
                try {
                    System.out.println("[Producer] putting: " + item);
                    queue.put(item);                         // blocks if full
                    Thread.sleep(200);                      // simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "Producer");

        // Consumer
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    String item = queue.take();              // blocks if empty
                    System.out.println("[Consumer] took: " + item);
                    Thread.sleep(600);                      // simulate slower processing
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Consumer");

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
        System.out.println("Demo finished.");
    }
}