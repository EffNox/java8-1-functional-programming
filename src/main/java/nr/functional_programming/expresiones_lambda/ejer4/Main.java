package nr.functional_programming.expresiones_lambda.ejer4;

public class Main {
    public static void main(String[] args) {
        System.out.println(create().calculate(20, 9));
    }

    private static CalculadoraLong create() {
        long var = 20l;
        return (x, y) -> x / y + var;
    }
}
