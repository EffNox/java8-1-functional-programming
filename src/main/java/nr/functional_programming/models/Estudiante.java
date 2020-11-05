package nr.functional_programming.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {
    private String identificacion;
    private String nombre;
    private Integer edad;
    private Double calificacion;
    private Double promedio;
    private Double altura;
}
