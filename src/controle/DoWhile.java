package src.controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            texto = entrada.nextLine();


        } while (!texto.equalsIgnoreCase("por favor"));

    }
}
