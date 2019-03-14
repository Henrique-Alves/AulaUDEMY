package Seção10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		
		Scanner h = new Scanner(System.in);
		try {
		String[] vetor = h.nextLine().split(" ");
		
	    int posicao = h.nextInt();
	    
	    System.out.println(vetor[posicao]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("posição invalida! ");
		}
		catch(InputMismatchException e) {
			
			System.out.println("Inserir um numro, e foi inserido uma letra! ");
		}
		
		System.out.println("Programa encerrado! ");
		
		}
	
	
}


