
public class Estagiario extends Empregado {
	private float descontos;

	public Estagiario(int codigo, String nome, String email, float salario, double percentual, float descontos) {
		super(codigo, nome, email, salario, percentual);
		this.descontos = descontos;
	}
	
	@Override
	public void aumento_salarial(double percentual) {
		this.salario = (float) (this.salario * percentual /100) - this.descontos + this.salario;
		System.out.println("Seu salário atual  de estagiário é: " + this.salario);
	}
	
}