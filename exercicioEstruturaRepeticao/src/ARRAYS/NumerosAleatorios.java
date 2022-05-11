package ARRAYS;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {

//		faça um programa que leia 20 numeros inteiros aleatorios entre (0 e 100) armazene-os num vetor.
//		ao final mostre os numero e seu sucessores.
	
		Random random = new Random();
		
		int[] numerosAleatorios = new int[10];
		
		for(int i= 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		System.out.println("Numeros aleatorios: ");
		
		for (int i : numerosAleatorios) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nSucessores de numeros aleatorios: ");
		for (int i : numerosAleatorios) {
			System.out.print((i+1) + " ");
		}
	}

}
