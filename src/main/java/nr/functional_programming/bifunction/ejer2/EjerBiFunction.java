package nr.functional_programming.bifunction.ejer2;

import java.util.Arrays;
import java.util.List;

import nr.functional_programming.models.Empleado;

public class EjerBiFunction {
    public static void main(String[] args) {
        List<Empleado> lstEmp = Arrays.asList(new Empleado(0, "Fernando", 8252, 0, null, null), new Empleado(0,
                "Ximena", 132, 0, null, null),
                new Empleado(), new Empleado(0, "Javer", 52, 0, null, null),
                new Empleado(0, "Alexandra", 82, 0, null, null),
                new Empleado(0, "Amanda", 92, 0, null, null), new Empleado(0, "Roxana", 20, 0, null, null));
        Calculadora2 cal = new Calculadora2();
        cal.calc((salario, inc) -> salario + (salario * (inc / 100)), lstEmp, 16.0).forEach(System.out::println);
    }
}
