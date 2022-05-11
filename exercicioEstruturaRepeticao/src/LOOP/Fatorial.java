package LOOP;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		//Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario
		//ex: 5!= 120
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("fatorial de: ");
		int numero = scanner.nextInt();
		int fatorial = 1;
		
		for(int i = numero; i >= 1; i--) {
			fatorial = fatorial * i;
			
			
			System.out.print(i +  " * "  );
			
			
		}
		System.out.println(" = " + fatorial);
		
		scanner.close();
	}

}
