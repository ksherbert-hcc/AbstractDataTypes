package adt;

public interface PriorityQueue<T extends Comparable<T>> {
    /**
     * 
     */
    boolean isEmpty();
    
    /**
     * 
     */
    void enqueue(T value);
    
    /**
     * 
     */
    T dequeue();
    
    /**
     * 
     */
    T peek();

    /**
     * Run generic interface validation on a concrete priority queue type.
     * @param queue an empty priority queue of integers
     * @return true iff all tests pass
     */
    public static boolean validate(PriorityQueue<Integer> queue) {
        /* TODO: generic tests on
        
            boolean isEmpty();
            void enqueue(T value);
            T dequeue();
            T peek();
        
        */
       return true;
    }
}
