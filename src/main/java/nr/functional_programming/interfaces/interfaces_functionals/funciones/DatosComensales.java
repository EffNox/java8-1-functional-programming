package nr.functional_programming.interfaces.interfaces_functionals.funciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import nr.functional_programming.models.Comensal;

public class DatosComensales {

    public static void main(String[] args) {
        List<Comensal> lstComensales = Arrays.asList(new Comensal("Ximena", 150, 5), new Comensal("Ximena", 102, 59),
                new Comensal("Ximena", 150, 82), new Comensal("Ximena", 1001, 25), new Comensal("Ximena", 110, 95),
                new Comensal("Ximena", 190, 105));

        // List<Object> nomComs = getDatosComensales(lstComensales, x -> x.getNombre());
        // for (Object nom : nomComs) {
        // System.out.println("El nombre es: " + nom);
        // }
        getDatosComensales(lstComensales, x -> x.getNombre()).forEach(System.out::println);
        getDatosComensales(lstComensales, x -> x.getMonto_pedido()).forEach(System.out::println);
    }

    public static List<Object> getDatosComensales(List<Comensal> lstCom, Function<Comensal, Object> fn) {
        List<Object> lstData = new ArrayList<>();
        lstCom.forEach(v -> lstData.add(fn.apply(v)));
        // for (Comensal com : lstCom) {
        // lstData.add(fn.apply(com));
        // }
        return lstData;
    }
}
