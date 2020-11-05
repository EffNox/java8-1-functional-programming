package nr.functional_programming.metodos_referenciados.ejer1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import nr.functional_programming.models.Persona;
// import nr.functional_programming.utils.ProveedorComparaciones;

public class Principal {
    public static void main(String[] args) {
        List<Persona> people = Arrays.asList(new Persona("Fernando", 21, "dsdadfadf"),
                new Persona("Ximena", 11, "dsdadfadf"), new Persona("Arn", 81, "dsdadfadf"),
                new Persona("Zrtr", 91, "dsdadfadf"), new Persona("Yurrn", 221, "dsdadfadf"),
                new Persona("Pojsdkn", 51, "dsdadfadf"), new Persona("Kanasdf", 8, "dsdadfadf"),
                new Persona("Miguel", 33, "dsdadfadf"));
        // Collections.sort(people, (p1, p2) ->
        // p1.getNombre().compareTo(p2.getNombre()));
        // Collections.sort(people, (p1, p2) -> p1.getEdad().compareTo(p2.getEdad()));
        // Collections.sort(people, Persona::compararPorEdad);
        // ProveedorComparaciones comp = new ProveedorComparaciones();
        // Collections.sort(people, comp::compararPorNombre);
        Collections.sort(people, Persona::compararPorEdad2);
        people.forEach(System.out::println);
    }
}
