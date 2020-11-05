package nr.functional_programming.streams.ejer2;

import java.util.Random;
import java.util.stream.Stream;

public class CreaStream2 {
    public static void main(String[] args) {
        Stream<Long> firstThen = Stream.iterate(1L, f -> f + 1).limit(10);
        firstThen.forEach(System.out::println);
        Stream.iterate(1L, f -> f + 1).filter(n -> n % 2 ==
        0).limit(20).forEach(System.out::println);
        Stream.iterate(1L, f -> f + 1).filter(n -> n % 2 ==
        0).skip(100).limit(5).forEach(System.out::println);
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
        new Random().ints().limit(2).forEach(System.out::println);
    }
}
