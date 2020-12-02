package modelo;

public abstract class Quadrilatero implements iFormaGeometrica {
	
	private float l1, l2, l3, l4;
	
	public Quadrilatero() {}
	
	public Quadrilatero(float l1, float l2, float l3, float l4) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
	}
	
	public float getL1() {
		return this.l1;
	}

	public void setL1(float l1) {
		this.l1 = l1;
	}

	public float getL2() {
		return this.l2;
	}

	public void setL2(float l2) {
		this.l2 = l2;
	}

	public float getL3() {
		return this.l3;
	}

	public void setL3(float l3) {
		this.l3 = l3;
	}

	public float getL4() {
		return this.l4;
	}

	public void setL4(float l4) {
		this.l4 = l4;
	}

	public float calculaPerimetro() {
		float perimetro = 0;
		perimetro = this.l1 + this.l2 + this.l3 + this.l4;
		
		return perimetro;		
	}
	
	public String toString() {
		return "\nOs lados do Quadrilatero: \nlado 1 = " + this.l1 + "\nlado 2 = " + this.l2 + "\nlado 3 = " + this.l3 + "\nlado 4 = " + this.l4;
	}
	
	
}
