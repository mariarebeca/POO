package animal;

public class Animal {

	private String nome;
	private String raca; //raça 
	
	public Animal() {}
	
	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return this.raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String caminha() {
		return "Caminhando...";
	}
	
	public String toString() {
		return "animal \nNome: " + this.nome + "\nRaca: " + this.raca;
	}
	
}
