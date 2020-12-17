package br.ufpb.SistemaComercioEletronico;

import java.util.List;

public interface SistemaComercioEletronicoInterface {
	public List<Cliente> pesquisaClientesComNomeComecandoCom(String prefixo);
	public List<Pedido> pesquisaPedidosIncluindoProduto(String codigoProduto);

}
