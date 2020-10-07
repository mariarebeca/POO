package modelo;

import modelo.Produto;

public class ItemPedido {
	//Um item pedido associa-se com um produto.

	private int quantidade;
	private Produto produto;
	
	public ItemPedido() {}
	
	public ItemPedido(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return "\nQuantidade de pedidos: " + this.quantidade;
	}
	
}
