
public class CEspecial extends CCorrente {
	private int limite;
	
	public CEspecial(int num, float sal, Clientes cli, int lim) {
		super(num, sal, cli);
		this.limite = lim;
	}
	
	@Override
	public void debitar(float valor) {
		if(valor <= (super.getSaldo() + this.limite))
			super.setSaldo(super.getSaldo() - valor);
			//this.saldo = this.saldo - valor;
			
		else
			System.out.println("Saldo insificiente");
	}
}
