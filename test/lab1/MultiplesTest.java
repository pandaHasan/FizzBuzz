package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/*
  Some test cases for Multiples.
 */
public class MultiplesTest {

    // TODO: When you are ready to test task X,
    //  copy this file into the test folder.

    @Test
    public void testFifteen() {
        assertEquals(7,
                Multiples.multiples(16, 3, 5));
    }

    @Test
    public void testTen() {
        assertEquals(4,
                Multiples.multiples(10, 3, 5));
    }

    @Test
    public void testThousand() {
        assertEquals(466,
                Multiples.multiples(1000, 3, 5));
    }

    @Test
    public void testEquals() {
        assertEquals(249,
                Multiples.multiples(1000, 4, 4));
    }

}