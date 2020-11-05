package nr.functional_programming.streams.ejer2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CreaStream5 {
    public static void main(String[] args) {
        // Stringrut="D:\\java-FP\\functional_programming\\src\\main\\java\\nr\\functional_programming\\streams\\ejer2\\CreaStream5.txt";
        // Pathph1=Paths.get(rut);
        // El <"."> indica el directorio principal del proyecto
        Path ph1 = Paths.get(".", "src/main/java/nr/functional_programming/streams/ejer2/CreaStream5.txt");
        try (Stream<String> lines = Files.lines(ph1)) {
            lines.forEach(line -> {
                System.out.println("Linea....");
                System.out.println(line);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path dir = Paths.get(".");
        System.out.printf("%nEl arbol de archivos del proyecto para: %s es %n ", dir.toAbsolutePath());
        try (Stream<Path> phs = Files.walk(dir)) {
            phs.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
