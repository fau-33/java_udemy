package fundamentos.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculo do IMC");
		System.out.println("Informe o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Informe a sua altura: ");
		double altura = entrada.nextDouble();
		
		double calculoIMC = peso / ( altura * altura );
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O seu IMC é: " + df.format(calculoIMC));
		
		entrada.close();
		
		
	}

}
