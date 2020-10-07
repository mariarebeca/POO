package visao;

import modelo.Produto;
import modelo.ItemPedido;
import modelo.Pedido;

public class Teste {

	public static void main(String[] args) {

		Produto p1 = new Produto(1111, 111, "Abacaxi");
		Produto p2 = new Produto(2222, 222, "Acerola");
		Produto p3 = new Produto(3333, 333, "Abacate");
		Produto p4 = new Produto(4444, 444, "Brocolis");
		Produto p5 = new Produto(5555, 555, "Beterraba");
		
		ItemPedido i1 = new ItemPedido(p1, 5);
		ItemPedido i2 = new ItemPedido(p3, 2);
		ItemPedido i3 = new ItemPedido(p5, 1);
		
		Pedido pedido = new Pedido();
		
		pedido.adicionaritem(i1);
		pedido.adicionaritem(i2);
		pedido.adicionaritem(i3);
		
		pedido.obtertotal();
		pedido.listadepedido();
		System.out.println(pedido);
		
	}

}
