package nr.functional_programming.streams.ejer4Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import nr.functional_programming.models.Empleado;

public class soter1 {
    public static void main(String[] args) {
        Arrays.asList("Alfredo", "Maria", "Daniel", "Brenda").stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        Arrays.asList(11, 52, 31, 444, 5, 1, 86, 47, 8, 8).stream().sorted().forEach(System.out::println);

        List<Empleado> lstEmp = Empleado.empleados();
        lstEmp.stream().sorted().forEach(System.out::println);

        lstEmp.stream().sorted(new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return o2.getEdad() - o1.getEdad();
            }
        }).forEach(System.out::println);

        lstEmp.stream().filter(e -> e.getEdad() > 25).sorted((e1, e2) -> (int) (e1.getSalario() - e2.getSalario()))
                .forEach(System.out::println);

    }
}
