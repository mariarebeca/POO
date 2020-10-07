package visao;
import modelo.Empresa;
import modelo.Funcionarios;

public class Principal {

	public static void main (String[] args) {
		
		Empresa e1 = new Empresa("Jamais Vu", "MOTS Persona", 120419);
		Empresa e2 = new Empresa("Begin", "Wings", 101016);
		
		Funcionarios f1 = new Funcionarios("ABC", "Secretaria", e1);
		Funcionarios f2 = new Funcionarios("DEF", "ADVOGADO", e1);
		Funcionarios f3 = new Funcionarios("GHI", "CONTADOR", e2);
		Funcionarios f4 = new Funcionarios("JKL", "TI", e2);
		
		System.out.println(f1);
		System.out.println(f4);
		
		
	
		
	}
	
}
