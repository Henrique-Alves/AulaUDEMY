package Seção8;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Comentarios {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comente com = new Comente("Tenha uma Boa Viagem! ");
		Comente com2 = new Comente("Quero lagosta comfritas! ");
		Postagem p1 = new Postagem(dt.parse("02/03/2019 15:20:00"),
				"Carnaval 2019", 
				"Se me arretar vou bater ai em porto! ", 
				5 );
		p1.addComente(com);
		p1.addComente(com2);
		
		Comente com3 = new Comente("Saiu algo errado ");
		Comente com4 = new Comente("Fudeo que não sei corrigir isso ");
		Postagem p2 = new Postagem(dt.parse("02/03/2019 15:20:00"),
				"Carnaval 2019", 
				"Se me arretar vou bater ai em porto! ", 
				5 );
		p2.addComente(com3);
		p2.addComente(com4);
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
