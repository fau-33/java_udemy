package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoECubo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = entrada.nextDouble();
		
		double quadrado = valor * valor;
		double cubo = valor * valor * valor;
		
		System.out.println("O quadrado do " + valor + " é: " + quadrado);
		System.out.println("O cubo do " + valor + " é: " + cubo);
		
		entrada.close();
	}

}
