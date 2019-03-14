package Seção8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DadosDoTrabalhador {

	public static void main(String[] args) throws ParseException {
		
		Scanner h = new Scanner(System.in);
		
		SimpleDateFormat datac = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.print("Nome do Departamento: ");
		String nomedepartamento1 = h.nextLine();
		System.out.print("Dados do Trabalhador: ");
		System.out.print("Nome do Trabalhador: ");
		String nometrabalhador = h.nextLine();
		System.out.print("Nivel do Trabalhador: ");
		String nivelDoTrabalhador1 = h.nextLine();
		System.out.print("Salario do Trabalhador: ");
		double salarioBase1 = h.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nometrabalhador, nivelDoTrabalhador1.valueOf(nivelDoTrabalhador1), salarioBase1, new Departamento(nomedepartamento1));
		
		System.out.print("quantos contratos o trabalhador teve?: ");
		int n = h.nextInt();
		
		for (int i = 0; i < args.length; i++) {
			
			System.out.println("Numro do Contrato: " + i + " Data: ");
			System.out.print("Data (DD/MM/YYYY ");
			Date contratoDate = datac.parse(h.next());
			System.out.println("Valor Por Hora: ");
			double valorporhora = h.nextDouble();
			System.out.print("Duração do Contrato: ");
			int duracaocontrato = h.nextInt();
			
			ContratroPorHora conthora = new ContratroPorHora(contratoDate, valorporhora, duracaocontrato);
			Trabalhador.addContrato(conthora);
			
		}
		
		System.out.println();
		System.out.print("Mes e ano do Calculo do Salario: ");
		String mesano = h.next();
		int mes2 = Integer.parseInt(mesano.substring(0, 2));
		int ano2 = Integer.parseInt(mesano.substring(3));
		System.out.println("Nome do Trabalhador: " + Trabalhador.getNome());
		System.out.println("Departamento" + Trabalhador.getDepartamento());
		

	}

}
