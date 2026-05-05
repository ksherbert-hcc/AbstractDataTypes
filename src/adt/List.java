package adt;

/// A data structure representing an ordered, extensible list.
/// 
/// Note that this abstract data structure is well-suited to extending the `Iterable<T>` interface, like others in this package.
/// However, we refrain from doing so, so that students can completely implement the `List<T>` interface prior to learning about iterators.
/// Implementing classes will later be modified to implement `Iterable<T>` directly.
/// 
/// This interface is meant to be implemented by the following concrete classes:
/// - `Vector`
/// - `LinkedList`
/// - `CircularLinkedList`
/// 
/// @param <T> the type of elements in the list
public interface List<T> {
    /**
     * Compute the number of items in this collection.
     * @return the number of items
     */
    int length();
    
    /**
     * Fetch an item from the list.
     * @param index the location of the item - a nonnegative integer less than the length of the list
     * @return the value stored at the given location
     */
    T at(int index);
    
    /**
     * Change an item in the list.
     * @param index the location of the item - a nonnegative integer less than the length of the list
     * @param value the new value to assign at the given location
     */
    void set(int index, T value);
    
    /**
     * Check if the collection contains a given value.
     * @param value the value to look for
     * @return true iff the collection contains value
     */
    boolean contains(T value);
    
    /**
     * Insert an item into the list.
     * @param index the location of where to put the item - a nonnegative integer less than or equal to the length of the list
     * @param value the new value to put at the given location
     */
    void insert(int index, T value);
    
    /**
     * Remove an item from the list.
     * @param index the location to delete from - a nonnegative integer less than the length of the list
     * @return the value which was removed
     */
    T delete(int index);

    /*
     *
     * Iterator<T> iterator() inherited from Iterable<T>
     *  except actually we *don't* extend Iterable<T> in this interface.
     * 
     */

    /**
     * Run generic interface validation on a concrete list type.
     * @param list an empty list of integers
     */
    public static void validate(List<Integer> list) {
        assert list.length() == 0 : "List validation requires an empty data structure.";

        // Build up a basic list through append operations.
        list.insert(0, 1);
        list.insert(1, 2);
        list.insert(2, 4);
        list.insert(3, 8);
        list.insert(4, 16);
        // 1, 2, 4, 8, 16

        // Verify appending works as expected.
        assert list.length() == 5;
        assert list.at(0).equals(1);
        assert list.at(3).equals(8);

        // Verify setting works as expected.
        list.set(2, 20);
        // 1, 2, 20, 8, 16
        assert list.length() == 5;
        assert list.at(2).equals(20);

        // Verify prepending works as expected.
        list.insert(0, -12);
        // -12, 1, 2, 20, 8, 16
        assert list.length() == 6;
        assert list.at(0).equals(-12);
        assert list.at(1).equals(1);

        // Verify insertion into the middle of the list works as expected.
        list.insert(3, -21);
        // -12, 1, 2, -21, 20, 8, 16
        assert list.length() == 7;
        assert list.at(2).equals(2);
        assert list.at(3).equals(-21);
        assert list.at(6).equals(16);

        // Verify deletion works as expected.
        list.delete(5);
        // -12, 1, 2, -21, 20, 16
        assert list.length() == 6;
        assert list.at(4).equals(20);
        assert list.at(5).equals(16);

        // Verify contains works as expected.
        assert list.contains(1);    // Checks insert.
        assert list.contains(20);   // Checks set.
        assert !list.contains(4);   //  "       "
        assert !list.contains(8);   // Checks delete.

        /* Skip this iterator test, since we don't actually extend Iterator for pedagogical purposes.
        // Verify iterator traverses all values in the correct order.
        Iterator<Integer> iter = list.iterator();
        assert iter.next().equals(-12);
        assert iter.next().equals(1);
        assert iter.next().equals(2);
        assert iter.next().equals(-21);
        assert iter.next().equals(20);
        assert iter.next().equals(16);
        assert !iter.hasNext();
        */

        System.out.println(String.format("""
            %s passes List interface validation.
        """, list.getClass().getSimpleName()));
    }

}
