package modelo;

public class DiadosNamorados extends CartaoWeb {
	
	public DiadosNamorados() {}
	
	public DiadosNamorados(String destinatario) {
		super(destinatario);
	}

	public void showMessage() {
		System.out.println("Feliz dia dos namorados, " + this.getDestinatario() + " <3 \n");
	}
	
	public String toString() {
		return super.toString() + "  Data especial: dia dos namorados";
	}
	
}
