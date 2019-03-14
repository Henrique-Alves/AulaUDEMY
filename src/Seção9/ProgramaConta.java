package Seção9;

public class ProgramaConta {

	public static void main(String[] args) {
		
		Conta acc = new Conta(1001, "henrique", 0.0);
		acc.deposito(3000.00);
		acc.saque(500);
		
		EmpresarialConta ecc = new EmpresarialConta(1002,"Amanda", 0.0, 500.0);
		
		//UPCASTING
		
		Conta acc1 = ecc;
		Conta acc2 =  new EmpresarialConta(1003, "catia", 500.00, 200.0);
		acc2.saque(200.00);
		Conta acc3 = new Poupaça(1004, "Guto", 0.0, 0.01);
		
		//DOWNCASTING
		
		EmpresarialConta acc4 = (EmpresarialConta)acc2;
		acc4.deposito(100.0);
		
		System.out.println("Saldo: " + acc.getSaldo());
		System.out.println("Titular: " + acc.getTitular());
		System.out.println("Numero da conta: " + acc.getConta());
		System.out.println("Saque conta Empresarial: " + acc2.getSaldo());
		
	}

}
