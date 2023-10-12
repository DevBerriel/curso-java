package src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Outros {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Gui", 6.1);
        Aluno a3 = new Aluno("João", 8.1);
        Aluno a4 = new Aluno("Maria", 10);
        Aluno a5 = new Aluno("Ana Paula", 9.1);
        Aluno a6 = new Aluno("Guilherme", 6.8);
        Aluno a7 = new Aluno("João Pedro", 8.1);
        Aluno a8 = new Aluno("Maria Joana", 9.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct...");

        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");

        alunos.stream()
                .distinct()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile");

        alunos.stream()
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);
    }
}
