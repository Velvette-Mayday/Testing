package desafioModuloClasse;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Comida c1 = new Comida();
		
		p1.nomePessoa = "Maria";
		p1.pesoPessoa = 60;
		
		c1.nomeComida = "arroz";
		c1.pesoComida = 0.2;
		
		double pesoPosComer = p1.comer(c1);
		
		System.out.println(p1.nomePessoa + " pesava " + p1.pesoPessoa + "KG e após comer " + c1.nomeComida + " engordou " + c1.pesoComida + "KG assim ficando com " + pesoPosComer + "KG");
	}
	
}
