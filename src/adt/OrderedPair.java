package adt;

/// A data structure representing an ordered pair, i.e. a two-tuple.
/// The two values need not have the same type.
/// 
/// This interface is meant to be implemented by the following concrete classes:
/// - `KeyValuePair`
/// 
/// @param <T> the type of the first value
/// @param <U> the type of the second value
public interface OrderedPair<T,U> {
    /**
     * Get the first item of the ordered pair.
     * @return the first item
     */
    T first();

    /**
     * Get the second item of the ordered pair.
     * @return the second item
     */
    U second();

    /**
     * Construct a new ordered pair with the order of items reversed.
     * @return a new ordered pair
     */
    OrderedPair<U,T> reversed();
    
    /**
     * Run generic interface validation on a concrete ordered pair type.
     * @param pair an ordered pair matching a string to an integer
     */
    public static void validate(OrderedPair<String,Integer> pair) {
        OrderedPair<Integer,String> riap = pair.reversed();

        // Verify the reversed ordered pair has reversed values.
        assert pair.first().equals(riap.second());
        assert riap.first().equals(pair.second());

        System.out.println(String.format("""
            %s passes OrderedPair interface validation.
        """, pair.getClass().getSimpleName()));
    }
}
