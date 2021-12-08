package Fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		//(°F - 32) * 5.0/9 = °C
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		double f = 75;
		double c = (f - AJUSTE) * FATOR;
		System.out.println(f + "°F é igual à " + c + "°C");
		
	}
	
}
