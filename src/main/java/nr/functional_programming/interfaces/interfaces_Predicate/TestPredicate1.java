package nr.functional_programming.interfaces.interfaces_Predicate;

import java.util.function.Predicate;

public class TestPredicate1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (v) -> v > 0;
        System.out.println(predicate.test(2));
    }
}
