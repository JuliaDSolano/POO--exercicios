
public class Clientes {
	private String nome;
	private String cpf;
	    
	public Clientes (String nome, String cpf){ //construtor sempre tem o mesmo nome da classe, n�o esquece esperta kk
		this.nome = nome;
	    this.cpf = cpf;
	}      
	
	public String getNome(){
	    return this.nome;  
	}
	
	public String getCpf(){
	    return this.cpf;
	  }
	
@Override //de onde estou buscando 
	public String toString(){
		return(" Cliente: " + this.nome);
	}
	    
}


