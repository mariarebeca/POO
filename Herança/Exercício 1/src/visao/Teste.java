package visao;
import modelo.Professor;
import modelo.Contador;
import modelo.Coordenador;

public class Teste {

	public static void main(String[] args) {
	
		Professor p1 = new Professor();
		
		p1.setNome("Alana");
		p1.setNumHorasAulas(60);
		System.out.println(p1);
		
		p1.leciona();
		p1.setSalario(100000);
		p1.setMatricula("A85732");
		System.out.println(p1);
		
		
		System.out.println("\n/////////////\n");
		
		Coordenador cdr = new Coordenador();
		
		cdr.setCargo("Coordenador");
		cdr.setNome("A");
		cdr.criaTurmas();
		cdr.recebeSalario(1234);
		cdr.leciona();
		cdr.setMatricula("S59468");
		System.out.println(cdr);
		
		
		System.out.println("\n/////////////\n");
		
		Contador ct = new Contador();
		
		ct.setNome("B");
		ct.setInscricaocc(7654);
		ct.executaContabilidade();
		ct.setMatricula("B89675");
		ct.setSexo('F');
		System.out.println(ct);		
	
	}

}
