package JavaUdemy;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner h = new Scanner(System.in);
		
		System.out.println("Digite numeros de entrada");
		
		int n = h.nextInt();
		
		int [][] matriz = new int [n][n];
		
		for (int i = 0; i < n; i++) {//percorre a linha;
			
			for (int j = 0; j < n; j++) {
				matriz [i][j] = h.nextInt();
				
			}
			
		}
		System.out.println("valores da diagonal: ");
		
		for (int i = 0; i < n; i++) {
			
			System.out.println(matriz[i][i] + "");
			
		}
		System.out.println("----------------------");
		
		int cont = 0;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if (matriz[i][j] < 0){
					
					cont++;
				} 
				
			}			
			
		}
		System.out.println("quantidade de numeros negativos: " + cont);

	}

}
