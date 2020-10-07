package modelo;

public class Funcionarios {

	private String nome;
	private String cargo;
	private Empresa empresa;
	
	public Funcionarios() {}
	
	public Funcionarios(String nome, String cargo, Empresa empresa) {
		this.cargo = cargo;
		this.nome = nome;
		this.empresa = empresa;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String toString() {
		return "\n:::::::Funcionario:::::: \nNome:" + this.nome + "\nCargo: " + this.cargo + this.empresa;
	}
	
	
}
