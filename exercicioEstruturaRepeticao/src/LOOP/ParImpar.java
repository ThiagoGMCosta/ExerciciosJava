package LOOP;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

//		faça um programa que peça n numero inteiros,
//		calcule e mostre a quantidade de numeros pares
//		e a quantidade de numeros impares.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de numeros: ");
		int quantidadeNumeros = scanner.nextInt();
		
		int numero;
		int numeroPar = 0;
		int numeroImpar = 0;
		
		int count = 0;
		
		do {
			System.out.print ("numero: ");
			numero = scanner.nextInt();
			
			if(numero % 2 == 1) numeroImpar++; 
			else numeroPar++;
			
			count++;
		} while (count < quantidadeNumeros);
		
		System.out.println("Numeros impares: " + numeroImpar);
		System.out.println("numeros pares: " + numeroPar);
		
		scanner.close();
	}

}
