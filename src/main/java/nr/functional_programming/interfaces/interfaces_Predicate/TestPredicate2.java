package nr.functional_programming.interfaces.interfaces_Predicate;

import java.util.Arrays;
import java.util.List;
import nr.functional_programming.models.Empleado;

public class TestPredicate2 {
    public static void main(String[] args) {

        List<Empleado> lstEmp = Arrays.asList(new Empleado(0, "Fernando", 15, 8252, null, "Ventas"),
                new Empleado(0, "Ximena", 6, 132, null, "Cobranzar"),
                new Empleado(0, "Rogher", 6, 811, null, "Cobranzar"),
                new Empleado(0, "Javer", 6, 52, null, "Compras"),
                new Empleado(0, "Alexandra", 6, 82, null, "MARKENTIN"),
                new Empleado(0, "Amanda", 6, 92, null, "Mostrador"),
                new Empleado(0, "Roxana", 6, 20, null, "Factruracón"));

        Evaluador eval = new Evaluador();
        // System.out.println("Empleados con salarios > 5000");
        // eval.Evaluar(lstEmp, emp -> emp.getSalario() > 5000).forEach(System.out::println);

        // System.out.println("Empleados que su nombre inicie con X");
        // eval.Evaluar(lstEmp, emp -> emp.getNombre().startsWith("X")).forEach(System.out::println);
        // lstEmp.stream().filter(emp->emp.getNombre().startsWith("X")).forEach(System.out::println);

        // System.out.println("Empleados Jóvenes");
        // eval.Evaluar(lstEmp, emp -> emp.getEdad() < 25).forEach(System.out::println);

        Funciones fn = new Funciones();
        eval.Evaluar(lstEmp, emp -> emp.getEdad() < 25).forEach(v -> {
            double newSalario = fn.incSalario(v, 10, ((salario, increment) -> salario + (salario * increment) / 100));
            v.setSalario(newSalario);
            System.out.println(v);
        });

    }
}
