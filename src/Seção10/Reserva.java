package Seção10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer numeroDaReserva;
	private Date checkin;
	private Date Checkout;
	
	public Reserva() {
		
	}

	public Reserva(Integer numeroDaReserva, Date checkin, Date checkout) {
		this.numeroDaReserva = numeroDaReserva;
		this.checkin = checkin;
		Checkout = checkout;
	}

	public Integer getNumeroDaReserva() {
		return numeroDaReserva;
	}

	public void setNumeroDaReserva(Integer numeroDaReserva) {
		this.numeroDaReserva = numeroDaReserva;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return Checkout;
	}
	public long duracao() {
		long diferenca = Checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}
	public void atualizarData(Date checkin, Date Checkout) {
		this.checkin = checkin;
		this.Checkout = Checkout;
	}

	@Override
	public String toString() {
		return " Numero Da Reserva: " + numeroDaReserva + ", checkin: " + sdf.format(checkin) + ", Checkout: " + sdf.format(Checkout);
	}


	
	


	
	
}
