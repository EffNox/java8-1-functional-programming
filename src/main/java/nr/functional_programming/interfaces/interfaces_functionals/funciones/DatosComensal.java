package nr.functional_programming.interfaces.interfaces_functionals.funciones;

import java.util.function.Function;
import nr.functional_programming.models.Comensal;

public class DatosComensal {
    public static void main(String[] args) {
        Comensal com1 = new Comensal("Fer", 256.2, 5);

        // String nombreCom = (String) getDatoComensal(com1, x -> x.getNombre());
        int mesaCom = (int) getDatoComensal(com1, x -> x.getMesa());
        System.out.println(mesaCom);
    }

    public static Object getDatoComensal(Comensal com, Function<Comensal, Object> fn) {
        return fn.apply(com);
    }

}
