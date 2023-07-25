package fundamentos;

public class Temperatura {
	
	// Desafio 1 temperatura
	public static void main(String[] args) {
		// (F - 32) * 5 / 9 = c
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		double fahreinheit = 86;
		double celsius = (fahreinheit - AJUSTE) * FATOR; 
		System.out.println("O resultado é " + celsius + "°C");
		
		fahreinheit = 150;
		celsius = (fahreinheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + "°C");
		
		
	}
}
