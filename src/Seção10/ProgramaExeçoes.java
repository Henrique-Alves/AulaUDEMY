package Seção10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramaExeçoes {

	public static void main(String[] args) throws ParseException {
		
		//programa principal do Reserva;
		
		Scanner h = new Scanner(System.in);
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o Numero do Quarto: ");
		int num = h.nextInt();
		System.out.print("Digite a Data Do Checkin: ");
		Date checkin = data.parse(h.next());
		System.out.print("Digite a Data Do Checkout: ");
		Date Checkout = data.parse(h.next());
		
		
			if(!Checkout.after(checkin)) {
				System.out.println("ERRO:Data do Checkout menor do que a data do checkin! ");
			}
			else {
				Reserva reserva = new Reserva(num, checkin , Checkout);
				System.out.println(reserva);
				
				System.out.println();
				System.out.println("Atualização de Reserva: ");
				System.out.println();
				System.out.print("Digite a Data Do Checkin: ");
				checkin = data.parse(h.next());
				System.out.print("Digite a Data Do Checkout: ");
				Checkout = data.parse(h.next());
				
				reserva.atualizarData(checkin, Checkout);
				
				System.out.println(reserva);
		}

	}

}
