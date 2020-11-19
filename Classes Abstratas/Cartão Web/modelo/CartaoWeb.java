package modelo;

public abstract class CartaoWeb {
	
	private String destinatario;
	
	public CartaoWeb() {}
	
	public CartaoWeb(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public String getDestinatario() {
		return this.destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public abstract void showMessage();

	public String toString() {
		return "Cartao Web! \nDestinatario: " + this.destinatario;
	}

}
