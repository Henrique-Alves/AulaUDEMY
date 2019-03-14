package JavaUdemy;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner h = new Scanner(System.in);
		
		String nome = "";
		
		System.out.println("nome do usuario: ");
		nome = h.nextLine();
		
		for (int i = nome.length() -1; i >= 0; i--) {
			
			System.out.println(nome.charAt(i));			
		}
	}

}
