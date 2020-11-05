package nr.functional_programming.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Persona {
    private String nombre;
    private Integer edad;
    private String email;

    public int compararPorEdad(Persona a, Persona b) {
        return a.getEdad().compareTo(b.getEdad());
    }

    public static int compararPorEdad2(Persona a, Persona b) {
        return a.getEdad().compareTo(b.getEdad());
    }
}
