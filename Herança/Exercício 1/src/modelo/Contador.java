package modelo;

public class Contador extends Funcionario {
	
	private int inscricaocc;
	
	public Contador() {}
	
	public Contador(int inscricaocc, String nome, String matricula, String dataNascimento, char sexo) {
		super(nome, matricula, dataNascimento, sexo);
		
		this.inscricaocc = inscricaocc;
		
	}

	public int getInscricaocc() {
		return inscricaocc;
	}

	public void setInscricaocc(int inscricaocc) {
		this.inscricaocc = inscricaocc;
	}

	public void executaContabilidade() {
		System.out.println("Executando contabilidade.");
	}

	public String toString() {
		return "\n::Contador:: \nInscricao no Conselho de Contabilidade: " + this.inscricaocc + super.toString();
	}

	
}
