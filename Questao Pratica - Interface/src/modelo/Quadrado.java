package modelo;

public class Quadrado implements iFormaGeometrica{
	
	private float tamLado;
	
	public Quadrado() {}
	
	public Quadrado(float tamLado) {
		this.tamLado = tamLado;
	}
	
	public float getTamLado() {
		return this.tamLado;
	}

	public void setTamLado(float tamLado) {
		this.tamLado = tamLado;
	}

	public float calculaPerimetro() {
		float perimetro = 0;
		perimetro = 4 * this.tamLado;
		
		return perimetro;	
	}

	public float calculaArea() {
		return 2 * this.tamLado;
	}
	
	public String toString() {
		return "\n::Quadrado:: \nTamanho dos lados = " + this.tamLado + "\nArea = " + calculaArea() + "\nPerimetro = " + calculaPerimetro();
	}
	
	
}
