package src.arrays;

import java.util.Scanner;

public class DesafioArrays {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas você quer digitar?");

        int quantididadeNotas = entrada.nextInt();

        double[] notas = new double [quantididadeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;

        for (double nota: notas) {
            total += nota;
        }

        double media = total / notas.length;

        System.out.println("A média é :" + media);

        entrada.close();
    }
}
