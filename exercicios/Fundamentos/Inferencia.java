package Fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		// a = "..." => não altera o tipo da variavel
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		// c = 4.5;
		
		double d ; // variável foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d); // usada!
		
	}
}
