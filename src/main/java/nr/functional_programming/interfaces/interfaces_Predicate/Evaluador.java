
package nr.functional_programming.interfaces.interfaces_Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import nr.functional_programming.models.Empleado;

public class Evaluador {
    public List<Empleado> Evaluar(List<Empleado> lstEmp, Predicate<Empleado> eval) {
        List<Empleado> lstNew = new ArrayList<>();
        lstEmp.forEach(v -> {
            if (eval.test(v))
                lstNew.add(v);
        });
        return lstNew;
    }
}
