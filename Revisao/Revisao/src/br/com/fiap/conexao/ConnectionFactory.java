package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public static ConnectionFactory conexao = null;
	
	public static ConnectionFactory controlarInstancia() {
		
		if(conexao == null) {
			conexao = new ConnectionFactory();
		}
		return conexao;
	}
	
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		return DriverManager.getConnection("jdbc:oracle:thin:/:@localhost:1521:xe","RM75949", "Christo123");
	}
	
}
