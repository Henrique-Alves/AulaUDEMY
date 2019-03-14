package Seção10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinalLy {

	public static void main(String[] args) {
		
		File arquivo = new File ("C:\\Users\\Henrique\\Desktop\\FINALLY.txt");
		Scanner h = null;
		try {
			
			h = new Scanner(arquivo);
			while(h.hasNextLine()) {
				System.out.println(h.hasNextLine());
			}
		}
		catch(FileNotFoundException e){
			
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			
			if (h != null) {
				h.close();
				
			}
		}

		
	}
	

}

