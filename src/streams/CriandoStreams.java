package src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer <Object> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Python ", "JavaScript ", "C++ \n");
        langs.forEach(print);

        String[] maisLangs = {"C# ", "HTML ", "Go ", "CSS\n"};
        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 2).forEach(print);

        List<String> outrasLangs = Arrays.asList("PHP ", "Kotlin ", "Ruby", "MySQL\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

       // Stream.generate(() -> "a").forEach(print);

       // Stream.iterate(0, n -> n +1 ).forEach(print);

    }
}
