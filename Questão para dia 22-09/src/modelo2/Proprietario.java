package modelo2;


public class Proprietario {

	private String nome, rua, bairro, cidade, estado, complemento, cpf, rg, dtnasc, cep;
	
	public Proprietario(String n, String rua, String bairro, String cidade, String est, String comp, String cpf, String rg, String dtnasc, String cep) {
		
		this.nome = n;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = est;
		this.complemento = comp;
		this.cpf = cpf;
		this.rg = rg;
		this.dtnasc = dtnasc;
		this.cep = cep;
		
	}
	
	public Proprietario(String nome, String cpf, String rg) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDtnasc() {
		return this.dtnasc;
	}

	public void setDtnasc(String dtnasc) {
		this.dtnasc = dtnasc;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String toString() {
		return "\n::::::Proprietario:::::: \nNome: " + nome + "\nRua: " + rua + "\nBairro: " + bairro + "\nCidade: " + cidade + "\nEstado: "
				+ estado + "\nComplemento: " + complemento + "\nCPF: " + cpf + "\nRG: " + rg + "\nData de Nascimento: " + dtnasc
				+ "\nCEP: " + cep;
	}
	
	
}
