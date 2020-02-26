package Lista;

public class Bola {
	private String cor;
	private double circunferencia;
	private String material;
		
	public Bola(String c, double circ, String mat) {
		this.cor = c;
		this.circunferencia = circ;
		this.material = mat;
	}
	
	public String trocaCor(String nova_cor) {
		return this.cor = nova_cor;
	}
	
	public String mostraCor() {
		return this.cor;
	}
}


