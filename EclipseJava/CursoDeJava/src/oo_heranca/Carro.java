package oo_heranca;

public class Carro {
	
	private final int VELOCIDADE_MAXIMA;
	double velocidade = 0;
	private int delta = 5;
	
	Carro(int velocidadeMaxima){
		
		VELOCIDADE_MAXIMA = velocidadeMaxima;
		
	}

	public void acelerar() {
		if(velocidade+delta > VELOCIDADE_MAXIMA) {
			this.velocidade = VELOCIDADE_MAXIMA;
		} else {
			this.velocidade += delta;
		}
		
	}
	
	public void frear() {
		
		if(velocidade >=delta) {
			this.velocidade -= delta;
		} else {
			this.velocidade = 0;
		}
		
	}
	
	public String mostrarKm() {
		
		return String.format("O carro atual roda a: %.2fKm/h", this.velocidade);
		
	}
	
	
	
}
