package modelo;

public class Empresa {

	private String nome;
	private String endereco;
	private int cnpj;
	
	public Empresa() {}
	
	public Empresa(String nome, String end, int cnpj) {
		this.endereco = end;
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String toString() {
		return "\n:::Empresa::: \nNome: " + this.nome + "\nSituada em: " + this.endereco + "\nCNPJ: " + this.cnpj;
	}
	
	
	
	
}
