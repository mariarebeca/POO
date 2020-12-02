package visao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Circulo;
import modelo.Quadrado;

import modelo.Retangulo;
import modelo.iFormaGeometrica;

public class Teste {

	public static void main(String[] args) {
		String forma ="";
		String input;
		float convert;
		
		ArrayList<iFormaGeometrica> formas = new ArrayList<iFormaGeometrica>();
		
		//while(forma != "sair") {
		
			JOptionPane.showMessageDialog(null, "Escolha entre: circulo, quadrado, quadrilatero e retangulo");
			forma = JOptionPane.showInputDialog("Qual a forma geometrica?");
			
			// teste com System.out.println(forma); para verificar se está funcionando o input
			
			if (forma == "circulo") {
				input = JOptionPane.showInputDialog("Qual o raio do circulo?");
				convert = Float.parseFloat(input);
				Circulo c = new Circulo(convert);
				formas.add(c);
			} else if (forma == "quadrado") {
				input = JOptionPane.showInputDialog("Qual o tamanho dos lados?");
				convert = Float.parseFloat(input);
				Quadrado q = new Quadrado(convert);
				formas.add(q);
				} else if (forma == "retangulo") {
					float base, altura;
					input = JOptionPane.showInputDialog("Qual o tamanho da base?");
					base = Float.parseFloat(input);
					input = JOptionPane.showInputDialog("Qual o tamanho da base?");
					altura = Float.parseFloat(input);
					Retangulo r = new Retangulo(base, altura);
					formas.add(r);
				}

		//}
	}

}
