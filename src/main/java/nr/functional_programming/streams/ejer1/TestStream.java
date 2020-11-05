package nr.functional_programming.streams.ejer1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        // List<Integer> lstNum = Arrays.asList(1,2,3,4,5);
        // List<Integer>lstNum=IntStream.range(0,20).mapToObj(i->i).collect(Collectors.toList());
        List<Integer> lstNum = IntStream.range(1, 6).boxed().collect(Collectors.toList());
        Stream<Integer> numStream = lstNum.stream();
        // int sum = numStream.filter(n -> n % 2 == 1).map(n -> n * n).reduce(0, Integer::sum);
        int sum = numStream.filter(n -> n % 2 == 1).mapToInt(n -> n * n).sum();
        System.out.println("La suma de los números impares es: " + sum);
    }
}
