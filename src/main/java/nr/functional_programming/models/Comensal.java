package nr.functional_programming.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Comensal {
    String nombre;
    double monto_pedido;
    int mesa;
}
