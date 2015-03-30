import exercises.Recursion;
import org.junit.Test;

import static com.googlecode.totallylazy.Sequences.sequence;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RecursionTest {

    @Test
    public void fibonacci() {
        assertEquals(Integer.valueOf(0), Recursion.fibonacci(0));
        assertEquals(Integer.valueOf(1), Recursion.fibonacci(1));
        assertEquals(Integer.valueOf(1), Recursion.fibonacci(2));
        assertEquals(Integer.valueOf(2), Recursion.fibonacci(3));
        assertEquals(Integer.valueOf(3), Recursion.fibonacci(4));
        assertEquals(Integer.valueOf(5), Recursion.fibonacci(5));
        assertEquals(Integer.valueOf(8), Recursion.fibonacci(6));
    }

    @Test
    public void factorial() {
        assertEquals(Integer.valueOf(1), Recursion.factorial(0));
        assertEquals(Integer.valueOf(1), Recursion.factorial(1));
        assertEquals(Integer.valueOf(2), Recursion.factorial(2));
        assertEquals(Integer.valueOf(6), Recursion.factorial(3));
        assertEquals(Integer.valueOf(3628800), Recursion.factorial(10));
    }

    @Test
    public void contains() {
        assertFalse(Recursion.contains(sequence(), "foo"));
        assertTrue(Recursion.contains(sequence("foo"), "foo"));
        assertFalse(Recursion.contains(sequence("faz"), "foo"));
        assertTrue(Recursion.contains(sequence("faz", "baz", "foo"), "foo"));
        assertFalse(Recursion.contains(sequence("faz", "baz", "bar"), "foo"));
    }

    @Test
    public void length() {
        assertEquals(Integer.valueOf(3), Recursion.length("foo"));
        assertEquals(Integer.valueOf(11), Recursion.length("foo bar baz"));
        assertEquals(Integer.valueOf(56), Recursion.length("A monad is just a monoid in the category of endofunctors"));
    }
}
