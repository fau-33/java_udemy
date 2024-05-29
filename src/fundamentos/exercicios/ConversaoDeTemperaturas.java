package fundamentos.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoDeTemperaturas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Converter Celsius em para Fahrenheit");
		System.out.println("Informe a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		
		double conversaoDeTemperatura = (celsius * 1.8) + 32;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("O valor em Fahrenheit é: " + df.format(conversaoDeTemperatura) + "ºF");
		
		System.out.println("=================================");
		
		System.out.println("Converter Fahrenheit para Celsius");
		System.out.println("Informe a temperatura em Fahrenheit: ");
		double Fahrenheit = entrada.nextDouble();
		
		double conversao = (Fahrenheit - 32) / 1.8;
		DecimalFormat dfc = new DecimalFormat("0.00");
		System.out.println("O valor em Celsius é: " + dfc.format(conversao) + "ºC");
		
		entrada.close();
		
	}

}
