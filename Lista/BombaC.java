package Lista;

public class BombaC {
	private String tipoC;
	private float valorL;
	private float qtdC;
	
	public BombaC(String tipoC, float valorL, float qtdC) {
		this.tipoC = tipoC;
		this.valorL = valorL;
		this.qtdC = qtdC;
	}
	
	public void abastecer(double valor) {
		double qtd = valor/this.valorL;
		this.qtdC += qtd;
		System.out.println("Quantidade: " + qtd + " litros");
	}
	
	public void abastecerLitro(double valor) {
		this.qtdC += valor;
		System.out.println("Quero colocar R$ " + valor * this.valorL);
	}
	
	public void alterarValor(float valor) {
		this.valorL = valor;
		System.out.println("Valor por Litro: " + this.valorL);
	}
	
	public void alterarCombustivel(String comb) {
		this.tipoC = comb;
		System.out.println("Combustível será: "+this.tipoC);
	}
	
	public void novaQtd(float qtdC) {
		this.qtdC = qtdC;
		System.out.println("Litros na bomba: " + this.qtdC);
	}
	
}