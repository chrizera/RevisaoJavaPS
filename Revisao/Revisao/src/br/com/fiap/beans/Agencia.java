package br.com.fiap.beans;

public class Agencia {

	private int numero;
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	private Banco banco;
	public Agencia(int numero, String nome, Endereco endereco, Telefone telefone, Banco banco) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.banco = banco;
	}
	public Agencia() {
		super();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	
}
