package nr.functional_programming.streams.ejer3Filter;

import java.util.List;
import java.util.function.Predicate;

import nr.functional_programming.models.Empleado;
import nr.functional_programming.models.Empleado.Genero;

public class filter1 {
    public static void main(String[] args) {
        List<Empleado> lstEmp = Empleado.empleados();
        lstEmp.stream().filter(new Predicate<Empleado>() {
            @Override
            public boolean test(Empleado t) {
                return t.getGenero() == Genero.HOMBRE;
            }
        }).forEach(System.out::println);
        lstEmp.stream().filter(e -> e.getGenero() == Genero.MUJER).forEach(System.out::println);
        lstEmp.stream().filter(e -> e.getEdad() > 25).forEach(System.out::println);
        lstEmp.stream().filter(e -> e.getGenero() == Genero.HOMBRE).filter(e -> e.getNombre().startsWith("A"))
                .forEach(System.out::println);

        lstEmp.stream().filter(e -> e.getGenero() == Genero.HOMBRE && e.getSalario() > 500)
                .forEach(System.out::println);
    }
}
