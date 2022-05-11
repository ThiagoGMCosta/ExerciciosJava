package ARRAYS;

public class OrdemInversa {

	public static void main(String[] args) {

		// crie um vetor de 6 numeros inteiros e mostre-os na ordem inversa
		
		int[] numeros = {1,0,5,64,55,57};
		int numerosAleatorios = 0;
		
		for (int i = 0; i < numeros.length; i++) {
		numerosAleatorios = numeros[i];	

		System.out.print(numerosAleatorios+" ");
		}
		System.out.println("");
		for (int i = numeros.length -1; i >= 0; i--) {
			numerosAleatorios = numeros[i];	

			System.out.print(numerosAleatorios+" ");
		}
		
	}

}
