//Julia Solano - BSI3


public abstract class Funcionario {
	protected String nome; //gerente e programador vai poder acessar o nome
	protected double salario;
	
	public Funcionario(String no, double sal) {
		this.nome = no;
		this.salario = sal;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String no) {
		this.nome = no;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double sal) {
		this.salario = sal; 
	}
	public abstract void aumentaSalario();
		
	
	
	
	
	
	
	
}

