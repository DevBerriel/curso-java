package src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Maria", 9.8);
        Aluno a3 = new Aluno("Joana", 8.8);
        Aluno a4 = new Aluno("Rayssa", 5.8);
        Aluno a5 = new Aluno("Pedro", 7.5);
        Aluno a6 = new Aluno("João", 6.4);
        Aluno a7 = new Aluno("Julia", 5.2);
        Aluno a8 = new Aluno("Caio", 3.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        Predicate<Aluno> estaAprovado = a -> a.nota >=7;
        Function<Aluno, String> saudacaoAprovado =
                a -> "Parabéns " + a.nome + ", você foi aprovado(a)!";


        alunos.stream()
                .filter(estaAprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);

        alunos.stream()
                .filter(a -> a.nota <= 7)
                .map(a -> "Ops " + a.nome + ", você está de recuperação!")
                .forEach(System.out::println);

        alunos.stream()
                .filter(a -> a.nota <= 5)
                .map(a -> "Olá " + a.nome + " Infelizmente você está reprovado!! :(")
                .forEach(System.out::println);



    }
}
