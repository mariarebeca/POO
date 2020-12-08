package visao;

import modelo.Fluorescente;
import modelo.Incandescente;

//classe de teste para criação de lampadas, implementadas da interface lampada

public class Teste {

	public static void main(String[] args) {
		
		Fluorescente f = new Fluorescente();
		Incandescente i = new Incandescente();
		
		System.out.println(f);
		f.ligar();
		f.desligar();
		
		System.out.println("\n::::::::::::");
		
		System.out.println(i);
		i.ligar();
		i.desligar();
		
	}

}
