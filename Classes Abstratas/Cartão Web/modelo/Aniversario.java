package modelo;

public class Aniversario extends CartaoWeb {
	
	public Aniversario() {}
	
	public Aniversario(String destinatario) {
		super(destinatario);
	}

	public void showMessage() {
		System.out.println("Feliz aniversario, " + this.getDestinatario() + "!!! \nMuitas felicidades! \n");
	}

	public String toString() {
		return super.toString() + "  Data especial: Aniversario";
	}
	
	
}
