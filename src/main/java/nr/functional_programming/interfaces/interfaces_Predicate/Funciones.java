package nr.functional_programming.interfaces.interfaces_Predicate;

import java.util.function.BiFunction;

import nr.functional_programming.models.Empleado;

public class Funciones {
    public Double incSalario(Empleado emp, double inc, BiFunction<Double, Double, Double> bi) {
        return bi.apply(emp.getSalario(), inc);
    }
}
