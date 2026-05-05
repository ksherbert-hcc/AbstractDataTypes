package adt;

public interface Queue<T> {    
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
     * Run generic interface validation on a concrete queue type.
     * @param queue an empty queue of integers
     * @return true iff all tests pass
     */
    public static boolean validate(Queue<Integer> queue) {
        /* TODO: generic tests on
        
            boolean isEmpty();
            void enqueue(T value);
            T dequeue();
            T peek();
        
        */
       return true;
    }
}
