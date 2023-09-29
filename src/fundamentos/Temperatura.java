package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
	// (ºF - 32) x 5/9 = ºC
		
		double fire = 89.5;
		final int trintaeDois = 32;
		final double divisao = 5/9.0;
		
		double temperatura = (fire - trintaeDois) * divisao; 
		System.out.println("Temperatura em graus Celcius: " + temperatura);
}
}
