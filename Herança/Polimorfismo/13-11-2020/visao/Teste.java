package visao;

import modelo.Novo;
import modelo.Velho;

public class Teste {

	public static void main(String[] args) {
		
		Novo casa = new Novo();
		
		Velho ap = new Velho();
		
		casa.setPre�o(122222);
		System.out.println(casa.valorImovel());
		
		ap.setPre�o(3434);
		System.out.println(ap.valorImovel());
	}
}
