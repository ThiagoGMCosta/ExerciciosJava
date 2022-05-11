package exercicioControleFluxo;

public class Mes {
	
	public static void obterMes(int mes) {
		
		switch(mes) {
		case 1: System.out.println("janeiro. ");
		break;
		case 2: System.out.println("fevereiro. ");
		break;
		case 3: System.out.println("março. ");
		break;
		case 4: System.out.println("abril. ");
		break;
		case 5: System.out.println("maio. ");
		break;
		case 6: System.out.println("junho. ");
		break;
		case 7: System.out.println("julho. ");
		break;
		case 8: System.out.println("agosto. ");
		break;
		case 9: System.out.println("setembro. ");
		break;
		case 10: System.out.println("outubro. ");
		break;
		case 11: System.out.println("novembro. ");
		break;
		case 12: System.out.println("dezembro. ");
		break;
		default:
            System.out.println("Mês invalido. ");
            break;
            
      
		
		}
		
		  boolean mesFerias = mes == 6 || mes == 12 || mes == 1; 
		  
		  if(mesFerias) {
			  System.out.println("Férias. ");
		  }
		
		
	}
	
	public static void verificarDiaSemana(int semana) {
		
		switch(semana){
			
		case 1: System.out.println("Segunda-feira. " + 1);
		break;
		case 2: System.out.println("Terça-feita. " + 2);
		break;
		case 3: System.out.println("quarta-feira. " + 3);
		break;
		case 4: System.out.println("quinta-feira. " + 4);
		break;
		case 5: System.out.println("Sexta-feira. " + 5);
		break;
		case 6: System.out.println("sabado. " + 6);
		break;
		case 7: System.out.println("domingo. " +7);
		break;
		default:
            System.out.println("dia da semana invalido. ");
            break;
		}
		
		boolean semanaCerto = semana >= 1 && semana <= 3 ;
		boolean semanaErrado = semana == 4;
		boolean semanaTalvez = semana == 5;
		
		if(semanaCerto) {
			System.out.println("Certo");
		} else if(semanaErrado) {
			System.out.println("errado");
		} else if(semanaTalvez){
			System.out.println("talvez");
		} else {
			System.out.println("valor indefinido");
		}
		
		}
		
	}


