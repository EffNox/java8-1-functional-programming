package nr.functional_programming.streams.ejer6ReduccionMutanle;

import java.util.Map;
import java.util.stream.Collectors;

import nr.functional_programming.models.Empleado;

public class reduccion2 {
    public static void main(String[] args) {
        Map<Long, String> idNombreMap = Empleado.empleados().stream()
        .collect(Collectors.toMap(Empleado::getId, Empleado::getNombre));
        System.out.println(idNombreMap);

        // TODO: IMPACTANTE BRO BELLEZA PURA
        Map<Empleado.Genero, String> generoANombreMap = Empleado.empleados().stream().collect(Collectors
                .toMap(Empleado::getGenero, Empleado::getNombre, (nom1, nom2) -> String.join(", ", nom1, nom2)));
        System.out.println(generoANombreMap);
    }
}
