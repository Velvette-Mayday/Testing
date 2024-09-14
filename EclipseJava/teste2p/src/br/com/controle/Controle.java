package br.com.controle;

public class Controle {
	
	private double quantidade;
	private String nome;
	private double valor;
	private double media;
	private double mValor;
	private double vaUn;
	private String maiorNome;
	double total;
	int qtd;
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public double getMedia() {
		return media;
	}
	
	public double getmValor() {
		return mValor;
	}
	
	public double getVaUn() {
		return vaUn;
	}
	
	public String getMaiorNome() {
		return maiorNome;
	}
	
	public double CalcularMedia() {
		
		total += this.valor;
		qtd++;
		
		this.media = total/qtd; 
		return media;	
	}
	
	public double MaiorValor() {
		if (this.mValor < this.vaUn) {
			this.mValor = this.vaUn;
		}
		return mValor;
	}
	public String MaiorNome() {
		if(this.vaUn > this.mValor) {
		this.maiorNome = this.nome;
		}
		return maiorNome;
	}
	
	public double ValorUnidade() {
		this.vaUn = this.valor/this.quantidade;
		return vaUn;
	}
	
}
