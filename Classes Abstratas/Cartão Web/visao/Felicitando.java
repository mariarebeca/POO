package visao;
import java.util.ArrayList;

import modelo.Aniversario;
import modelo.CartaoWeb;
import modelo.DiadosNamorados;
import modelo.Natal;

public class Felicitando {

	public static void main(String[] args) {

		Natal cn1 = new Natal("Alana");
		Natal cn2 = new Natal("David");
		Natal cn3 = new Natal("Maria");
		
		Aniversario ca1 = new Aniversario("David");
		Aniversario ca2 = new Aniversario("Alana");
		Aniversario ca3 = new Aniversario("Maria");
		
		DiadosNamorados cd1 = new DiadosNamorados("David");
		DiadosNamorados cd2 = new DiadosNamorados("Alana");
		DiadosNamorados cd3 = new DiadosNamorados("Maria");
		
		ArrayList<CartaoWeb> cartoes = new ArrayList<CartaoWeb>();
		
		cartoes.add(cn1);
		cartoes.add(cn2);
		cartoes.add(cn3);
		
		cartoes.add(ca1);
		cartoes.add(ca2);
		cartoes.add(ca3);
		
		cartoes.add(cd1);
		cartoes.add(cd2);
		cartoes.add(cd3);
		
	    int n = cartoes.size();
	    for (int i=0; i<n; i++) {
	      cartoes.get(i).showMessage();
	    }
		
	}

}
