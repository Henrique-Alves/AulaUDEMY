package Seção8;

import java.util.Date;

public class Pedido {
	
	private Integer id = 0;
	private Date dataDoPedido;
	private StatutosVenda statusDaVenda;
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date dataDoPedido, StatutosVenda statusDaVenda) {
		this.id = id;
		this.dataDoPedido = dataDoPedido;
		this.statusDaVenda = statusDaVenda;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataDoPedido() {
		return dataDoPedido;
	}

	public void setDataDoPedido(Date dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}

	public StatutosVenda getStatusDaVenda() {
		return statusDaVenda;
	}

	public void setStatusDaVenda(StatutosVenda statusDaVenda) {
		this.statusDaVenda = statusDaVenda;
	}

	@Override
	public String toString() {
		return "Pedido: id = " + id + ", data Do Pedido = " + dataDoPedido + ", status Da Venda = " + statusDaVenda ;
	}
	


	

}
