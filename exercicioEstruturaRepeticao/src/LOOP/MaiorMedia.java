package LOOP;

import java.util.Scanner;

public class MaiorMedia {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero;
		int maiorNumero = 0;
		int soma = 0;
		int count = 0;
		double media;
		
		do {
			System.out.print("numero: ");
			numero = scanner.nextInt();
			
			soma = soma + numero;
			
			media = soma / 5;
			
			if(numero > maiorNumero) maiorNumero = numero;
			
			count++;
			
			
			
		} while(count < 5) ;
		
		
		
		System.out.println("Maior numero é: " + maiorNumero);
		
		System.out.println("media do numeros: " + media);
		
		scanner.close();
			
	}
	

}
