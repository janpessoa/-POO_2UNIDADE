package herança ;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Gerente gerente = new Gerente("Janaylson Pessoa", "071.352.104.18", formato.parse("13/08/1989"));
		
		gerente.setDados(3, "Gerente Janaylson Pessoa");
		
		System.out.println(gerente.toString());
		
	}

}
