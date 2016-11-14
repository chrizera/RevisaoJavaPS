package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Banco;
import br.com.fiap.beans.Telefone;

/**
 * Projeto que cadastra objetos do tipo Telefone referente a objetos do tipo Banco
 * que contenham as informações.
 * @see Telefone
 * @see Banco
 * @see TelefoneBO
 * @see ConnectionFactory
 * @author Christian
 * */

public class TelefoneDAO{
	
	/*
	 * Método que cadastra um objeto do tipo Telefone no banco de dados.
	 * @param banco (Objeto da classe Banco), conexao (Objeto do tipo Connection)
	 * @throws Exception
	 * @author Christian RM75949
	 * @see Banco
	 * **/
	public void cadastrarTelefone(Banco banco, Connection conexao) throws Exception{
		
		String comando = "INSERT INTO T_REVISAO_TELEFONE (NR_DDD, NR_TELEFONE, NR_CODIGO, NM_DEPARTAMENTO)"
				+ " VALUES (?,?,?,?)";
		PreparedStatement estrutura = conexao.prepareStatement(comando);
		
		estrutura.setInt(1, banco.getTelefone().getDdd());
		estrutura.setInt(2, banco.getTelefone().getNumero());
		estrutura.setInt(3, banco.getTelefone().getCodigo());
		estrutura.setString(4, banco.getTelefone().getDepartamento());
		
		estrutura.execute();
		
		estrutura.close();
	}
	
	/**
	 * Método que recebe um parâmetro contendo o nome do departamento
	 * e realiza a busca na tabela existente no banco de dados
	 * @author Christian
	 * @return Objeto Telefone preenchido com as informações da tabela do banco de dados.
	 * @see Telefone
	 * */
	public Telefone buscarTelefone(String departamento, Connection conexao) throws Exception {
		
		String comando = "SELECT NR_DDD, NR_TELEFONE, NR_CODIGO, NM_DEPARTAMENTO "
				+ "FROM T_REVISAO_TELEFONE WHERE NM_DEPARTAMENTO = ?";
		PreparedStatement estrutura = conexao.prepareStatement(comando);
		estrutura.setString(1, departamento);
		ResultSet resultado = estrutura.executeQuery();
		Telefone telefone = new Telefone();
		
		
		while(resultado.next()) {
			telefone.setDdd(resultado.getInt("NR_DDD"));
			telefone.setNumero(resultado.getInt("NR_TELEFONE"));
			telefone.setCodigo(resultado.getInt("NR_CODIGO"));
			telefone.setDepartamento(resultado.getString("NM_DEPARTAMENTO"));
		}
		
		estrutura.setString(1, departamento);
		
		resultado.close();
		estrutura.close();
		
		return telefone;
	}
}
