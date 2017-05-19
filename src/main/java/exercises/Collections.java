package exercises;

import com.googlecode.totallylazy.*;
import com.googlecode.totallylazy.Sequence;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Collections {


    // convert a sequence of strings to list of upper case strings
    public static Sequence<String> listToUpper(Sequence<String> strings) {
        return strings.map(String::toUpperCase);
    }

    private static Predicate<String> shortFilter() {
        return p -> p.length() >= 4;
    }

    // filter names that are less than four characters long
    public static Sequence<String> filterShortNames(Sequence<String> names) {
        return names.filter(shortFilter());
    }

    // filter names that are less than four characters long
    // and turn remaining names to uppercase
    public static Sequence<String> filterShortAndTurnToUppercase(Sequence<String> names) {
        return names.filter(shortFilter()).map(String::toUpperCase);
    }

    // turn a string to a sequence of characters
    public static Sequence<Character> characters(String s) {
        return Sequences.characters(s.toCharArray());
    }

    // turn a sequence of strings to a sequence of list of characters
    public static Sequence<Sequence<Character>> toCharacterLists(Sequence<String> strings) {
        return Sequences.sequence(strings.map(Collections::characters));
    }

    // turn a list of strings to a list of characters
    public static Sequence<Character> listOfAllCharacters(Sequence<String> strings) {
        return Sequences.characters(strings.stream().collect(Collectors.joining()));
    }

    // return the first string in a sequence as Some(name), or if sequence is empty, return None
    public static Option<String> firstElementInListOrNone(Sequence<String> strings) {
        return strings.headOption().orElse(Option.none());
    }

    // find the longest string in given sequence of strings as Option (None if empty)
    // and reverse the result before returning it
    public static Optional<String> longestNameInList(Sequence<String> names) {
        return names.stream().reduce(( a , b ) -> a.length() > b.length()? a : b).map(a -> new StringBuilder(a).reverse().toString());
    }

    // Take sums of given sequences and return those with sum greater than 20
    //
    // sumOfLists20([[1,2,3], [2,10,9)]≈) == [21]
    public static List<Integer> sumOfLists20(Sequence<Sequence<Integer>> lists) {
        return lists.stream().map(a -> a.stream().reduce((c, d) -> c + d)).collect(Collectors.toList()).stream().filter(a -> a.get() > 20).map(Optional::get).collect(Collectors.toList());

    }

    // Return only cards of suit "heart"
    // onlyHearts([("diamond", 4), ("heart", 9), ("clubs", 10)]) ==  [("heart", 9)]
    public static Sequence<Pair> onlyHearts(Sequence<Pair> cards) {
        return cards.filter(a -> a.first()=="heart");
    }
}
