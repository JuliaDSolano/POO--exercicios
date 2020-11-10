
public  class Chefe extends Empregado {
	private float beneficio;

	public Chefe(int cod, String nom, String em, float sal, double perc, float bene) {
		super(cod, nom, em, sal, perc);
		this.beneficio = bene;
	}
	
	@Override
	public void aumento_salarial(double percentual) {
		 this.salario = (float) (this.salario * this.percentual/100) + this.beneficio + this.salario;
		 System.out.println("Seu salário atual  de chefe é: " + this.salario);
	}
	
}
