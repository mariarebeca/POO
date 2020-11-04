package animal;

public class Cachorro extends Animal {

	public Cachorro() {}
	
	public Cachorro(String nome) {
		super(nome);		
	}
	
	public String late() {
		return "AU AU";
	}

	public String toString() {
		return "Cachorro é um: " + super.toString();
	}
	
	
}
