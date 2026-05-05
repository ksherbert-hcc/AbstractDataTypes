package adt;

public interface OrderedPair<T,U> {
    /**
     * Get the first item of the ordered pair.
     * @return the first item
     */
    T getFirst();

    /**
     * Get the second item of the ordered pair.
     * @return the second item
     */
    U getSecond();

    /**
     * Set the first item of the ordered pair.
     * @param value the new first item
     */
    void setFirst(T value);

    /**
     * Set the second item of the ordered pair.
     * @param value the new second item
     */
    void setSecond(U value);
    
    /**
     * Run generic interface validation on a concrete ordered pair type.
     * @param pair an ordered pair of an empty string and integer 0
     * @return true iff all tests pass
     */
    public static boolean validate(OrderedPair<String,Integer> pair) {
        assert pair.getFirst().equals("");
        assert pair.getSecond() == 0;

        pair.setFirst("A");
        pair.setSecond(1);

        assert pair.getFirst().equals("A");
        assert pair.getSecond() == 1;
        
        return true;
    }
}
