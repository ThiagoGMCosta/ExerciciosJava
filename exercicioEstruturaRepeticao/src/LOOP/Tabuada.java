package LOOP;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

//		desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer numero inteiro enre 1 e 10,
//		o suaurio deve informa de qual numero ele deseja ver a tabuada.
//		a saida deve ser conforme o exemplo abaixo.
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe o numero: ");
		numero = scanner.nextInt();
		
		
		for (int i=1; i <= 10; i++) {
			
			int resultado = numero * i;
			
			System.out.println(i + " x " + numero + " = " + resultado);
			
		}
		
		scanner.close();
	}

}
