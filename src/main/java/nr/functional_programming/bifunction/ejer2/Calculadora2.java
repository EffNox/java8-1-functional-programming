package nr.functional_programming.bifunction.ejer2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import nr.functional_programming.models.Empleado;

public class Calculadora2 {

    public List<Double> calc(BiFunction<Double, Double, Double> bi, List<Empleado> lstEmp, Double inc) {
        List<Double> lstSalarios = new ArrayList<>();
        lstEmp.forEach(v -> lstSalarios.add(bi.apply(v.getSalario(), inc)));
        return lstSalarios;
    }
    
}
