package Seção9;

public class EmpresarialConta extends Conta {
	
	private Double limite;
	
	public EmpresarialConta() {
		super();
		
	}

	public EmpresarialConta(Integer conta, String titular, Double saldo, Double limite) {
		super(conta, titular, saldo);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	public void Limite(double motante) {
		if(motante <= limite) {
			saldo += motante - 10;
		}
	}
	

}
