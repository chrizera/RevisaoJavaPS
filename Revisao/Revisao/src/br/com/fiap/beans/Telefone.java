package br.com.fiap.beans;

public class Telefone {

	private int ddd;
	private int numero;
	private int codigo;
	private String departamento;
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Telefone(int ddd, int numero, int codigo, String departamento) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.codigo = codigo;
		this.departamento = departamento;
	}
	public Telefone() {
		super();
	}
	
	
}
