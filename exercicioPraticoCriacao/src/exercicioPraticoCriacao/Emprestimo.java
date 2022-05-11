package exercicioPraticoCriacao;

public class Emprestimo {
	
	// calcule o valor final de um emprestimo a partir do valor solicitado. taxas e parcelas influenciam. Defina arbritrariamente as faixas que influenciam nos valores
	
	public static void valorFinal(double valorSolicitado, int parcela) {
		
		
		double taxa15 = 1.15;
		double taxa20 = 1.20;
		
		if(parcela <= 4) {
			double juros = (valorSolicitado ) / parcela;
			System.out.println("Segue o valor das parcelas: " + juros + " x " + parcela + " parcelas");
			
			
		} 
		else if (parcela > 4 && parcela <= 8) {
			double juros = (valorSolicitado * taxa15) / parcela;
			System.out.println("Para parcelas de 5x ate 8x aplicamos juros de 15%, segue o valor das parcelas: " + juros + " x " + parcela + " parcelas");
		} 
		else if(parcela > 8 && parcela <= 12) {
			double juros = (valorSolicitado * taxa20) / parcela;
			System.out.println("Para parcelas acima de 8x ate 12x aplicamos juros de 20%, segue o valor das parcelas: " + juros + " x " + parcela + " parcelas");
		} 
		else {
			System.out.println("Não aceitamos acima de 12 parcelas.");
		}
	}

}
