package modelo;

public class Velho extends Imovel {
	
	private double desconto, temp;
	
	public Velho() {}
	
	public Velho(String endereço, double preço) {
		super(endereço, preço);
	}

	public double getDesconto() {
		return this.desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public void addDesconto() {
		temp = this.getPreço() - this.desconto;
		this.setPreço(temp);
	}
	
	@Override
	public String valorImovel() {
		String ret = "O preço do Imovel VELHO e = " + getPreço();
		return ret;
	}

	public String toString() {
		return "\n::Imóvel antigo::" + super.toString();
	}
	
}
