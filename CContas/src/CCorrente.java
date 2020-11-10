
public class CCorrente {
	
	private int numero;
	private float saldo;
	private Clientes cliente;
	
	public CCorrente(int num,float sal, Clientes cli) {
		this.numero = num;
		this.saldo = sal;
		this.cliente = cli;	
	}
	
	public void creditar(float valor) {
		this.saldo = this.saldo + valor;	
	}
	
	public void debitar(float valor) {
		if(valor <= this.saldo)
			this.saldo = this.saldo - valor;
		else 
			System.out.println("Saldo insuficiente");
	}
	
	public float getSaldo( ) {
		return this.saldo;
	}

	public void setSaldo(float sal) {
		this.saldo = sal;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Clientes getCliente(){
		return cliente;
	}
	  
	 public void setCliente(Clientes cliente){
	    	 this.cliente = cliente;
	 }
	    
	 public String toString(){
		 return("Conta: "+ this.numero + " Saldo: " + this.saldo + this.cliente);
	 }
	
	
	
}
