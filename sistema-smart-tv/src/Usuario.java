
public class Usuario {

	public static void main(String[] args) {

		SmartTv smartTv = new SmartTv();

		System.out.println("TV está ligada? " + smartTv.ligada);
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume: " + smartTv.volume);

		smartTv.ligar();
		System.out.println("Novo status -> TV está ligada? " + smartTv.ligada);

		smartTv.desligar();
		System.out.println("Novo status -> TV está ligada? " + smartTv.ligada);

		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		System.out.println("Novo status -> Volume: " + smartTv.volume);
		
		smartTv.mudarCanal(13);
		System.out.println("Novo status -> Canal atual: " + smartTv.canal);
	}

}
