package exercicioPraticoCriacao;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// Calcule a 4 operações básicas:
		// a partir da hora do dia informe a mensagem adequada: Bom dia, boa tarde e boa noite
		// calcule o valor final de um emprestimo a partir do valor solicitado. taxas e parcelas influenciam. Defina arbritrariamente as faixas que influenciam nos valores
		
		Calculadora calculadora = new Calculadora();
		Mensagem mensagem = new Mensagem();
		Emprestimo emprestimo = new Emprestimo();
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("Informe o primeiro numero: ");
//		double numero1 = scanner.nextDouble();
//		
//		System.out.print("Informe o segundo numero: ");
//		double numero2 = scanner.nextDouble();
//		
//		System.out.print("Informe a hora: ");
//		double horas = scanner.nextDouble();
		
		System.out.print("Valor do emprestimo: ");
		double valorEmprestimo = scanner.nextDouble();
		
		System.out.print("Quantidade de parcelas: ");
		int quantidadeParcelas = scanner.nextInt();
		
//		calculadora.adicao(numero1, numero2);
//		calculadora.subtracao(numero1, numero2);
//		calculadora.multiplicacao(numero1, numero2);
//		calculadora.divisao(numero1, numero2);
//		mensagem.horaDoDia(horas);
		emprestimo.valorFinal(valorEmprestimo, quantidadeParcelas);
		
		
		scanner.close();

	}

}
