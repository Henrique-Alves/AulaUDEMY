package Seção8;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
	
	private static String nome = "";
	private NivelDoTrabalhador nivel;
	private static Double salarioBase = 0.0;
	
	private static Departamento departamento;//desta forma quando for uma associação;
	
	private static List<ContratroPorHora> contrato = new ArrayList<>();//usar o "List" quando for varias associações;
	
	public Trabalhador() {
		
	}

	public Trabalhador(String nome, NivelDoTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public Trabalhador(String nometrabalhador, String valueOf, double salarioBase1, Departamento departamento2) {
		// TODO Auto-generated constructor stub
	}

	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDoTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelDoTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public static Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratroPorHora> getContrato() {
		return contrato;
	}

	
	public static void addContrato(ContratroPorHora contratos) {
		contrato.add(contratos);
		
	}
	public void removeContrato(ContratroPorHora contratos) {
		contrato.remove(contratos);
	}
	
	public static double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar calendario = Calendar.getInstance();
		for(ContratroPorHora c : contrato) {
			calendario.setTime(c.getData());
			int c_ano = calendario.get(Calendar.YEAR);
			int c_mes =	1 + calendario.get(Calendar.MONTH);	
			if (ano == c_ano && mes == c_mes) {
				soma += c.valortotal();
			}
		}
		return soma;
	}

	


}
