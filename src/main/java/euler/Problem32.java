package euler;

import com.googlecode.totallylazy.Predicate;
import com.googlecode.totallylazy.Sequences;

import static com.googlecode.totallylazy.comparators.Comparators.ascending;
import static com.googlecode.totallylazy.numbers.Integers.range;
import static com.googlecode.totallylazy.numbers.Numbers.sum;

/*
 * This is an example solution.
 */
public class Problem32 {

    /*
        possible imperative solution:

        public static String solve() {
            int sum = 0;
            for (int i = 1; i < 10000; i++) {
                if (hasPandigitalProduct(i))
                    sum += i;
            }
            return Integer.toString(sum);
        }


        private static boolean hasPandigitalProduct(int n) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && isPandigital("" + n + i + n/i))
                    return true;
            }
            return false;
        }


        private static boolean isPandigital(String s) {
            if (s.length() != 9)
                return false;
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            return new String(temp).equals("123456789");
        }
*/

    public static String solve() {

        // Functional solution:

        // this predicate is lazy: find iterates the sequence until a pandigital result is found or range is fully exhausted
        // 1. get range from 1 to given number to find out all divisors
        // 2. filter out numbers which are not divisors of original number
        // 3. map to string, e.g. 39 * 186 = 7254 -> "725439186" (divisor = 39, number = 7254, number / divisor = 186)
        // 4.sort digits in string
        // 5. check if pandigital result exists in created sequence

        Predicate<Integer> hasPandigitalProduct = product -> range(1, product)
                .filter(divisor -> product % divisor == 0)
                .map(divisor -> "" + product + divisor + product / divisor)
                .map(concatenated -> Sequences.characters(concatenated).sort(ascending()).toString(""))
                .find(sorted -> sorted.equals("123456789")).isDefined();

        // range from 1 to 9999. A product can have max of 4 digits,
        // otherwise divisors will have at least 5 digits altogether -> 10 digits which is too many
        return range(1, 9999).filter(hasPandigitalProduct).reduce(sum()).toString();
    }
}
