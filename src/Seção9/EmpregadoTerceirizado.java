package Seção9;

public class EmpregadoTerceirizado extends Empregado {
	
	private Double addTerceirizado;
	
	public EmpregadoTerceirizado() {
		
	}

	public EmpregadoTerceirizado(String funcionario, Integer horas, Double valorDaHora, Double addTerceirizado) {
		super(funcionario, horas, valorDaHora);
		this.addTerceirizado = addTerceirizado;
	}

	public Double getAddTerceirizado() {
		return addTerceirizado;
	}

	public void setAddTerceirizado(Double addTerceirizado) {
		this.addTerceirizado = addTerceirizado;
	}
	@Override
	public double formaDePagamento() {
		return super.formaDePagamento() + addTerceirizado * 1.1 ;
	}
	

}

