package visao;

import modelo.Novo;
import modelo.Velho;

public class Teste {

	public static void main(String[] args) {
		
		Novo casa = new Novo();
		
		Velho ap = new Velho();
		
		casa.setPreço(122222);
		System.out.println(casa.valorImovel());
		
		ap.setPreço(3434);
		System.out.println(ap.valorImovel());
	}
}
