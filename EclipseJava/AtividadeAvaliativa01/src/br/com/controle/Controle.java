package br.com.controle;

public class Controle {
	
	private String nome, itemMaiorValor;
	private double preco, soma, maiorPreco;
	private int quantidade, contador;

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(String preco) {
		this.preco = Double.valueOf(preco);
	}
	
	public void setQuantidade(String quantidade) {
		this.quantidade = Integer.valueOf(quantidade);
		contador++;
	}
	
	public String getMaiorValor() {
		
		if(this.preco > this.maiorPreco) {
			this.itemMaiorValor = this.nome;
		}
		
		return this.itemMaiorValor;
		
	}
	
	public double getMedia() {
		this.soma += this.preco ;
		
		return this.soma / this.contador;
	}
	
	public double getValorTotal() {
		return this.preco * this.quantidade;
	}

	

}
