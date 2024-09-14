package desafioModuloClasse;

public class Pessoa {

	String nomePessoa;
	double pesoPessoa;
	
	double comer(Comida a) {
			
		double pesoFinal = a.pesoComida + pesoPessoa;
		
		return pesoFinal;
	}
	
	
}
