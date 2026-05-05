package adt;

/// A data structure representing a FILO stack.
/// 
/// The first item in is the last one out.
/// 
/// This interface is meant to be implemented by the following concrete classes:
/// - `Vector`
/// 
/// @param <T> the type of elements in the stack
public interface Stack<T> {    
    /**
     * Check if the collection is empty.
     * @return true iff the collection has no more items
     */
    boolean isEmpty();
    
    /**
     * Add an item to the stack.
     * @param value the value to add
     */
    void push(T value);
    
    /**
     * Remove an item from the stack.
     * 
     * Pre-condition: the stack is not empty.
     * 
     * @return the last item to be added to the stack
     */
    T pop();
    
    /**
     * Report the next item to be removed from the stack.
     * 
     * Pre-condition: the stack is not empty.
     * 
     * @return the next value to be popped
     */
    T peek();

    /**
     * Run generic interface validation on a concrete stack type.
     * @param stack an empty stack of integers
     */
    public static void validate(Stack<Integer> stack) {
        assert stack.isEmpty() : "Stack validation requires an empty data structure.";

        // Fill the stack with some items.
        stack.push(3);
        stack.push(6);
        stack.push(9);

        // Verify FILO ordering.
        assert !stack.isEmpty();
        assert stack.peek().equals(9);
        assert stack.pop().equals(9);
        assert stack.peek().equals(6);

        // Verify push still works after popping.
        stack.push(12);
        assert !stack.isEmpty();
        assert stack.peek().equals(12);
        assert stack.pop().equals(12);
        assert stack.peek().equals(6);

        // Verify we can empty the stack.
        assert !stack.isEmpty();
        assert stack.pop().equals(6);
        assert stack.pop().equals(3);
        assert stack.isEmpty();

        System.out.println(String.format("""
            %s passes Stack interface validation.
        """, stack.getClass().getSimpleName()));
    }
}
