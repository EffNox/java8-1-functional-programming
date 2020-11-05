package nr.functional_programming.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado implements Comparable<Empleado> {
    long id;
    String nombre;
    int edad;
    double salario;
    Genero genero;
    String departamento;

    public static enum Genero {
        HOMBRE, MUJER
    }

    public static List<Empleado> empleados() {
        return List.of(new Empleado(1, "Fer", 21, 1000, Genero.HOMBRE, "Lima"),
                new Empleado(2, "Xim", 22, 546, Genero.MUJER, "Chiclayo"),
                new Empleado(3, "Axe", 26, 2500, Genero.HOMBRE, "Puno"),
                new Empleado(4, "Mica", 18, 146, Genero.MUJER, "Arequipa"),
                new Empleado(5, "Fer", 12, 1000, Genero.HOMBRE, "Lima"),
                new Empleado(6, "Yobana", 33, 546, Genero.MUJER, "Chiclayo"),
                new Empleado(7, "Axe", 26, 2500, Genero.HOMBRE, "Puno"),
                new Empleado(8, "Maricielo", 58, 6489, Genero.MUJER, "Arequipa"));
    }

    @Override
    public int compareTo(Empleado o) {
        return this.getNombre().compareTo(((Empleado) o).getNombre());
    }
}
