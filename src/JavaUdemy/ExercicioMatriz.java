package JavaUdemy;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		
		Scanner h = new Scanner(System.in);
		
		System.out.print("Digite o valor de N: ");
		int n = h.nextInt();
		System.out.print("Digite o valor de M: ");
		int m = h.nextInt();
		
		int [][] matriz = new int [n][m];
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < m; j++) {
				
				matriz [i][j] = h.nextInt();
			}
			
		}
		int x = h.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				if (matriz[i][j] == x) {
					System.out.println("Posição: " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("esquerdo: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("acima: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("direita: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("a baixo3: " + matriz[i+1][j]);
					}
				
			}
			
		}
		

	}

  }
}
