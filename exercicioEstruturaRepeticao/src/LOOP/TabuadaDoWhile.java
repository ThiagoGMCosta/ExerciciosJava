package LOOP;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int multiplicacao;
		
		int count = 0;
		do {
			System.out.print("Numero: ");
			numero = scanner.nextInt();
			
			multiplicacao = count * numero;
			
			
			count++;
		} while(count <= 10);

		System.out.print( count + " x " + numero + " = " + multiplicacao);
	}

}
