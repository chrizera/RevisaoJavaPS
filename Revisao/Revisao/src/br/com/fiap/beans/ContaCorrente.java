package br.com.fiap.beans;

public class ContaCorrente {

	private int numero;
	private String tipo;
	private double taxaManutencao;
	private String dataAbertura;
	private String dataFechamento;
	private Cliente cliente;
	
	public ContaCorrente(int numero, String tipo, double taxaManutencao, String dataAbertura, String dataFechamento,
			Cliente cliente) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.taxaManutencao = taxaManutencao;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
		this.cliente = cliente;
	}
	public ContaCorrente() {
		super();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getTaxaManutencao() {
		return taxaManutencao;
	}
	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public String getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(String dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
