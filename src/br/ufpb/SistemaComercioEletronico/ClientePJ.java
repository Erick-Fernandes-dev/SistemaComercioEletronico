package br.ufpb.SistemaComercioEletronico;

public class ClientePJ extends Cliente {
	private String CNPJ;
	
	public ClientePJ(String nome, String endereco, String email, String CNPJ) {
		super(nome, endereco, email);
		this.CNPJ = CNPJ;
		this.id = CNPJ;
	}


	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	
	public String getId() {
		return this.CNPJ;
	}
	
	

}