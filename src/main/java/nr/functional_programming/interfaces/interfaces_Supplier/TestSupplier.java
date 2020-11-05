package nr.functional_programming.interfaces.interfaces_Supplier;

import java.util.function.Supplier;

public class TestSupplier {

    public static void main(String[] args) {
        Supplier<String> i = () -> "Fer";
        System.out.println(i.get());
    }

}
