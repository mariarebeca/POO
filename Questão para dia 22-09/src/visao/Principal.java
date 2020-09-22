package visao;

import modelo.Carro;
import modelo2.Proprietario;


public class Principal {

	public static void main(String[] args) {
		
		Proprietario p1 = new Proprietario("Maria", "567.908-2", "2345.678");
		System.out.println(p1);
		
		p1.setBairro("Cristo");
		p1.setCep("12345.678");
		p1.setCidade("Joao Pessoa");
		p1.setEstado("PB");
		System.out.println(p1);
		
		System.out.println(p1.getRg());
		
		Carro c1 = new Carro("HB20", "4", 2020, false, p1);
		
		System.out.println(c1);
		
		c1.setNummarchas(5);
		c1.setVatual(40);
		System.out.println("\n" + c1);
		
		c1.acelera(60);
		System.out.println("\n" + c1.getVatual());
		
		c1.trocamarcha(5);
		System.out.println("\n" + c1.getMarchatual());
		
		c1.reduzmarcha();
		System.out.println("\n" + c1.getMarchatual());
		
		c1.freia();
		System.out.println("\n" + c1.getVatual());
		
	}

}
