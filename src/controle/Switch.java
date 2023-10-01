package src.controle;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String conceito = "";

        System.out.println("Informe a nota: ");

        int nota = entrada.nextInt();

        switch (nota) {
            case 10:
                conceito = "A";
                    break;
            case 9:
                conceito = "B";
                    break;
            case 8:
                conceito = "C";
                    break;
            case 7:
                conceito = "D";
                    break;

            case 6:
                conceito = "E";
                    break;

            case 5:
                conceito = "F";
                    break;

            case 4:
                conceito = "G";
                    break;

            case 3:
                conceito = "H";
                    break;

            case 2:
                conceito = "X";
                    break;

            case 1:
                conceito = "Y";
                    break;

            case 0:
                conceito = "Z";
                    break;

            default:
                conceito = "Conceito invalido";


        }

        System.out.println("O Conceito é: " + conceito);

        entrada.close();
    }
}
