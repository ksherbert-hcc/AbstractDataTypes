package adt;

import java.util.Iterator;

/// A data structure representing a mathematical set.
/// 
/// The set is intrinsically unordered, and every item is unique.
/// 
/// This interface is meant to be implemented by the following concrete classes:
/// - `VectorSet`
/// - `TreeSet`
/// - `HashSet`
/// 
/// @param <T> the type of elements in the set
public interface Set<T> extends Iterable<T> {    
    /**
     * Compute the number of items in this collection.
     * @return the number of items
     */
    int length();
    
    /**
     * Check if the collection contains a given value.
     * @param value the value to look for
     * @return true iff the collection contains value
     */
    boolean contains(T value);
    
    /**
     * Add an item to the set.
     * @param value the value to add
     * @return true iff the set changed (i.e. value was not already in the set)
     */
    boolean add(T value);
    
    /**
     * Remove an item from the set.
     * @param value the value to remove
     * @return true iff the set changed (i.e. value was previously in the set)
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
     */
    public static void validate(Set<Integer> set) {
        assert set.length() == 0 : "Set validation requires an empty data structure.";

        // Fill the set with some items.
        set.add(6);
        set.add(3);
        set.add(12);

        // Verify add works as expected.
        assert set.length() == 3;
        assert set.contains(3);

        // Verify remove works as expected.
        assert set.remove(3);
        assert set.length() == 2;
        assert !set.contains(3);
        assert !set.remove(3);
        assert set.length() == 2;
        
        // Verify return values for add.
        assert set.add(9);
        assert set.length() == 3;
        assert set.contains(9);
        assert !set.add(9);
        assert set.length() == 3;

        // Verify iterator hits all remaining items and no others.
        Iterator<Integer> iter = set.iterator();
        Integer v1 = iter.next();
        Integer v2 = iter.next();
        Integer v3 = iter.next();
        assert !iter.hasNext();
        assert !v1.equals(v2) && !v2.equals(v3) && !v3.equals(v2);
        assert v1.equals(6) || v2.equals(6) || v3.equals(6);
        assert v1.equals(9) || v2.equals(9) || v3.equals(9);
        assert v1.equals(12) || v2.equals(12) || v3.equals(12);

        System.out.println(String.format("""
            %s passes Set interface validation.
        """, set.getClass().getSimpleName()));
    }
}
