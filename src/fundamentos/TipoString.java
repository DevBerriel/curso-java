package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		String s = "Boa tarde";
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Maria";
		var sobrenome = "Joana";
		var idade = 2;
		var salario = 1320.40;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome
				 + "\nIdade: " + idade + "\nSalario: " + salario);
		
		System.out.printf("A Senhora %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
	
	
	}
}