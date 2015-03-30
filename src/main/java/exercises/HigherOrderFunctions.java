package exercises;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HigherOrderFunctions {

    // returns a function that increments a given argument with a predefined amount
    // TIP: you can return a lambda function!
    public static Function<Integer, Integer> plus(Integer amount) {
        // TODO implement
        return null;
    }

    // returns a function that subtracts a given argument with a predefined amount
    public static Function<Integer, Integer> minus(Integer amount) {
        // TODO implement
        return null;
    }

    // calls 'action' function with the given x argument and returns the result
    // TIP: Have a look at java.util.Function interface
    public static Integer doIt(Integer x, Function<Integer, Integer> action) {
        // TODO implement
        return 0;
    }

    /** combines two functions that both take integer arguments by passing the result from
     * the first function as the argument to the second function, and returns its return value
     */
    public static Function<Integer, Integer> combineInt(Function<Integer, Integer> first, Function<Integer, Integer> second) {
        // TODO implement
        return null;
    }

    // combines two functions of generic type
    public static <A,B,C> Function<A, C> combine(Function<A,B> first, Function<B,C> second) {
        // TODO implement
        return null;
    }

    /** converts a two-argument integer-taking function to a single-argument function
     * where the argument is fixed with given 'param'
     */
    public static Function<Integer, Integer> curry2Int(BiFunction<Integer, Integer, Integer> fn, Integer param) {
        // TODO implement
        return null;
    }

    /** 'curries' a two-argument generic function - i.e. translates the evaluation of a function
     * that takes two arguments into evaluating a sequence of functions, each with a single argument
     * Tip: In java, currying can be emulated with closure lambdas,
     * i.e. returning a function that returns a function which applies parameters to original function
     * A a -> B b -> fn a b
     */
    public static <A,B,C> Function<A,Function<B,C>> curry2(BiFunction<A,B,C> fn) {
        // TODO implement
        return null;
    }

}
