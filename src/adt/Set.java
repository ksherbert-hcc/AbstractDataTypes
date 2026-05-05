package adt;

public interface Set<T> extends Iterable<T> {    
    /**
     * 
     */
    int length();
    
    /**
     * 
     */
    boolean contains(T value);
    
    /**
     * 
     */
    boolean add(T value);
    
    /**
     * 
     */
    boolean remove(T value);

    /*
     *
     * Iterator<T> iterator() inherited from Iterable<T>
     * 
     */

    /**
     * Run generic interface validation on a concrete set type.
     * @param set an empty set of integers
     * @return true iff all tests pass
     */
    public static boolean validate(Set<Integer> set) {
        /* TODO: generic tests on
        
            int length();
            boolean contains(T value);
            boolean add(T value);
            boolean remove(T value);
            Iterable<T> iterator()
        
        */
       return true;
    }
}
