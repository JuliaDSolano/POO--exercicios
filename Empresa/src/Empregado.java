
public class Empregado {

	private int codigo;
	private String nome;
	private String email;
	protected float salario;
	protected double percentual;
	
	public Empregado(int cod, String nom, String em, float sal, double perc) {
		this.codigo = cod;
		this.nome = nom;
		this.email = em;
		this.salario = sal;
		this.percentual = perc;
	}
	
	public float get_salario() {
		return this.salario;
	}
	
	public void aumento_salarial(double percentual) {
		this.salario = (float) (this. get_salario() * percentual /100) + this.salario;
		System.out.println("Seu salário atual de empregado é: " + this.salario);
		
	}

}
