package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom dia\n");
		System.out.printf("Megasena: %d %d %d %d %d %d \n" , 5 , 12 , 19 , 33, 42, 45);
		System.out.printf("Salario: %.2f\n", 1482.90);
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Olá %s %s, você tem %d anos!", nome, sobrenome, idade);
		
		
		
		
		
		entrada.close();
		
	}
}
