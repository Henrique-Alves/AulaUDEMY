package Seção9;

public class Empregado {
	
	private String funcionario;
	private Integer horas;
	private Double valorDaHora;
	
	public Empregado() {
		
	}

	public Empregado(String funcionario, Integer horas, Double valorDaHora) {
		this.funcionario = funcionario;
		this.horas = horas;
		this.valorDaHora = valorDaHora;
	}

	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorDaHora() {
		return valorDaHora;
	}

	public void setValorDaHora(Double valorDaHora) {
		this.valorDaHora = valorDaHora;
	}
	public double formaDePagamento() {
		return horas * valorDaHora;
	}
	

}
