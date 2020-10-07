package modelo;

public class Produto {

	private int codigo;
	private float valor;
	private String descricao;
	
	public Produto() {}

	public Produto(int c, float v, String desc) {
		this.codigo = c;
		this.valor = v;
		this.descricao = desc;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getValor() {
		return this.valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {
		return "\n::::Produto:::: \nCodigo: " + this.codigo + "\nValor: "+ this.valor + "\nDescricao: " + this.descricao;
	}
	
}
