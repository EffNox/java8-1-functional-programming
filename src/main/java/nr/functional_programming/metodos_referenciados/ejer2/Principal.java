package nr.functional_programming.metodos_referenciados.ejer2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Principal {
    public static void main(String[] args) {
        List<String> nums = List.of("10", "20", "30", "40", "50", "60");
        // getRs(nums,(numStr)->Integer.parseInt(numStr)).forEach(System.out::println);
        getRs(nums, Integer::parseInt).forEach(System.out::println);
    }

    public static List<Integer> getRs(List<String> dt, Function<String, Integer> fn) {
        List<Integer> numsInt = new ArrayList<>();
        dt.forEach(strNum -> numsInt.add(fn.apply(strNum)));
        return numsInt;
    }

}
