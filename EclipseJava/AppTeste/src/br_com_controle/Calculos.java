package br_com_controle;

public class Calculos {
	
	private double num1, num2, results;
	private String op;


	public void setNum1(double num1) {
		this.num1 = num1;
	}


	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getResults() {
		return results;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public double calcular() {
		
		  switch(this.op) {
		  case "+":
			  return this.num1 + this.num2;
		  case "-":
			  return this.num1 - this.num2;
		  case "*":
			  return this.num1 * this.num2;
		  case "/":
			  return this.num1 / this.num2;
		default:
			return 0;
		
		}
		
	}
	
}
