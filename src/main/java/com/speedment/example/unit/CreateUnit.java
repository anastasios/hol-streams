package com.speedment.example.unit;

import java.util.Collection;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface CreateUnit {

    /**
     * Creates a new Stream of String objects that contains the elements
     * "A", "B" and "C" in order.
     *
     * @return a new Stream of String objects that contains the elements
     *         "A", "B" and "C" in order
     */
    Stream<String> newStreamOfAToC();

    /**
     * Creates a new IntStream that contains the int elements
     * from zero (inclusive) to seven (inclusive) in order.
     *
     * @return a new IntStream that contains the int elements
     *         from zero (inclusive) to seven (inclusive) in order
     */
    IntStream newIntStreamOfOneToSeven();

    /**
     * Creates a new Stream of String objects that contains the elements
     * in the provided array in the same order.
     * <P>
     *  An array of
     *      ["Alpha", "Bravo", "Charlie"]
     *  would produce a Stream of the elements
     *      ["Alpha", "Bravo", "Charlie"]
     *
     * @param array used for input
     * @return new Stream of String objects that contains the elements
     *         in the provided array in the same order
     */
    Stream<String> from(String[] array);

    /**
     * Creates a new Stream of String objects that contains the elements
     * in the provided Collection in the same order (if any).
     * <P>
     *  A List of
     *      ["Alpha", "Bravo", "Charlie"]
     *  would produce a Stream of the elements
     *      ["Alpha", "Bravo", "Charlie"]
     *
     * @param collection used for input
     * @return new Stream of String objects that contains the elements
     *         in the provided Collection in the same order (if any)
     */
    Stream<String> from(Collection<String> collection);

    /**
     * Creates and returns a new IntStream that contains an
     * infinite number of elements 1, -1, 1, -1, ...
     *
     * @return a new IntStream that contains an
     *         infinite number of elements 1, -1, 1, -1, ...
     */
    IntStream infiniteAlternating();

    /**
     * Creates and returns a new IntStream that contains the
     * characters in the provided String (in order).
     * <P>
     *  A String of
     *      "Banana"
     *  would produce a Stream of the elements
     *      [66, 97, 110, 97, 110, 97]
     *  which is equivalent to
     *      ['B', 'a', 'n', 'a', 'n', 'a'])
     *
     * @param string used for input
     * @return a new IntStream that contains the
     *         characters in the provided String (in order)
     */
    IntStream from(String string);

    /**
     * Creates and returns an effectively unlimited IntStream of
     * pseudorandom {@code int} values from the given Random variable.
     *
     * @param rnd used for deriving integers
     * @return an effectively unlimited IntStream of
     *         pseudorandom {@code int} values from the given Random variable
     */
    IntStream infiniteRandomInts(Random rnd);

    /**
     * Creates and returns a new Stream that contains the lines from
     * the file poem.txt.
     * <p>
     * Bytes from the file are decoded into characters using the UTF-8 charset.
     * <p>
     *  In the project directory, there is a file named "poem.txt" containing
     *  the lines:
     *
     * “The Road Not Taken” by Robert Frost (1874-1963)
     *
     * Two roads diverged in a yellow wood,
     * And sorry I could not travel both
     * And be one traveler, long I stood
     * And looked down one as far as I could
     * To where it bent in the undergrowth;
     * ...
     *
     * @return a new Stream that contains the lines from
     *         the file poem.txt
     */
    Stream<String> linesFromPoemTxtFile();

}
