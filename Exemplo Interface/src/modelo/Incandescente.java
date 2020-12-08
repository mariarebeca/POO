package modelo;

public class Incandescente implements Lampada{

	public Incandescente() {}

	public void ligar() {
		System.out.println("Lampada Incandescente ligada");
	}

	public void desligar() {
		System.out.println("Lampada Incandescente desligada");
	}

	public String toString() {
		return "\nTipo de lampada: incandescente";
	}
	
	
}
