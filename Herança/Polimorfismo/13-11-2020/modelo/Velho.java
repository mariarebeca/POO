package modelo;

public class Velho extends Imovel {
	
	private double desconto, temp;
	
	public Velho() {}
	
	public Velho(String endere�o, double pre�o) {
		super(endere�o, pre�o);
	}

	public double getDesconto() {
		return this.desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public void addDesconto() {
		temp = this.getPre�o() - this.desconto;
		this.setPre�o(temp);
	}
	
	@Override
	public String valorImovel() {
		String ret = "O pre�o do Imovel VELHO e = " + getPre�o();
		return ret;
	}

	public String toString() {
		return "\n::Im�vel antigo::" + super.toString();
	}
	
}
