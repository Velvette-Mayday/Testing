package oo_heranca;

public class Ferrari extends Carro {

	public void acelerar() {
		
		this.velocidade += 15;
		
	}

	public String mostrarKm() {
	
	return String.format("A Ferrari roda a: %.2fKm/h", this.velocidade);
	
	}

	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
	}
	
	
}
