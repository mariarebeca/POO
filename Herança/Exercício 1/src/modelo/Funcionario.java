package modelo;

//superclass
public class Funcionario {
	
	private String nome;
	private String matricula;
	private String dataNascimento;
	private char sexo;
	private double salario;
	
	public Funcionario () {}
	
	public Funcionario (String nome, String matricula, String dataNascimento, char sexo) {
		this.nome = nome;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public char getSexo() {
		return this.sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void recebeSalario(double sal) {
		this.setSalario(sal);
	}

	public String toString() {
		return "\nNome do Funcionario: " + this.nome + "\nMatricula: " + this.matricula + "\nData de Nascimento: " + this.dataNascimento
				+ "\nSexo: " + this.sexo + "\nSalario: " + this.salario;
	}
	
}
