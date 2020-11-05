package nr.functional_programming.streams.ejer6ReduccionMutanle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import nr.functional_programming.models.Empleado;

public class reduccion1 {
    public static void main(String[] args) {
        List<String> list1 = Empleado.empleados().stream().map(Empleado::getNombre).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        list1.forEach(System.out::println);
        Set<String> list2 = Empleado.empleados().stream().map(Empleado::getNombre).collect(Collectors.toSet());
        list2.forEach(System.out::println);
        SortedSet<String> list3 = Empleado.empleados().stream().map(Empleado::getNombre).collect(Collectors.toCollection(TreeSet::new));
        list3.forEach(System.out::println);
    }
}
