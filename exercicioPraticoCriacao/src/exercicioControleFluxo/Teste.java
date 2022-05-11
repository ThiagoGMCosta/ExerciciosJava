package exercicioControleFluxo;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("informe o mes: ");
		int mes = scanner.nextInt();
		
		System.out.println("Informe o dia da semana de 1 a 7, respectivamente: ");
		int diaSemana = scanner.nextInt();
		
		Mes.obterMes(mes);
		
		Mes.verificarDiaSemana(diaSemana);
		
		scanner.close();
	}

}
