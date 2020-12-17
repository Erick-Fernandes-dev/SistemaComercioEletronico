package br.ufpb.SistemaComercioEletronico;

public class Cliente {
	public String id;
	private String nome;
	private String endereco;
	private String email;
	
	public Cliente(String nome,String endereco,String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}
	
	//retorna um construtor mas com valores vazios
	public Cliente() {
		this("","","");
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return"Nome:"+this.nome+"\nEndereço:"+this.endereco+"\nEmail:"+this.endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Cliente other = (Cliente) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public String getId() {
		return id;
	}
	
	
}
