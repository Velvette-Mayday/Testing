package oo;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Velvette");
		
		Compra com1 = new Compra();
		Compra com2 = new Compra();

		Item i1 = new Item(2,"Caneta", 5.25);
		Item i2 = new Item(3,"Borracha", 6.60);
		Item i3 = new Item(5,"Apontador", 4.75);
		Item i4 = new Item(10, "Lápis", 3);
		
		c1.adicionarCompra(com1);
		c1.adicionarCompra(com2);
		
		com1.adicionarItem(i1);
		com1.adicionarItem(i2);
		
		com2.adicionarItem(i3);
		com2.adicionarItem(i4);
		
				
		
		System.out.print(c1);
		
		
	}
	
}
