package br.ufpb.SistemaComercioEletronico;

import java.util.ArrayList;
import java.util.List;

public class SistemaComercioEletronicoList {
	
	private List<Cliente> cliente;
	private List<Pedido> pedido;
	private List<Produto> produto;
	
	//CONSTRUTOR PADRÃO
	public SistemaComercioEletronicoList() {
		this.cliente = new ArrayList<>();
		this.pedido = new ArrayList<>();
		this.produto = new ArrayList<>();
		
	}
	
	//CONSTRUTOR COM PARAMETROS
	public SistemaComercioEletronicoList(List<Cliente> cliente, List<Pedido> pedido, List<Produto> produto) {
		this.cliente = cliente;
		this.pedido = pedido;
		this.produto = produto;
	}
	
	//MÉTODOS
	
	public boolean existeProduto(Produto produto) {
		for (Produto p : this.produto) {
			if (p.equals(produto)) {
				return true;
			}
		}
		return false;
	
		
	}
	
	public List<Produto> pesquisarProduto(String codigo) {
		List<Produto> prod = new ArrayList<>();
		
		for (Produto p : prod) {
			if (p.getCodigo().equals(codigo)) {
				prod.add(p);
			}
		}
		
		return prod;
		}
	
	
	public boolean cadastrarProduto(Produto produto) {
		for (Produto p : this.produto) {
			if (p.equals(produto)) {
				this.produto.add(produto);
				return true;
			}
		}
		
		return false;
	}
	
	
	public boolean cadastraPedido(Pedido pedido) {
		for (Pedido pe : this.pedido) {
			if(pe.equals(pedido)) {
				this.pedido.add(pedido);
				return true;
			}
		}
		return false;
	}
	
	public boolean existePedido(Pedido pedido) {
		for (Pedido pe : this.pedido) {
			if (pe.equals(pedido)){
				return true;
				
			} 
		}
		
		return false;
		
	}
	
	public boolean existeCliente(Cliente cli){
		for(Cliente c : cliente) {
			if(c.equals(cli)){
				return true;
			} 
		}
		return false;
	}
	
	public boolean cadastraCliente(Cliente cli) throws ClienteJaExiste {
		for(Cliente c: cliente) {
			if(existeCliente(cli)) {
				throw new ClienteJaExiste("Cliente já cadastrado");
			}
		}
		return true;
	}
	
	public Cliente pesquisaCliente(String id) throws ClienteJaExiste{
		for (Cliente cl : cliente) {
			if (cl.getId().equals(id)) {
				throw new ClienteJaExiste("Cliente já Exsite");
			}
		}
		
		return null;
	}
	
	public List<Cliente> pesquisaClienteComOPrefixo(String prefixo){
		List<Cliente> retornaPrefixo = new ArrayList<>();
		for(Cliente c : retornaPrefixo) {
			if(c.getNome().startsWith(prefixo)) {
				retornaPrefixo.add(c);
			}
		}
		return retornaPrefixo;
	}
	
	
	
	public List<Pedido> pesquisaPedidosIncluindoProduto(String codigoProduto){ 
		List<Pedido> pedi = new ArrayList<>();
		for(Pedido pe : pedido) {
			if(pe.getCodigo().equals(codigoProduto)) {
				pedi.add(pe);
				
			}
		}
		return pedi;
		
	}

}
