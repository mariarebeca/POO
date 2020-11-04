package animal;

public class Gato extends Animal {

	public Gato() {}
	
	public Gato(String nome) {
		super(nome);
	}
	
	public String mia() {
		return "Miau miau";
	}
	
	public String toString() {
		return "Gato é um: " + super.toString();
	}
}
