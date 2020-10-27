package modelo;

public class Coordenador extends Professor {

	private String cargo;
	
	public Coordenador() {}
	
	public Coordenador(String cargo, int numHorasAulas, String nome, String matricula, String dataNascimento, char sexo) {
		super(numHorasAulas, nome, matricula, dataNascimento, sexo);
		
		this.cargo = cargo;
		
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void criaTurmas() {
		System.out.println("Turma criada!");
	}

	public String toString() {
		return "\n::Coordenador:: \nCargo: " + this.cargo + "\n" + super.toString();
	}
	
	
	

}
