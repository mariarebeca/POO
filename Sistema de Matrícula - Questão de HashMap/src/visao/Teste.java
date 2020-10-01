package visao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Teste {

	 public static void main(String[] args) {
		 
		 //criação
		 HashMap<String, String> sistema = new HashMap<String, String>();
		 
		 //inserção de valores
		 sistema.put("JM", "131095");
		 sistema.put("JH", "180294");
		 sistema.put("NJ", "120994");
		 sistema.put("JK", "010997");
		 sistema.put("KT", "301295");
		 sistema.put("SJ", "041292");
		 sistema.put("MY", "090393");
		 sistema.put("MM", "121288");
		 sistema.put("FF", "060712");
		 
		 //impressão de chave e valor
		 for (HashMap.Entry<String, String> entry : sistema.entrySet()) {
			 System.out.println("\nAluno: " +entry.getKey() + "  Matricula: " + entry.getValue());
		 }
		 
		 //consulta de valores
		 System.out.println(sistema.containsKey("JM"));
		 System.out.println(sistema.containsValue("090393"));
		 System.out.println(sistema.containsValue("0903"));
		 
		 //removendo valores
		 sistema.remove("FF", "060712");
		 sistema.remove("MM");
		 
		 //conferindo remoção
		 for (HashMap.Entry<String, String> entry : sistema.entrySet()) {
			 System.out.println("\nAluno: " +entry.getKey() + "  Matricula: " + entry.getValue());
		 }
		 
	 }
	 
}
