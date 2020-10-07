package modelo;
import java.util.ArrayList;

import modelo.ItemPedido;


public class Pedido {

	//	Um pedido é composto por um conjunto de itens pedidos.
	
	private float valorTotal;
	private ItemPedido item;

	ArrayList<ItemPedido> pedido = new ArrayList<ItemPedido>();
	
	public Pedido () {}

	public float getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void adicionaritem(ItemPedido item) {
		pedido.add(item);
	}
	
	public float obtertotal() {
		//O cálculo do valor total do pedido deverá ser feito mediante a soma do preço de cada produto incluído nos itens pedidos.
		int tam, i;
		
		tam = pedido.size();
		
		for (i= 0; i<tam; i++) {
			this.valorTotal += pedido.get(i).getProduto().getValor()*pedido.get(i).getQuantidade() ;
		}
		return this.valorTotal;
	}

	public void listadepedido() {
		int tam, i;
		
		tam = pedido.size();
		
		System.out.println("\n:::LISTA DE PEDIDOS:::");
		for (i= 0; i<tam; i++) {
			System.out.println("\nItem: " +pedido.get(i).getProduto().getDescricao() + "  Quantidade: " +pedido.get(i).getQuantidade());
		}
	}
	
	public String toString() {
		return "\nValor total do pedido: " + this.valorTotal;
	}
	
	
}
