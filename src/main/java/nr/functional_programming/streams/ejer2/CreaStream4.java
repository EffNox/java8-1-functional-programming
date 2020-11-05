package nr.functional_programming.streams.ejer2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CreaStream4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        IntStream smChars = entrada.chars();
        smChars.forEach(System.out::println);
        smChars.filter(n -> !Character.isDigit((char) n) && !Character.isWhitespace((char) n))
                .forEach(v -> System.out.println((char) v));
        String srt = "HTML, CSS , JS, BABEL, VADDIN, JAVA, PHP, TYPESCRIPT";
        Pattern.compile(", ").splitAsStream(srt).forEach(System.out::println);
        sc.close();
    }
}
