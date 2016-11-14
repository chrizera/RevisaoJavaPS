package br.com.fiap.testes;

import java.sql.Connection;

import br.com.fiap.conexao.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) {
		
		try {
			Connection conexao = ConnectionFactory.controlarInstancia().getConnection();
			System.out.println("Sim");
		}
		catch(Exception e) {
			System.out.println("Nao");
		}
	}

}
