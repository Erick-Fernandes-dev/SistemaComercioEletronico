package br.ufpb.SistemaComercioEletronico;

public class Produto {

	private String codigo;
	private String descricao;
	private double precoVenda;
	private int quantEstoque;
	private String categoria;
	
	public Produto(String codigo, String descricao, double precoVenda, int quantEstoque, String categoria) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoVenda = precoVenda;
		this.quantEstoque = quantEstoque;
		this.categoria = categoria;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public int getQuantEstoque() {
		return quantEstoque;
	}
	
	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	public String toString() {
		return "Código: "+this.codigo+"Descrição: "+this.descricao+"Preço: "+this.precoVenda+"\nQuantidade em estoque: "+this.quantEstoque;
	}
	
	

}


