package modelo;

public class Novo extends Imovel {
	
	private double adicional, temp;
	
	public Novo() {}
	
	public Novo(String endereço, double preço) {
		super(endereço, preço);
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public void addAdicional() {
		temp = this.getPreço() + this.adicional;
		this.setPreço(temp);
	}
	
	@Override
	public String valorImovel() {
		String ret = "O preço do Imovel NOVO e = " + getPreço();
		return ret;
	}
	
	public String toString() {
		return "\n::Imóvel novo::" + super.toString();
	}
}