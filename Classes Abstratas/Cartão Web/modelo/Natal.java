package modelo;

public class Natal extends CartaoWeb {
	
	public Natal() {}
	
	public Natal(String destinatario) {
		super(destinatario);
	}

	public void showMessage() {
		System.out.println("Feliz Natal, " + this.getDestinatario() + "!!! \nBoas Festas! \n");
	}
	
	public String toString() {
		return super.toString() + "  Data especial: Natal";
	}
	
}
