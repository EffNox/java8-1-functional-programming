package nr.functional_programming.interfaces.interfaces_consumer.ejer1;

import java.util.List;
import java.util.function.Consumer;

import nr.functional_programming.models.Estudiante;

public class OperacionEstudiante {
    public void aceptaAll(List<Estudiante> lstEst, Consumer<Estudiante> cons) {
        lstEst.forEach(e -> cons.accept(e));
    }
}
