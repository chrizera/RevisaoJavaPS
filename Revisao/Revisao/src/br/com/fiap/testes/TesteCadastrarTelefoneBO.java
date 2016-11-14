package br.com.fiap.testes;

import java.sql.Connection;

import br.com.fiap.beans.Banco;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;
import br.com.fiap.bo.TelefoneBO;
import br.com.fiap.conexao.ConnectionFactory;

public class TesteCadastrarTelefoneBO {

	public static void main(String[] args) {

		try {
			Connection conexao = ConnectionFactory.controlarInstancia().getConnection();

			Endereco endereco2 = new Endereco("Rua 2", 2, "AP 2", "Bairro 2", "002", "Sao paulo");
			Telefone telefone2 = new Telefone(2, 2, 2, "Dep 2");
			Banco banco2 = new Banco(2, "Banco 2", "Cnpj 2", endereco2, telefone2, "site2.com");

			TelefoneBO bo = new TelefoneBO();

			bo.validarCadastrarTelefone(banco2, conexao);
			System.out.println("Cadastrado 2");
		}
		catch(Exception e) {
			System.out.println("Deu ruim");
	}
}

}
