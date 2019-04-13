public interface OrderedList{

    /**
      @return the index of any occurrence of
              \findMe in this list, or -1 if
              \findMe is absent from this list.

      In the Java API the indexOf method returns the index of
      "the first occurrence of" \findMe. Ignore that for
      incremental development. Adding it is optional extra
      education, which may be more confusing than educational.
     */
    int indexOf( Integer findMe);


    // ------ methods from previous assignments below here ----

    /**
      @return the number of elements in this list
     */
    int size();


    /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    String toString();

    /**
      Appends @value to the end of this list.

      @return true, in keeping with add() in
                    Java's Collection interface
     */
    boolean add( Integer value);


    /**
     @return element @index from this list
     precondition: @index is within the bounds of the array.
         (Having warned the user about this precondition,
          you should NOT complicate your code to check
          whether user violated the condition.)
    */
    Integer get( int index );


    /**
      Remove the element at position @index in this list.

      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).

      @return the value that was removed from the list
     */
    Integer remove( int index);
}
