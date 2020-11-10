
public class Programador extends Funcionario {
	
	public Programador(String no, double sal) {
		super(no, sal);
	}
	
	public void aumentaSalario() {
		this.salario = this.salario + (this.salario * 0.3);
	}
	
	
	
}
