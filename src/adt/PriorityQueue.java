package adt;

/// A data structure representing a priority queue.
/// 
/// Irrespective of how items are added, the minimum remaining value is always removed next.
/// 
/// This interface is meant to be implemented by the following concrete classes:
/// - `PriorityDequeuer`
/// - `PriorityEnqueuer`
/// - `MinHeap`
/// 
/// @param <T> the type of elements in the queue
public interface PriorityQueue<T extends Comparable<T>> {
    /**
     * Check if the collection is empty.
     * @return true iff the collection has no more items
     */
    boolean isEmpty();
    
    /**
     * Add an item to the queue.
     * @param value the value to add
     */
    void enqueue(T value);
    
    /**
     * Remove an item from the queue.
     * 
     * Pre-condition: the queue is not empty.
     * 
     * @return the smallest item left in the queue
     */
    T dequeue();
    
    /**
     * Report the next item to be removed from the queue.
     * 
     * Pre-condition: the queue is not empty.
     * 
     * @return the next value to be dequeued
     */
    T peek();

    /**
     * Run generic interface validation on a concrete priority queue type.
     * @param queue an empty priority queue of integers
     */
    public static void validate(PriorityQueue<Integer> queue) {
        assert queue.isEmpty() : "PriorityQueue validation requires an empty data structure.";

        // Fill the queue with some items.
        queue.enqueue(6);
        queue.enqueue(3);
        queue.enqueue(12);

        // Verify min ordering.
        assert !queue.isEmpty();
        assert queue.peek().equals(3);
        assert queue.dequeue().equals(3);
        assert queue.peek().equals(6);

        // Verify enqueue still works after dequeueing.
        queue.enqueue(9);
        assert !queue.isEmpty();
        assert queue.peek().equals(6);
        assert queue.dequeue().equals(6);
        assert queue.peek().equals(9);

        // Verify we can empty the queue.
        assert !queue.isEmpty();
        assert queue.dequeue().equals(9);
        assert queue.dequeue().equals(12);
        assert queue.isEmpty();

        System.out.println(String.format("""
            %s passes PriorityQueue interface validation.
        """, queue.getClass().getSimpleName()));
    }
}
