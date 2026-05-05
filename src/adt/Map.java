package adt;

public interface Map<K,V> extends Iterable<OrderedPair<K,V>> {
    /**
     * 
     */
    int length();
    
    /**
     * 
     */
    boolean contains(K key);
    
    /**
     * 
     */
    void put(K key, V value);
    
    /**
     * 
     */
    boolean remove(K key);

    /*
     *
     * Iterator<OrderedPair<K,V>> iterator() inherited from Iterable<OrderedPair<K,V>>
     * 
     */

    /**
     * Run generic interface validation on a concrete map type.
     * @param map an empty map from strings to integers
     * @return true iff all tests pass
     */
    public static boolean validate(Map<String,Integer> map) {
        /* TODO: generic tests on
        
            int length();
            boolean contains(K key);
            void put(K key, V value);
            boolean remove(K key);
            Iterable<OrderedPair<K,V>> iterator()

        */
       return true;
    }
}
