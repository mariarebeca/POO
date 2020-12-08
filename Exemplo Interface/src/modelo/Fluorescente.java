package modelo;

public class Fluorescente implements Lampada{

	public Fluorescente() {}

	public void ligar() {
		System.out.println("Lampada Fluorescente ligada");
	}

	public void desligar() {
		System.out.println("Lampada Fluorescente desligada");
	}
	
	public String toString() {
		return "\nTipo de lampada: fluorescente";
	}
	
}
