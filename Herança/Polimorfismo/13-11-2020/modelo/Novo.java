package modelo;

public class Novo extends Imovel {
	
	private double adicional, temp;
	
	public Novo() {}
	
	public Novo(String endere�o, double pre�o) {
		super(endere�o, pre�o);
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
		temp = this.getPre�o() + this.adicional;
		this.setPre�o(temp);
	}
	
	@Override
	public String valorImovel() {
		String ret = "O pre�o do Imovel NOVO e = " + getPre�o();
		return ret;
	}
	
	public String toString() {
		return "\n::Im�vel novo::" + super.toString();
	}
}