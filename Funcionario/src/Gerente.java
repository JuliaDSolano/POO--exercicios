
public class Gerente extends Funcionario {
	
	public Gerente(String no, double sal) {
		super(no, sal);
	}
	
	public void aumentaSalario() {
		this.salario = this.salario + (this.salario * 0.2);
	}
	
	
	
}
