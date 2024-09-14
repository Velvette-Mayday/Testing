package teste;

import oo_heranca.Carro;
import oo_heranca.Ferrari;
import oo_heranca.Fit;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro ferrari = new Ferrari(120);
		
		Carro fit = new Fit(80);
		
		System.out.println(fit.mostrarKm());
		System.out.println(ferrari.mostrarKm());
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		fit.acelerar();
		fit.acelerar();
		fit.acelerar();
		fit.acelerar();
		
		System.out.println(fit.mostrarKm());
		System.out.println(ferrari.mostrarKm());
		
	}
	
}
