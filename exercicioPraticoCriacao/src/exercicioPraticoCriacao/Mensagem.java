package exercicioPraticoCriacao;

public class Mensagem {
	
	public static void horaDoDia(double horas) {
		Boolean bomDia = horas >= 5 && horas <= 11.59;
		Boolean boaTarde = horas >= 12 && horas <= 16.59;
		
		if(bomDia) {
			System.out.println("Bom dia.");
		} else if(boaTarde){
			System.out.println("Boa tarde.");			
		} else {
			System.out.println("Boa noite");
		}
		
		
	}

}
