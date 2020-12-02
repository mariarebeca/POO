package modelo;

public class Retangulo implements iFormaGeometrica {

	private float base, altura;
	
	public Retangulo() {}
	
	public Retangulo (float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	public float getBase() {
		return this.base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return this.altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float calculaPerimetro() {
		float perimetro;
		perimetro = 2 * (this.base+this.altura);
		
		return perimetro;
	}

	public float calculaArea() {
		return this.base * this.altura;
	}

	public String toString() {
		return "\n::Retangulo:: \nbase = " + this.base + "\naltura = " + this.altura + "\nArea = " + calculaArea() + "\nPerimetro = " + calculaPerimetro();
	}
	
	
	
}
