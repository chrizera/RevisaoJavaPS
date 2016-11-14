package br.com.fiap.testes;

import java.sql.Connection;

import br.com.fiap.beans.Banco;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Telefone;
import br.com.fiap.conexao.ConnectionFactory;
import br.com.fiap.dao.TelefoneDAO;

public class TesteCadastrarTelefone {

	public static void main(String[] args) {
		try {

			Connection conexao = ConnectionFactory.controlarInstancia().getConnection();

			Endereco endereco = new Endereco("Rua 1", 1, "AP 1", "Bairro 1", "001", "Sao paulo");
			Telefone telefone = new Telefone(11, 1, 1, "Dep 1");
			Banco banco = new Banco(1, "Banco 1", "Cnpj 1", endereco, telefone, "site1.com");

			TelefoneDAO dao = new TelefoneDAO();

			dao.cadastrarTelefone(banco, conexao);
			System.out.println("Cadastrado");
		}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Deu ruim");
			}
		}

	}
