package nr.functional_programming.expresiones_lambda.ejer2;

public class LamdaTest2 {
    public static void main(String[] args) {
        // Operaciones op = (n1, n2) -> System.out.println(n1 + n2);
        LamdaTest2 obj = new LamdaTest2();
        // obj.miMetodo(op, 5, 8);
        obj.miMetodo((n1, n2) -> System.out.println(n1 * n2), 5, 8);
    }

    public void miMetodo(Operaciones op, int n1, int n2) {
        op.imprimeOperacion(n1, n2);
    }

}
