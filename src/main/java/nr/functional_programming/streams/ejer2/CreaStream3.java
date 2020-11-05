package nr.functional_programming.streams.ejer2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import nr.functional_programming.models.Estudiante;

public class CreaStream3 {
    public static void main(String[] args) {
        IntStream numSm = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });
        numSm.forEach(System.out::println);
        Stream<String> noms = Arrays.stream(new String[] { "Habn", "Xael" });
        noms.forEach(System.out::println);

        Set<String> nomSet = new HashSet<>();
        nomSet.add("Java");
        nomSet.add("C#");
        nomSet.add("PHP");
        nomSet.stream().forEach(System.out::println);
        List<Estudiante> lstEst = Arrays.asList(new Estudiante("01", "Fer", 21, 13.0, 13.0, 1.69),
                new Estudiante("02", "Xime", 22, 17.0, 17.0, 1.69));
        lstEst.parallelStream().forEach(System.out::println);
    }
}
