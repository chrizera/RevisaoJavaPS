package br.com.fiap.excecao;

public class Excecao extends Exception{
	
	public Excecao(Exception e) {
		super(e);
		e.printStackTrace();
	}
	
	public Excecao(String mensagem, Exception e) {
		super(mensagem, e);
		System.out.println(mensagem);
		e.printStackTrace();
	}
	
	public Excecao(String mensagem) {
		super(mensagem);
		System.out.println(mensagem);
	}
}
