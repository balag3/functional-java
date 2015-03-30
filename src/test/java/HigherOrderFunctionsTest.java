import exercises.HigherOrderFunctions;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class HigherOrderFunctionsTest {

    @Test
    public void plus() {
        assertEquals(Integer.valueOf(6), HigherOrderFunctions.plus(4).apply(2));
        assertEquals(Integer.valueOf(4), HigherOrderFunctions.plus(2).apply(2));
    }

    @Test
    public void minus() {
        assertEquals(Integer.valueOf(2), HigherOrderFunctions.minus(4).apply(6));
        assertEquals(Integer.valueOf(0), HigherOrderFunctions.minus(2).apply(2));
    }

    @Test
    public void doIt() {
        assertEquals(Integer.valueOf(2), HigherOrderFunctions.doIt(4, HigherOrderFunctions.minus(2)));
        assertEquals(Integer.valueOf(20), HigherOrderFunctions.doIt(10, HigherOrderFunctions.plus(10)));
    }

    @Test
    public void combineInt() {
        assertEquals(Integer.valueOf(20), HigherOrderFunctions.combineInt(HigherOrderFunctions.plus(10), HigherOrderFunctions.minus(5)).apply(15));
        assertEquals(Integer.valueOf(12), HigherOrderFunctions.combineInt(HigherOrderFunctions.plus(6), HigherOrderFunctions.minus(1)).apply(7));
    }


    private static final Function<String, Integer> characters = s -> s.length();

    @Test
    public void combine() {
        assertEquals(Integer.valueOf(8), HigherOrderFunctions.combine(characters, HigherOrderFunctions.plus(4)).apply("five"));
        assertEquals("234", HigherOrderFunctions.combine(num -> num.toString(), str -> str + "34").apply(2));
    }

    private static final BiFunction<Integer, Integer, Integer> plusFn = (Integer x, Integer y) -> x + y;

    @Test
    public void curry2Int() {
        assertEquals(Integer.valueOf(4), HigherOrderFunctions.curry2Int(plusFn, 4).apply(0));
        assertEquals(Integer.valueOf(200), HigherOrderFunctions.curry2Int((Integer x, Integer y) -> x + y * 2, 4).apply(98));
    }

    @Test
    public void curry2() {
        assertEquals(Integer.valueOf(5), HigherOrderFunctions.curry2(plusFn).apply(2).apply(3));
        assertEquals(Integer.valueOf(17), HigherOrderFunctions.curry2((Integer x, Integer y) -> x + y * 5).apply(2).apply(3));
    }
}
