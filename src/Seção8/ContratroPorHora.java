package Seção8;

import java.util.Date;

public class ContratroPorHora {
	
	private Date data;
	private double valorPorHora = 0.0;
	private Integer valor = 0;
	
	public ContratroPorHora() {
		
	}

	public ContratroPorHora(Date data, double valorPorHora, Integer valor) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public double valortotal() {
		
		return valorPorHora * valor;
	}

}
