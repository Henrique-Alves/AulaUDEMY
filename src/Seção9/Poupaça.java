package Se��o9;

public class Poupa�a extends Conta{

	private Double taxaDeJuros;
	
	public Poupa�a() {
			super();
	}

	public Poupa�a(Integer conta, String titular, Double saldo, Double taxaDeJuros) {
		super(conta, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	public void atualizarSaldo() {
	saldo += saldo * taxaDeJuros;	
	}
	@Override
	public void saque (double motante) {
	saldo -= motante;
	}
	
}
