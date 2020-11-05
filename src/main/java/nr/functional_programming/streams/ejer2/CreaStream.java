package nr.functional_programming.streams.ejer2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import nr.functional_programming.models.Estudiante;

public class CreaStream {
    public static void main(String[] args) {
        Stream<String> sm1 = Stream.of("Cuso de programación");
        sm1.forEach(System.out::println);
        Stream<String> sm2 = Stream.of("Cuso 1", "Cuso 2", "Cuso 3", "Cuso 4", "Cuso // 5");
        sm2.forEach(System.out::println);
        String[] lst = { "Java", "C#", "PHP", "Ruby" };
        Stream<String> sm3 = Stream.of(lst);
        sm3.forEach(System.out::println);
        Stream<Estudiante> smEst = Stream.<Estudiante>builder().add(new Estudiante("01", "Fer", 21, 13.0, 13.0, 1.69))
                .add(new Estudiante("02", "Xime", 22, 17.0, 17.0, 1.69)).build();
        smEst.forEach(System.out::println);
        IntStream unoAVeinte = IntStream.rangeClosed(1, 5);
        unoAVeinte.forEach(System.out::println);
    }
}
