package nr.functional_programming.streams.ejer3Map;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

import nr.functional_programming.models.Empleado;
import nr.functional_programming.models.Empleado.Genero;

public class map1 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5).map(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * operand;
            }
        }).forEach(System.out::println);
        IntStream.rangeClosed(1, 10).map(n -> n * 2).forEach(System.out::println);

        List<Empleado> lstEmp = Empleado.empleados();
        double sum = lstEmp.stream().filter(emp -> emp.getGenero() == Genero.MUJER && emp.getEdad() > 25)
                .mapToDouble(emp -> emp.getSalario()).sum();
        double promedio = sum
                / lstEmp.stream().filter(emp -> emp.getGenero() == Genero.MUJER && emp.getEdad() > 25).count();
        System.out.println(promedio);
    }
}
