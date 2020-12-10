package visao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.lang.IndexOutOfBoundsException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int num = 0;
		
		ArrayList <Integer> numeros = new ArrayList<Integer>();
		
		for (int i=1; i <=10; i++) {
			numeros.add(i);
		}
		
		System.out.println("Digitar a posi�ao: ");
		Scanner e1 = new Scanner(System.in);
		try {
			num = e1.nextInt();
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Por favor, digite uma posi�ao valida: ");
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			scan.close();
		} finally {
			System.out.println("Elemento da posi�ao escolhida: " +numeros.get(num));
			e1.close();
		}
	    
		
		
		/* EXEMPLO 2
		 * Scanner ent = new Scanner(System.in);
		 * try {
			num = ent.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Por favor, digite um n�mero inteiro");
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			scan.close();
		} finally {
			System.out.println("Um n�mero inteiro: " + num);
			ent.close();	
		}
		
		*/
		
		
	}

}
