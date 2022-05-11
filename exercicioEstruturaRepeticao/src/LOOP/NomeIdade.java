package LOOP;

import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {

		//faça um programa que leia conjunto de dois valores,
//		o primeiro representando o nome do aluno e o segundo representando a sua idade.
//		pare inserindo o valor 0 no campo nome.
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		int idade;
		
		while(true) {
			System.out.print("Nome: ");
			nome = scanner.next();
			
			if(nome.equals("0")) {
				break;
			}
			
			System.out.print("idade: ");
			idade = scanner.nextInt();
			
		}
		
		System.out.println("Fim.");
		
		scanner.close();
	}

}
