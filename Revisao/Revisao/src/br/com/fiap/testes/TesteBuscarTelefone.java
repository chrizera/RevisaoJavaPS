package br.com.fiap.testes;

import java.sql.Connection;

import br.com.fiap.beans.Telefone;
import br.com.fiap.conexao.ConnectionFactory;
import br.com.fiap.dao.TelefoneDAO;

public class TesteBuscarTelefone {

	public static void main(String[] args) {

		try {
			Connection conexao = ConnectionFactory.controlarInstancia().getConnection();
			TelefoneDAO dao = new TelefoneDAO();
			Telefone telefone = dao.buscarTelefone("Dep 1", conexao);
			
			System.out.println(telefone.getDdd());
			System.out.println(telefone.getCodigo());
			System.out.println(telefone.getDepartamento());
			System.out.println(telefone.getNumero());
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Deu ruim");
		}
	}

}
