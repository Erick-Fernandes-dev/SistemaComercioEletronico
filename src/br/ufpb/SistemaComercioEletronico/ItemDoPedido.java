package br.ufpb.SistemaComercioEletronico;

public class ItemDoPedido extends Produto {
	
	private int quantPedido;
	private Produto produto;
	
	public ItemDoPedido(String codigo, String descricao, double precoVenda, int quantEstoque, String categoria, int quantPedido, Produto produto) {
		super(codigo, descricao, precoVenda, quantEstoque, categoria);
		this.quantPedido = quantPedido;
		this.produto = produto;
	}
	
	
	public ItemDoPedido() {
		this("", "", 0.0, 0, "", 0, null);
		
	}
	
	public String toString() {
		return "";
	}


	public int getQuantPedido() {
		return quantPedido;
	}


	public void setQuantPedido(int quantPedido) {
		this.quantPedido = quantPedido;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double calculaSubTotal() {
		return this.quantPedido * produto.getPrecoVenda();
	}
	
}
