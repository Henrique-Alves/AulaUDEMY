package JavaUdemy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class AulaData2 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date dataatual = new Date();
		System.out.println(data.format(dataatual));
		
		Date d = data.parse("27/02/2019 14:03:08");
		
		System.out.println(data.format(d));
		
Calendar calendario = Calendar.getInstance();
		
		calendario.setTime(d);
		calendario.add(Calendar.DAY_OF_MONTH, 4);//mudar a data do mês ou semana ou ano;
		d = calendario.getTime();
		
		System.out.println(data.format(d));
		
		System.out.println("---------------");
		
		//como pegar a hora, minutos e segudos;
		
		int minutos = calendario.get(Calendar.MINUTE);
		
		System.out.println(minutos);
		
		
		

	}

}
