package br.ufpb.SistemaComercioEletronico;

public class ClientePF extends Cliente{
	private String cpf;
	
	public ClientePF() {
		super();
	}

	public ClientePF(String nome, String endereco, String email, String cpf) {
		super(nome, endereco, email);
		this.cpf = cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getId() {
		return cpf;
	}
	
	
	
	
}
