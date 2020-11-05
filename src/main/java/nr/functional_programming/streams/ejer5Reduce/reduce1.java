package nr.functional_programming.streams.ejer5Reduce;

import java.util.List;
import java.util.stream.IntStream;

import nr.functional_programming.models.Empleado;

public class reduce1 {
    public static void main(String[] args) {
        int[] nums = { 4, 6, 1, 10, 12, 15, 55, 7, 8, 9, 10, 2, 5, 8, 9, 1, 010, 45, 6, 9, 33, 66, 85, 97, 81, 24, 99 };
        List<Empleado> lstEmp = Empleado.empleados();

        System.out.println("La suma es: " + IntStream.of(nums).sum());
        System.out.println("El promedio es: " + IntStream.of(nums).average().getAsDouble());
        System.out.println("El número minimo es: " + IntStream.of(nums).min().getAsInt());
        System.out.println("El número máximo es: " + IntStream.of(nums).max().getAsInt());
        System.out.println("Cantidad de elementos: " + IntStream.of(nums).count());

        System.out.println("Suma de Salarios: " + lstEmp.stream().mapToDouble(Empleado::getSalario).sum());
        System.out.println("Máximo Salario: " + lstEmp.stream().mapToDouble(Empleado::getSalario).max().getAsDouble());
        // TODO: IMPACTANTE BRO BELLEZA PURA
        Empleado empMax = lstEmp.stream().max((e1, e2) -> (int) (e1.getSalario() - e2.getSalario())).get();
        System.out.println(empMax);
    }
}
