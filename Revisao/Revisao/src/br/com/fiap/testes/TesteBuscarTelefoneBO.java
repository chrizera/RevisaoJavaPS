package br.com.fiap.testes;

import java.sql.Connection;

import br.com.fiap.beans.Telefone;
import br.com.fiap.bo.TelefoneBO;
import br.com.fiap.conexao.ConnectionFactory;
import br.com.fiap.excecao.Excecao;

public class TesteBuscarTelefoneBO {

	public static void main(String[] args) throws Exception{
		
		try {
			
			Connection conexao = ConnectionFactory.controlarInstancia().getConnection();
			String departamento = "";
			TelefoneBO bo = new TelefoneBO();
			Telefone telefone = bo.validarBuscarTelefone(departamento, conexao);
			
			System.out.println(telefone.getDepartamento());
		}
		catch(Exception e) {
			System.out.println("Deu ruim");
		}
	}

}
