package modelo;

import modelo2.Proprietario;

public class Carro {
	
	private String modelo, cor, marca, chassi, marchatual;
	private int ano, numportas, nummarchas;
	private int vmax, vatual, volumecomb;
	private boolean tetosolar, cambioaut;
	private Proprietario p;
	
	public Carro() {}
	
	public Carro(String mod, String cor, String marca, String chs, String marchatual, int ano, int nump, int nummar, int vmax, int vatual, int vlm, boolean tetos, boolean cambio, Proprietario p) {
		
		this.modelo = mod;
		this.cor = cor;
		this.marca = marca;
		this.chassi = chs;
		this.marchatual = marchatual;
		this.ano = ano;
		this.numportas = nump;
		this.nummarchas = nummar;
		this.vmax = vmax;
		this.vatual = vatual;
		this.volumecomb = vlm;
		this.tetosolar = tetos;
		this.cambioaut = cambio;
		this.p = p;
	}
	
	public Carro (String modelo, String marchatual, int ano, boolean tetosolar, Proprietario p) {
		this.modelo = modelo;
		this.p = p;
		this.marchatual = marchatual;
		this.ano = ano;
		this.tetosolar = tetosolar;
	}
	
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return this.chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public String getMarchatual() {
		return this.marchatual;
	}
	
	public void setMarchatual(String marcha) {
		this.marchatual = marcha;		
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumportas() {
		return this.numportas;
	}

	public void setNumportas(int numportas) {
		this.numportas = numportas;
	}

	public int getNummarchas() {
		return this.nummarchas;
	}

	public void setNummarchas(int nummarchas) {
		this.nummarchas = nummarchas;
	}

	public int getVmax() {
		return this.vmax;
	}

	public void setVmax(int vmax) {
		this.vmax = vmax;
	}

	public int getVatual() {
		return this.vatual;
	}

	public void setVatual(int vatual) {
		this.vatual = vatual;
	}

	public int getVolumecomb() {
		return this.volumecomb;
	}

	public void setVolumecomb(int volumecomb) {
		this.volumecomb = volumecomb;
	}

	public boolean isTetosolar() {
		return this.tetosolar;
	}

	public void setTetosolar(boolean tetosolar) {
		this.tetosolar = tetosolar;
	}

	public boolean isCambioaut() {
		return this.cambioaut;
	}

	public void setCambioaut(boolean cambioaut) {
		this.cambioaut = cambioaut;
	}

	public void freia() {
		this.vatual = 0;
	}
	
	public void acelera(int a) {
		int i=0;
		
		if(a >= vatual) {
			System.out.println("\nAcelerando a velocidade para " + a + " km/h...");
			for (i=vatual; i<=a; i++) {
				System.out.println(i + " km/h");
			}
			this.vatual = a;
		}
	}

	public void trocamarcha(int marcha) {
		this.marchatual = String.valueOf(marcha);
	}
	
	public void reduzmarcha() {
		int marcha;
		
		if (marchatual == "R") {
			this.marchatual = "0"; // neutro
		} else {
			marcha = Integer.parseInt(marchatual);
			marcha = marcha - 1;
			
			marchatual = String.valueOf(marcha);
		  }
	}

	public String toString() {
		return "\n::::::Carro:::::: \nModelo: " + modelo + "\nCor: " + cor + "\nMarca: " + marca + "\nChassi: " + chassi + "\nAno: " + ano + "\nNumero de portas: " + numportas + "\nNumero de marchas: " + nummarchas + "\nVelocidade maxima: "
				+ vmax + "\nPossui teto solar: " + tetosolar + "\nPossui cambio automatico: " + cambioaut + p;
	}
	
	
	
}
