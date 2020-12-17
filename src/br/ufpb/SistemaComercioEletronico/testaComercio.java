package br.ufpb.SistemaComercioEletronico;


import javax.swing.JOptionPane;

public class testaComercio {
	public static void main(String[] args) {
		SistemaComercioEletronicoList a = new SistemaComercioEletronicoList();
		boolean continuar = true;
		while (continuar) {
			int option = Integer.parseInt(JOptionPane.showInputDialog("1.Cadastrar clientes"
					+ "\nBuscar clientes com o prefixo"));

			switch (option) {
			case 1:
				String nome = JOptionPane.showInputDialog("Nome do cliente: ");
				String endereco = JOptionPane.showInputDialog("Endereço: ");
				String email = JOptionPane.showInputDialog("Email: ");
				String id = JOptionPane.showInputDialog("Digite seu CPF/CNPJ");
				Cliente cliente = new Cliente(nome, endereco, email);
				try {
					
					boolean cadastrou = a.cadastraCliente(cliente);
					System.out.println(cadastrou);
					System.out.println(a.existeCliente(cliente));
					} catch (ClienteJaExiste e) {
						System.out.println(e.getMessage());
					}
//
//				if (cadastrou) {
//					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
//				}
//				break;
//
//			case 2:
//				String prefixo = JOptionPane.showInputDialog("Prefixo:");
//
//				JOptionPane.showMessageDialog(null, a.pesquisaClienteComOPrefixo(prefixo));
//				
//				
//			case 3:
//				
	
			
			}

		}
		
	}

}
