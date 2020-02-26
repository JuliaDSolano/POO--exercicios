package Lista;

public class Pessoa {
	private
		String nome;
		int idade;
		double peso;
		double altura;
		
	public Pessoa(String nome, int idade, double peso, double alt) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = alt;
	}
	
	public int envelhecer() {
		this.idade += 1;
		if (this.idade < 21){
			this.altura += 0.5;
		}
		return this.idade;
	}
	
	public double engordar(double kg) {
		return this.peso += kg;
	}
	
	public double emagrecer(double kg) {
		return this.peso -= kg;
	}
	
	public double crescer(double cm) {
		return this.altura += cm;
	}
}

