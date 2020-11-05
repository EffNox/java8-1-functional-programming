package nr.functional_programming.interfaces.interfaces_BinaryOperator;

import java.util.function.BinaryOperator;

public class TestBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> bOp = (n1, n2) -> n1 * n2;
        int rs = bOp.apply(10, 20);
        // System.out.println(bOp.apply(10, 20));
        // BinaryOperator<Integer> bOpe = BinaryOperator.minBy((Integer t1, Integer t2) -> t1.compareTo(t2));
        BinaryOperator<Integer> bOpeMax = BinaryOperator.maxBy((Integer t1, Integer t2) -> t1.compareTo(t2));
        // rs = bOpe.apply(10, 20);
        rs = bOpeMax.apply(10, 20);
        System.out.println(rs);
    }
}
