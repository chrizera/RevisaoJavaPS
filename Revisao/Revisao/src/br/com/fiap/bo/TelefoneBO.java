package br.com.fiap.bo;

import java.sql.Connection;

import br.com.fiap.beans.Banco;
import br.com.fiap.beans.Telefone;
import br.com.fiap.dao.TelefoneDAO;
import br.com.fiap.excecao.Excecao;

public class TelefoneBO {
	
	public static TelefoneDAO dao = new TelefoneDAO();

	public void validarCadastrarTelefone(Banco banco, Connection conexao) throws Exception{
		
		if(banco.getTelefone().getDdd() < 10 || banco.getTelefone().getDdd() > 99) {
			Exception e = new Exception();
			throw new Excecao("O DDD não possui 2 dígitos apenas", e);
		}
		
		dao.cadastrarTelefone(banco, conexao);
	}
	
	public Telefone validarBuscarTelefone(String departamento, Connection conexao) throws Exception {
		
		if(departamento == "") {
			Exception e = new Exception();
			throw new Excecao("O campo 'departamento' está vazio.", e);
		}
		
		departamento = departamento.toUpperCase();
		
		return dao.buscarTelefone(departamento, conexao);
	}
}
