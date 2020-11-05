package nr.functional_programming.streams.ejer5Reduce;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
// import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class reduce2 {
    public static void main(String[] args) {
        int[] nums = { 4, 6, 1, 10, 12, 15, 55, 7, 8, 9, 10, 2, 5, 8, 9, 1, 010, 45, 6, 9, 33, 66, 85, 97, 81, 24, 99 };
        // int sum = IntStream.of(nums).reduce(0, new IntBinaryOperator() {
        // @Override
        // public int applyAsInt(int left, int right) {
        // return left + right;
        // }
        // });
        // int sum2 = IntStream.of(nums).reduce(0, (acc, current) -> acc + current);
        // int sum3 = IntStream.of(nums).reduce(0, Integer::sum);
        int sum4 = IntStream.of(nums).sum();
        System.out.println(sum4);

        Path ph1 = Paths.get(".", "src/main/java/nr/functional_programming/streams/ejer5Reduce/reduce2.txt");
        String txt = "";
        try (Stream<String> lines = Files.lines(ph1)) {
            txt = lines.map(line -> line.replace(",", "")).reduce("", (l1, l2) -> l1.concat("\n").concat(l2));
            System.out.println(txt);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("reduce2Creado.txt"))) {
            bw.write(txt);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
