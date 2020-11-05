package nr.functional_programming.streams.ejer5Reduce;

import java.util.stream.IntStream;

public class reduce3 {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 20).summaryStatistics());
    }
}
