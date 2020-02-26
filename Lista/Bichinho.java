package Lista;

public class Bichinho {
	private String nome;
	private boolean fome;
	private boolean saude;
	private int idade;
	
	public Bichinho(String nome, boolean fome, boolean saude, int idade) {
		this.nome = nome;
		this.fome = fome;
		this.saude = saude;
		this.idade = idade;
	}
	
	public void mudaNome(String nome) {
		this.nome = nome;
	}
	
	public void mudaFome(boolean fome) {
		this.fome = fome;
	}
	
	public void mudaSaude(boolean saude) {
		this.saude = saude;
	}
	
	public void novaIdade(int idade) {
		this.idade = idade;
	}
	
	public String calcHumor() {
		
		String humor = "   ";
		
		if (this.saude && this.fome) {
			humor = "Baixo";
		} else if (this.saude == false && this.fome == false) {
			humor = "Alto";
		} else {
			humor = "Médio";
		}
		return humor;
	}
	
	public String mostraNome() {
		return this.nome;
	}
	
	public boolean mostraFome() {
		return this.fome;
	}
	
	public boolean mostraSaude() {
		return this.saude;
	}
	
	public int mostraIdade() {
		return this.idade;
	}
	
	
}