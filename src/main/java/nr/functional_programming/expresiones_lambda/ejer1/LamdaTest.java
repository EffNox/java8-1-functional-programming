package nr.functional_programming.expresiones_lambda.ejer1;

public class LamdaTest {
    public static void main(String[] args){
		FunctionTest fl = () -> System.out.println("Hello World");
		LamdaTest obj = new LamdaTest();
		obj.miMetodo(fl);
    }
	public void miMetodo(FunctionTest param) {
		param.saludar();
	}

}
