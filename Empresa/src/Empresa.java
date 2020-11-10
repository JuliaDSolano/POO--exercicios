
public class Empresa {

	public static void main(String[] args) {
		
		Empregado pessoa1 = new Empregado(001, "Julia", "jdsolano@hotmail.com", 1500,20);
		Chefe pessoa2 = new Chefe(002, "Bonnard", "bf.solano@outlook.com", 2000, 30, 100);		
		Estagiario pessoa3 = new Estagiario(003, "Celia", "cd.solano@hotmail.com", 1000, 10, 10);
		
		pessoa1.aumento_salarial(20);
		pessoa2.aumento_salarial(30);
		pessoa3.aumento_salarial(10);
		
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		

	}

}
