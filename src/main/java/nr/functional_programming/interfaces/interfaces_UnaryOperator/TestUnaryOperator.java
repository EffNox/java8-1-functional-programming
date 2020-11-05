package nr.functional_programming.interfaces.interfaces_UnaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class TestUnaryOperator {
    public static void main(String[] args) {
        List<Integer> lstInt = List.of(10, 2, 3, 4, 5, 9, 7, 8, 8, 41);
        List<Integer> newLstInt = operadorUnary(num -> num * num, lstInt);
        newLstInt.forEach(System.out::println);
    }

    public static List<Integer> operadorUnary(UnaryOperator<Integer> uOper, List<Integer> lstInt) {
        List<Integer> newLstInt = new ArrayList<>();
        lstInt.forEach(num -> newLstInt.add(uOper.apply(num)));
        return newLstInt;
    }
}
