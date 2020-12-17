package br.ufpb.SistemaComercioEletronico;

import java.util.List;

public class Pedido extends ItemDoPedido {

	String STATUS_REALIZADO = "Realizado";
	String AGUARDANDO_CONFIRMAÇÃO_DE_PAGAMENTO = "Aguardando confirmação de pagamento";
	String PAGAMENTO_CONFIRMADO = "Pagamento confirmado";
	String PAGAMENTO_BOLETO = "Pagamento via boleto";
	String PAGAMENTO_CARTÃO ="Pagamento via cartão";
	
	private String data;
	private String status;
	private String numero;
	private String formaPagamento;
	private List<ItemDoPedido> itens;
	
	private Cliente cliente;
	
	
	public Pedido(String data, String status, String numero, String formaPagamento, List<ItemDoPedido> itens,
			Cliente cliente) {
		this.data = data;
		this.status = status;
		this.numero = numero;
		this.formaPagamento = formaPagamento;
		this.itens = itens;
		this.cliente = cliente;
		
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public List<ItemDoPedido> getItens() {
		return itens;
	}
	public void setItens(List<ItemDoPedido> itens) {
		this.itens = itens;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String toString() {
		return "Data"+this.data+"\nStatus:"+this.status+"\nNumero: "+this.numero+"\nForma de pagamento:"+this.formaPagamento;
	}
	
	
	
}

