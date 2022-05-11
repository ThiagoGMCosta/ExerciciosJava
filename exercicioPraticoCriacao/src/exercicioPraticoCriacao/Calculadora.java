package exercicioPraticoCriacao;

public class Calculadora {
	
	public static void adicao(double numero1, double numero2) {
		
		double resultado = numero1 + numero2;
		
		System.out.println("Primeiro numero:" + numero1 + " + Segundo numero:" + numero2 + " = " + resultado);
	}
	
	public static void subtracao(double numero1, double numero2) {
		
		double resultado = numero1 - numero2;
		
		System.out.println("Primeiro numero: " + numero1 + " - Segundo numero:" + numero2 + " = " + resultado);
	}
	
	public static void multiplicacao(double numero1, double numero2) {
		
		double resultado = numero1 * numero2;
		
		System.out.println("Primeiro numero: " + numero1 + " * Segundo numero:" + numero2 + " = " + resultado);
	}

	public static void divisao(double numero1, double numero2) {
		
		double resultado = numero1 / numero2;
		
		System.out.println("Primeiro numero: " + numero1 + " / Segundo numero:" + numero2 + " = " + resultado);
	}
}
