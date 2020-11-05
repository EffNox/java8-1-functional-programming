package nr.functional_programming.bifunction.ejer1;

import java.util.function.BiFunction;

public class EjerBiFunction {
    public static void main(String[] args) {
        BiFunction<String, String, String> bi = (x, y) -> x + y;
        System.out.println(bi.apply("Hola", " Mundo"));
    }
}
