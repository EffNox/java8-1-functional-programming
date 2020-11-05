package nr.functional_programming.interfaces.interfaces_Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        // List<String> nombres = List.of("Fer", "Xime", "Axel", "jOU");
        List<String> nombres = Arrays.asList("Fer", "Xime", "Axel", "jOU");
        // Collections.sort(nombres);
        // nombres.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        Collections.sort(nombres, (n, v) -> n.compareTo(v));
        // nombres.sort((c, e) -> c.compareTo(e));
        nombres.forEach(System.out::println);
    }
}
