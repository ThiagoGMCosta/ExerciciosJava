package LOOP;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {

		// fa�a um programa que pe�a uma nota, entre zero e dez.
//		mostre uma mensagem caso o valor seja invalido e continue pedindo,
//		at� que o usuario informe um valor valido.
		
		Scanner scanner = new Scanner(System.in);
		
		int nota = 0;
		System.out.print("nota: ");
		nota = scanner.nextInt();
		
		
		while(nota < 0 || nota > 10) {
			System.out.print("Informe a nota correta: ");
			nota = scanner.nextInt();
			
		} 
			System.out.println("Fim.");
		}
		
	}


