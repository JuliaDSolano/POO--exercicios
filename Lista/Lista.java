package Lista;

public class Lista {

	public static void main(String[] args) {
		
		System.out.println("------------------------- Bola ----------------");
		
		Bola Bolinha = new Bola("roxa", 3.2, "borracha");
		System.out.println("A cor da sua bola é " + Bolinha.mostraCor());
		System.out.println("A nova cor da sua bola é " + Bolinha.trocaCor("rosa"));
		
		
		System.out.println("--------------------- Quadrado ----------------");

		Quadrado quadradinho = new Quadrado(6);
		System.out.println("O tamanho do lado é: " + quadradinho.retornaLado());
		System.out.println("Área total: " + quadradinho.Area());
		System.out.println("O novo tamanho do lado é: " + quadradinho.mudaLado(8));
		
		
		System.out.println("----------------------- Pessoa ----------------");

		Pessoa Pessoinha = new Pessoa("Matheus", 21, 70, 1.70);
		System.out.println("Irá fazer " + Pessoinha.envelhecer() + " anos");
		
		System.out.println("------------------------ Tv -------------------");
		
		Tv tevezinha = new Tv((int)5, (int)25);
		tevezinha.mostraCanal();
		tevezinha.mostraVolume();
		tevezinha.trocaCanal(45);
		tevezinha.trocaVolume(20);
		
		System.out.println("------------------------ Bichinho -------------");
		
		Bichinho Bicho = new Bichinho ("Pock", false, true, 3);
		Bicho.mudaNome("Rosinha");
		Bicho.mudaFome(true);
		Bicho.mudaSaude(true);
		Bicho.novaIdade(2);
		System.out.println("Nome: " + Bicho.mostraNome());
		System.out.println("Fome: " + Bicho.mostraFome());
		System.out.println("Saúde: " + Bicho.mostraSaude());
		System.out.println("Idade: " + Bicho.mostraIdade());
		System.out.println("Humor: " + Bicho.calcHumor());
		
		System.out.println("------------------------ Bomba ----------------");
		
		BombaC Bomba = new BombaC("diesel", (float)4.45, (float)85);
		Bomba.abastecer((float)50);
		Bomba.abastecerLitro((float)50);
		Bomba.alterarValor((float)4.31);
		Bomba.alterarCombustivel("Álcool");
		Bomba.novaQtd((float)100);
	}

}
