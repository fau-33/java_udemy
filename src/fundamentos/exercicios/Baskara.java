package fundamentos.exercicios;

import java.util.Scanner;

public class Baskara {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		double a = entrada.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		double b = entrada.nextDouble();
		
		System.out.println("Digite o valor de c: ");
		double c = entrada.nextDouble();
		
		double delta = b * b + 4 * a * c;
		
		System.out.println("Calculando as raízes da equação " + a + "x² + " + b + "x + " + c + " = 0");
		System.out.println("Delta = " + delta);
		
		entrada.close();
	}

}
