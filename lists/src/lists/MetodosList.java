package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MetodosList {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		
		System.out.println("crie uma lista e adicione as sete notas: ");
		List<Double> notas = new ArrayList<Double>();
		notas.add(7.0);
		notas.add(9.0);
		notas.add(8.0);
		notas.add(10.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(3.0);
		
		System.out.println(notas.toString());
		System.out.println("exiba a posição da nota 5: " + notas.indexOf(5d));
		
		System.out.println("adicione na lista a nota 8 na posição 4: ");
		notas.add(4, 8d);
		System.out.println(notas);
		
		System.out.println("exiba a posição da nota 5: " + notas.indexOf(5d));
		System.out.println("substitua a nota 5 pela nota 7");
		notas.set(5, 7.0);
		System.out.println(notas);
		
		System.out.println("confira se a nota 5 esta na lista: " + notas.contains(5d));
		
		System.out.println("exiba todas as notas na ordem em que foram informados: ");
		for (Double nota : notas) {
			System.out.print(" "+nota);
		}
		
		System.out.println("exiba a terceira nota adicionada: " + notas.get(2));
		
		System.out.println("exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("exiba a maior nota: " + Collections.max(notas));
		
		System.out.println("exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
			
		}
		System.out.println("soma dos valores: " + soma);
		
		System.out.println("exiba a media das notas: " + (soma/notas.size()));
		
		System.out.println("remova a nota 0: ");
		notas.remove(0);
		System.out.println(notas);
		
		System.out.println("remova a nota da posição 0");
		notas.remove(0d);
		
		System.out.println("remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7 ) {
				iterator1.remove();
			}
		}
		System.out.println(notas);
		
		System.out.println("apague toda a lista: ");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("confira se a lista esta vazia: " + notas.isEmpty());
	}

}
