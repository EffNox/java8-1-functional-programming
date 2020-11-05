package nr.functional_programming.expresiones_lambda.ejer4;

public class Principal {
    public static void main(String[] args) {
        // engine((long x, long y) -> x + y);
        engine((CalculadoraLong) (x, y) -> x + y);
    }

    public static void engine(CalculadoraInt cal) {

    }

    public static void engine(CalculadoraLong cal) {

    }
}
