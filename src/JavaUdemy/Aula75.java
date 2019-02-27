package JavaUdemy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula75 {

	public static void main(String[] args) {
		
		List<String> nomeDoList = new ArrayList<>();
		
		nomeDoList.add("maria");
		nomeDoList.add("sebastião");
		nomeDoList.add("Henrique");
		nomeDoList.add("Amanda");
		nomeDoList.add("Catia");
		nomeDoList.add(3, "Guto");//add na posição 3 um  nome.
		nomeDoList.remove("Guto");// remove o nome comparado ou pela posição.
		nomeDoList.remove(2);
	    System.out.println("posição do nome Catia: " + nomeDoList.indexOf("Catia"));
	    System.out.println("posição do nome Henrique: " + nomeDoList.indexOf("Henrique"));
	    //quando não encontra ele retorna -1.
		
		System.out.println(nomeDoList.size());
		
		for(String nome: nomeDoList) {
			
			System.out.println(nome);
		}
 
		nomeDoList.removeIf(nome -> nome.charAt(0) == 's');//nome -> nome.charAt(0) == 's' predicado;
		for (String nome : nomeDoList) {
			
			System.out.println(nome);
		}
		
		List<String> resultado = nomeDoList.stream().filter(nome -> nome.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("-------------");

	for (String nome : resultado) {
			
			System.out.println(nome);
		}
	}

}
