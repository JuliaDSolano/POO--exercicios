
public class Funcionarios1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Funcionario f1 = new Funcionario("teste", 1000);  -- não posso criar uma classe abstrata
		Gerente g1 = new Gerente("Carlos", 1000);
		Programador p1 = new Programador("Ana", 1000);
		
		g1.aumentaSalario();
		p1.aumentaSalario();
		
		System.out.println(g1.getSalario());
		System.out.println(p1.getSalario());
		
		
		
	}

}
