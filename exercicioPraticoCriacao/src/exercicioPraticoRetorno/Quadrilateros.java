package exercicioPraticoRetorno;

public class Quadrilateros {
	
	public static double area(double lado) {
		
		System.out.println("area do quadrado: " + lado * lado);
		
		return lado;
		
	}
	
	public static double area(double lado1, double lado2) {
		double resultado = lado1 * lado2;
		
		System.out.println("area do retangulo: " + resultado);
		
		return resultado;
	}
	
	public static double area(double baseMaior, double baseMenor, double altura) {
		double resultado = (baseMaior+baseMenor) * altura;
		
		System.out.println("area do trapezio: " + (baseMaior+baseMenor) * altura);
		
		return resultado;
	}

}
