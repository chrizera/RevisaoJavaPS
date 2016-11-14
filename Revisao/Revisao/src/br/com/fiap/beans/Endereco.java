package br.com.fiap.beans;

public class Endereco {

	private String nome;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	public Endereco(String nome, int numero, String complemento, String bairro, String cep, String cidade) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}
	public Endereco() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String enderecoCompleto() {
		return "Nome: " + nome + "\nNúmero" + numero + "\nComplemento: " + complemento
				+ "\nBairro: " + bairro + "\nCEP: " + cep + "\nCidade" + cidade;
	}

}
