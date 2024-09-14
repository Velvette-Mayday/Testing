package oo;

public class Item {

	int quantidade;
	Produto produto;
	
	Item(int quantidade, String nome, double preco){
		this.quantidade = quantidade;
		this.produto = new Produto(preco, nome);
	}
	
}
