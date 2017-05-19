import com.googlecode.totallylazy.Option;
import com.googlecode.totallylazy.Pair;
import com.googlecode.totallylazy.Sequence;
import exercises.Collections;
import org.junit.Test;

import java.util.Optional;

import static com.googlecode.totallylazy.Pair.pair;
import static com.googlecode.totallylazy.Sequences.sequence;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CollectionsTest {

    @Test
    public void listToUpper() {
        assertEquals(sequence("FOO", "BAR"), Collections.listToUpper(sequence("foo", "bar")));
    }

    @Test
    public void filterShortNames() {
        assertEquals(sequence("John", "Suzy"), Collections.filterShortNames(sequence("Joe", "John", "Fae", "Suzy")));
    }

    @Test
    public void filterShortAndTurnToUpperCase() {
        assertEquals(sequence("JACK", "SUZY"), Collections.filterShortAndTurnToUppercase(sequence("Joe", "Jack", "Fae", "Suzy")));
    }

    @Test
    public void characters() {
        assertEquals(sequence('a', 'b', 'c'), Collections.characters("abc"));
    }

    @Test
    public void toCharacterLists() {
        assertEquals(sequence(sequence('f', 'o', 'o'), sequence('b', 'a', 'r')), Collections.toCharacterLists(sequence("foo", "bar")));
    }

    @Test
    public void listOfAllCharacters() {
        assertEquals(sequence('f','o','o','b','a','r'), Collections.listOfAllCharacters(sequence("foo", "bar")));
    }

    @Test
    public void firstElementInListOrNone() {
        Option<String> foo = Collections.firstElementInListOrNone(sequence("foo", "bar"));
        assertTrue(foo.isDefined());
        assertEquals("foo", foo.get());

        Option<String> bar = Collections.firstElementInListOrNone(sequence("bar"));
        assertTrue(bar.isDefined());
        assertEquals("bar", bar.get());

        Option<String> none = Collections.firstElementInListOrNone(sequence());
        assertTrue(none.isEmpty());
    }

    @Test
    public void longestNameInList() {
        Optional<String> longest = Collections.longestNameInList(sequence("Jack", "John", "Jill", "Richard", "Jim"));
        assertTrue(longest.isPresent());
        assertEquals("drahciR", longest.get());

        Optional<String> none = Collections.longestNameInList(sequence());
        assertTrue(!none.isPresent());
    }

    @Test
    public void sumOfLists20() {
        assertEquals(sequence(30, 40), Collections.sumOfLists20(sequence(sequence(1, 10), sequence(5, 15), sequence(5, 20, 5), sequence(10, 10, 5, 5, 3, 7))));
    }

    @Test
    public void onlyHearts() {
        Sequence<Pair> hearts = Collections.onlyHearts(sequence(pair("heart", 10), pair("clubs", 8), pair("heart", 4)));
        assertEquals(sequence(pair("heart", 10), pair("heart", 4)), hearts);
    }
}
