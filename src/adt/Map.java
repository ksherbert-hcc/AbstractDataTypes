package adt;

import java.util.Iterator;

/// A data structure representing a set of key-value pairs.
/// 
/// The keys form a mathematical set: they are intrinsically unordered, and every key is unique.
/// No constraint is placed on the values (i.e. multiple keys may be associated with the same value).
/// 
/// This interface is meant to be implemented by the following concrete classes:
/// - `HashMap`
/// 
/// @param <K> the type of keys in the map
/// @param <V> the type of values in the map
public interface Map<K,V> extends Iterable<OrderedPair<K,V>> {
    /**
     * Compute the number of items in this collection.
     * @return the number of items
     */
    int length();
    
    /**
     * Check if the map contains a given key.
     * @param key the key to look for
     * @return true iff the map associates key to some value
     */
    boolean contains(K key);
    
    /**
     * Fetch the value associated with a given key.
     * @param key the key to look for
     * @return the value currently associated with key, or null if key is not in the map
     */
    V get(K key);
    
    /**
     * Insert or replace a key-value pair in the map.
     * @param key the key to look for
     * @param value the value to assign to key
     * @return the value previously associated with key, or null if key was not previously in the map
     */
    V put(K key, V value);
    
    /**
     * Remove a key-value pair from the map.
     * @param key the key to look for
     * @return the value previously associated with key, or null if key was not previously in the map
     */
    V remove(K key);

    /*
     *
     * Iterator<OrderedPair<K,V>> iterator() inherited from Iterable<OrderedPair<K,V>>
     * 
     */

    /**
     * Run generic interface validation on a concrete map type.
     * @param map an empty map from strings to integers
     */
    public static void validate(Map<String,Integer> map) {
        assert map.length() == 0 : "Map validation requires an empty data structure.";

        // Fill the set with some items.
        map.put("6", 6);
        map.put("3", 3);
        map.put("12", 12);

        // Verify put works as expected.
        assert map.length() == 3;
        assert map.contains("3");
        assert map.get("3").equals(3);

        // Verify remove works as expected.
        assert map.remove("3").equals(3);
        assert map.length() == 2;
        assert !map.contains("3");
        assert map.remove("3").equals(null);
        assert map.length() == 2;
        
        // Verify return values for add.
        assert map.put("9", 9).equals(null);
        assert map.length() == 3;
        assert map.contains("9");
        assert map.put("9", 0).equals(9);
        assert map.length() == 3;

        // Verify get updates as expected.
        assert map.get("3").equals(null);
        assert map.get("6").equals(6);
        assert map.get("9").equals(0);

        // Verify iterator hits all remaining items and no others.
        Iterator<OrderedPair<String,Integer>> iter = map.iterator();
        OrderedPair<String,Integer> p1 = iter.next();
        OrderedPair<String,Integer> p2 = iter.next();
        OrderedPair<String,Integer> p3 = iter.next();
        assert !iter.hasNext();
        // Assign iterator items to the appropriately labeled variables.
        OrderedPair<String,Integer> p6, p9, p12;
        p6 = p9 = p12 = null;
        if      (p1.first().equals("6")  && p2.first().equals("9"))  {p6 = p1; p9 = p2; p12 = p3;}
        else if (p1.first().equals("6")  && p2.first().equals("12")) {p6 = p1; p12 = p2; p9 = p3;}
        else if (p1.first().equals("9")  && p2.first().equals("6"))  {p9 = p1; p6 = p2; p12 = p3;}
        else if (p1.first().equals("9")  && p2.first().equals("12")) {p9 = p1; p12 = p2; p6 = p3;}
        else if (p1.first().equals("12") && p2.first().equals("6"))  {p12 = p1; p6 = p2; p9 = p3;}
        else if (p1.first().equals("12") && p2.first().equals("9"))  {p12 = p1; p9 = p2; p6 = p3;}
        else assert false : "Iterator keys do not match expected strings.";
        // Verify key-value pairs match.
        assert p6.first().equals("6") && p6.second().equals(6);
        assert p9.first().equals("9") && p9.second().equals(0);
        assert p12.first().equals("12") && p12.second().equals(12);

        System.out.println(String.format("""
            %s passes Map interface validation.
        """, map.getClass().getSimpleName()));
    }
}
