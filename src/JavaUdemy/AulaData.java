package JavaUdemy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class AulaData {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date atual = new Date();// exibe a hora atual;
		
		Date y = data.parse("26/02/2019");
		Date x =  dataHora.parse("26/02/2019 16:47:45");
		
		

		System.out.println(dataHora.format(y));
		System.out.println(dataHora.format(x));
		System.out.println(dataHora.format(atual));
		
	}

}
