package nr.functional_programming.interfaces.interfaces_consumer.ejer1;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> cons = x -> System.out.println(x.toUpperCase());
        cons.accept("Javi");
    }
}
