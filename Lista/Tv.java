package Lista;

public class Tv {
	private int canal;
	private int volume;
	
	public Tv(int canal, int volume){
		this.canal = canal;
		this.volume = volume;
	}
	
	public void mostraCanal() {
		System.out.println("Você está no canal: " + this.canal);
	}
	
	public void mostraVolume() {
		System.out.println("Volume: " + this.volume);
	}
	
	public void trocaCanal(int novo_canal) {
		if (novo_canal > 50 || novo_canal < 0) {
			System.out.println("O canal não está disponível! Escolha um outro canal de 1 a 50.");
		} else {
			this.canal = novo_canal;
			System.out.println("Canal: " + this.canal);
		}

	}
	
	public void trocaVolume(int novo_volume) {
		if (novo_volume > 100 || novo_volume < 0) {
			System.out.println("Volume inválido! MIN: 0 MAX: 100");
		} else {
			this.volume = novo_volume;
			System.out.println("Volume está em: " + this.volume);			
		}

	}
}
