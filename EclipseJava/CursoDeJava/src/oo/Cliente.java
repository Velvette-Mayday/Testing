package oo;

import java.util.ArrayList;

public class Cliente {
	
	String nome;

	ArrayList<Compra> compras = new ArrayList<>();
	
	void adicionarCompra(Compra compra) {
		
		this.compras.add(compra);
		
	}
	
	double valorFinal() {
		
		double precoFinal = 0;
		
		for(Compra  compra : compras) {
			
			precoFinal +=  compra.valorCompra();
			
		}
		
		return precoFinal;
		
	}
	
	Cliente(String nome){
		
		this.nome = nome;
		
	}
	
	public String toString() {
		
		return String.format("O valor final da sua compra é: R$%.2f", valorFinal());
		
	}
	
	
}
