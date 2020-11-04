package pessoas;

public class Rica extends Pessoa {
	
	private double dinheiro;
	
	public Rica() {}
	
	public Rica(double dinheiro, String nome, int idade) {
		super(nome, idade);
		this.dinheiro = dinheiro;
	}

	public double getDinheiro() {
		return this.dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	public void fazCompras() {
		
	}
	
	

}
