
public abstract class Pessoa {
	private String nome;
	private String endereco;
	
	
	public Pessoa(String no, String end) {
		this.nome = no;
		this.endereco = end;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public abstract void imprimirDados();
	
}
