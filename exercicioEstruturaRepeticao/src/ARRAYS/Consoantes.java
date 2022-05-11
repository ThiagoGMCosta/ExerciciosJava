package ARRAYS;

import java.util.Scanner;

public class Consoantes {

	public static void main(String[] args) {
		
		// faça um programa que leia um vetor de 6 caracteres,
//		 e diga quantas consoantes foram lidar
//		 imprima as consoantes.

		Scanner scanner = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		
		int quantidadeConsoantes = 0;
		
		for (int i = 0; i < consoantes.length; i++) {
			System.out.print("informe uma letra: ");
			String listaConsoantes = scanner.next();
			
			if( !(listaConsoantes.equalsIgnoreCase("a") | listaConsoantes.equalsIgnoreCase("e")
					| listaConsoantes.equalsIgnoreCase("i") | listaConsoantes.equalsIgnoreCase("o")
					|listaConsoantes.equalsIgnoreCase("u"))) {
				
				consoantes[i] = listaConsoantes;
				
				quantidadeConsoantes++;
				
			};
			
		}
		for (String string : consoantes) {
			
			if(string != null) 
				
			System.out.print(string + " ");
		}
		
		System.out.println("\nquantidade de letras. " + quantidadeConsoantes);
		
		scanner.close();
	}

}
