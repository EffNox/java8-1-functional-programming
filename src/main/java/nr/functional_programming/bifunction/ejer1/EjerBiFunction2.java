package nr.functional_programming.bifunction.ejer1;

public class EjerBiFunction2 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        String rst = calculadora.calc((x, y) -> "El resultado es: " + (x * y), 2, 5);
        System.out.println(rst);
    }

}
