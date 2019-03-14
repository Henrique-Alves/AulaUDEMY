package Seção9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		
		Scanner h = new Scanner(System.in);
		
		List<Empregado> emp = new ArrayList<>();
		
		System.out.print("Digite a Quantidade de Funcionarios: ");
		int n = h.nextInt();
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Empregado " + i +" data: ");
			System.out.println();
			System.out.print("O funcionario é Terceirizado(S/N)?: ");
			char resp = h.next().charAt(0);
			System.out.println();
			System.out.println("Nome Do Funcionario: ");
			h.nextLine();
			String nome = h.nextLine();
			
			System.out.println("Quantidade de Horas Trabalhadas: ");
			int hr = h.nextInt();
			
			System.out.println("Valor por Hora Trabalhada: ");
			double ht = h.nextDouble();
			if( resp == 'S') {
				
				System.out.println("Adicional: ");
				double add = h.nextDouble();
				Empregado empreg = new EmpregadoTerceirizado(nome, hr, ht, add);
				emp.add(empreg);
			}
			else {
				
				Empregado empreg = new Empregado(nome, hr, ht);
				emp.add(empreg);
			}
			
		}
		System.out.println();
		System.out.println("Pagamento do Funcionario: ");
		for(Empregado ep : emp) {
			
			System.out.println(ep.getFuncionario() + "- $: " + String.format("%2f",ep.formaDePagamento()));
		}

	}

}
