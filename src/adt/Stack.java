package adt;

public interface Stack<T> {    
    /**
     * 
     */
    boolean isEmpty();
    
    /**
     * 
     */
    void push(T value);
    
    /**
     * 
     */
    T pop();
    
    /**
     * 
     */
    T peek();

    /**
     * Run generic interface validation on a concrete stack type.
     * @param stack an empty stack of integers
     * @return true iff all tests pass
     */
    public static boolean validate(Stack<Integer> stack) {
        /* TODO: generic tests on
     
            boolean isEmpty();
            void push(T value);
            T pop();
            T peek();   
        */
       return true;
    }
}
