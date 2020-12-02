package modelo;

public class Circulo implements iFormaGeometrica {
	
	private float raio;
	
	public Circulo() {}
	
	public Circulo(float raio) {
		this.raio = raio;
	}

	public float getRaio() {
		return this.raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float calculaPerimetro() {
		return 2 * 3.14f * this.raio ;
	}

	public float calculaArea() {
		float calc = 0;
		calc = this.raio * this.raio;
		return 3.14f * calc;
	}
	
	public String toString() {
		return "\n::Circulo:: \nRaio = " + this.raio + "\nArea = " + calculaArea() + "\nPerimetro = " + calculaPerimetro();
	}
	
	

}
