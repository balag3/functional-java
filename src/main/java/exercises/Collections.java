package exercises;

import com.googlecode.totallylazy.Option;
import com.googlecode.totallylazy.Pair;
import com.googlecode.totallylazy.Sequence;
import com.googlecode.totallylazy.Sequences;

public class Collections {


    // convert a sequence of strings to list of upper case strings
    public static Sequence<String> listToUpper(Sequence<String> strings) {
        // TODO implement
        return Sequences.empty();
    }

    // filter names that are less than four characters long
    public static Sequence<String> filterShortNames(Sequence<String> names) {
        // TODO implement
        return Sequences.empty();
    }

    // filter names that are less than four characters long
    // and turn remaining names to uppercase
    public static Sequence<String> filterShortAndTurnToUppercase(Sequence<String> names) {
        // TODO implement
        return Sequences.empty();
    }

    // turn a string to a sequence of characters
    public static Sequence<Character> characters(String s) {
        // TODO implement
        return Sequences.empty();
    }

    // turn a sequence of strings to a sequence of list of characters
    public static Sequence<Sequence<Character>> toCharacterLists(Sequence<String> strings) {
        // TODO implement
        return Sequences.empty();
    }

    // turn a list of strings to a list of characters
    public static Sequence<Character> listOfAllCharacters(Sequence<String> strings) {
        // TODO implement
        return Sequences.empty();
    }

    // return the first string in a sequence as Some(name), or if sequence is empty, return None
    public static Option<String> firstElementInListOrNone(Sequence<String> strings) {
        // TODO implement
        return Option.none();
    }

    // find the longest string in given sequence of strings as Option (None if empty)
    // and reverse the result before returning it
    public static Option<String> longestNameInList(Sequence<String> names) {
        // TODO implement
        return Option.none();
    }

    // Take sums of given sequences and return those with sum greater than 20
    //
    // sumOfLists20([[1,2,3], [2,10,9)]≈) == [21]
    public static Sequence<Integer> sumOfLists20(Sequence<Sequence<Integer>> lists) {
        // TODO implement
        return Sequences.empty();
    }

    // Return only cards of suit "heart"
    // onlyHearts([("diamond", 4), ("heart", 9), ("clubs", 10)]) ==  [("heart", 9)]
    public static Sequence<Pair> onlyHearts(Sequence<Pair> cards) {
        // TODO implement
        return Sequences.empty();
    }
}
