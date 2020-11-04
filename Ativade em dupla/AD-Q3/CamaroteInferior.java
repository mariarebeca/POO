package visao;

public class CamaroteInferior extends Vip {
	
	private String localizašaoIn;
	
	public CamaroteInferior() {}

	public CamaroteInferior(double valorReais, double valoradicional) {
		super(valorReais, valoradicional);
	}

	public String getLocalizašaoIn() {
		return this.localizašaoIn;
	}

	public void setLocalizašaoIn(String localizašaoIn) {
		this.localizašaoIn = localizašaoIn;
	}

	public String toString() {
		return super.toString() + "\nLocalizašao do Ingresso no Camarote Inferior: " + this.localizašaoIn;
	}
	
}
