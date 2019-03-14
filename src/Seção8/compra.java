package Seção8;

import java.util.Date;

public class compra {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido (2500, new Date(), StatutosVenda.Arguadando_Pagamento);
		
		System.out.println(pedido);
		
		StatutosVenda status =  StatutosVenda.Processando;
		
		StatutosVenda status2 = StatutosVenda.valueOf("Processando");
		
		System.out.println(status);
		System.out.println(status2);

	}

}
