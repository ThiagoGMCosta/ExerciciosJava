package exercicioPraticoSobrecarga;

public class Quadrilatero {

	public static void area (double lado) {
		System.out.println("area do quadrado: " + lado * lado);
	}
	
	public static void area(double lado1, double lado2) {
		System.out.println("area do retangulo: " + lado1 * lado2);
	}
	
	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("area do trapezio: " + (baseMaior+baseMenor) * altura);
	}
	
	public static void area(float diagonal1, float diagonal2 ) {
		
		System.out.println("area do losango: " + (diagonal1 * diagonal2)/2);
	}
}
