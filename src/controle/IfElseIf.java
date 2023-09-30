package src.controle;

import java.util.Scanner;
public class IfElseIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua nota: ");

        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A! Aprovado!!!");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B! Aprovado!!!");
        }   else if (nota >= 4.1) {
        System.out.println("Conceito C! Recuperação!!!");
        }   else if (nota >= 2.1) {
            System.out.println("Conceito D! Recuperação!!!");
        } else if (nota >= 0.1) {
            System.out.println("Conceito E! Reprovado!!!");
        } else if (nota == 0) {
            System.out.println("Conceito F! Reprovado!!!");

    }
            System.out.println("fim!");
            entrada.close();


    }

}

