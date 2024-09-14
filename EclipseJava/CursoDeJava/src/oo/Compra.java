package oo;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<>();	
	
	void adicionarItem(Item item) {
		
		this.itens.add(item);
		
	}
	
	double valorCompra() {
		
		double precoFinal = 0;
		
		for(Item item : itens) {
			
			precoFinal += (item.quantidade * item.produto.preco);
			
		}
		
		return precoFinal;
		
	}
	
	
}
