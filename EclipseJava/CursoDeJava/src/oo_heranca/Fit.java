package oo_heranca;

public class Fit  extends Carro{
	public String mostrarKm() {
			
			return String.format("O Fit roda a: %.2fKm/h", this.velocidade);
			
		}

	public Fit(int velocidadeMaxima){
		super(velocidadeMaxima);
	}

}