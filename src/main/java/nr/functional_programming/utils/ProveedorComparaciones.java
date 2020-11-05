package nr.functional_programming.utils;

import nr.functional_programming.models.Persona;

public class ProveedorComparaciones {
    public int compararPorNombre(Persona p, Persona v) {
        return p.getNombre().compareTo(v.getNombre());
    }

    public int compararPorEdad(Persona p, Persona v) {
        return p.getEdad().compareTo(v.getEdad());
    }

    public int compararPorEmail(Persona p, Persona v) {
        return p.getEmail().compareTo(v.getEmail());
    }
}
