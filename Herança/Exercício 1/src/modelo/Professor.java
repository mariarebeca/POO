package modelo;

public class Professor extends Funcionario {

	private int numHorasAulas;
	
	public Professor() {}
	
	public Professor(int numHorasAulas, String nome, String matricula, String dataNascimento, char sexo) {
		super(nome, matricula, dataNascimento, sexo);
		
		this.numHorasAulas = numHorasAulas;
	}

	public int getNumHorasAulas() {
		return numHorasAulas;
	}

	public void setNumHorasAulas(int numHorasAulas) {
		this.numHorasAulas = numHorasAulas;
	}
	
	public void leciona() {
		System.out.println("O professor está lecionando.");
	}

	public String toString() {
		return "\n::Professor:: \n" + super.toString() + "\nNumero de horas aulas: " + this.numHorasAulas;
	}
	
	
}
