package adt;

public interface List<T> {
    /**
     * 
     */
    int length();
    
    /**
     * 
     */
    T get(int index);
    
    /**
     * 
     */
    void set(int index, T value);
    
    /**
     * 
     */
    boolean contains(T value);
    
    /**
     * 
     */
    void insert(int index, T value);
    
    /**
     * 
     */
    T delete(int index);

    /*
     *
     * Iterator<T> iterator() inherited from Iterable<T>
     *  except actually we *don't* extend Iterable<T> in this interface.
     * The reason is so students can completely satisfy the List requirements prior to learning about iterators.
     * Implementing classes will at that time be modified to implmeent Iterable<T> directly.
     * 
     */

    /**
     * Run generic interface validation on a concrete list type.
     * @param list an empty list of integers
     * @return true iff all tests pass
     */
    public static boolean validate(List<Integer> list) {
        assert list.length() == 0;

        /* TODO: generic tests on
        
            int length();
            T get(int index);
            void set(int index, T value);
            boolean contains(T value);
            void insert(int index, T value);
            T delete(int index);
        
        */
       return true;
    }

}
