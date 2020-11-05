package nr.functional_programming.interfaces.interfaces_consumer.ejer1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import nr.functional_programming.models.Estudiante;

public class Principal {
    public static void main(String[] args) {
        List<Estudiante> lstEst = Arrays.asList(new Estudiante("Fer", null, null, 5.0, null, null),
                new Estudiante("Ximena", null, null, 59.0, null, null),
                new Estudiante("Mal", null, null, 82.0, null, null),
                new Estudiante("Ale", null, null, 25.0, null, null),
                new Estudiante("Yuss", null, null, 95.0, null, null),
                new Estudiante("Yoba", null, null, 105.0, null, null));
        OperacionEstudiante op = new OperacionEstudiante();
        /*
         * Consumer<Estudiante> cons1 = e -> System.out.println(e); Consumer<Estudiante>
         * cons2 = e -> e.setCalificacion(e.getCalificacion() * 1.15);
         * op.aceptaAll(lstEst, cons2); System.out.println(); op.aceptaAll(lstEst,
         * cons1);
         */

        Consumer<Estudiante> cons1 = e -> System.out.println(e);
        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion() * 1.15);
        Consumer<Estudiante> cons3 = cons2.andThen(cons1);
        op.aceptaAll(lstEst, cons3);
    }
}
