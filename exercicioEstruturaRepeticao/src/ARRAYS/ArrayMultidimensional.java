package ARRAYS;

import java.util.Random;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		
		//gere e imprim uma matriz m 4x4 com valores aleatorios entre 0-9

		Random random = new Random();
		
		int[][] numerosAleatorios = new int[4][4];

		for(int i = 0; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = random.nextInt(9);
				
			}
			
			}
		System.out.println("matriz: ");
		for (int[] linha : numerosAleatorios) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println();
			
		}
	
	}

}
