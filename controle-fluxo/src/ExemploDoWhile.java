
import java.util.Random;

public class ExemploDoWhile {

	public static void main(String[] args) {
		System.out.println("Discando...");

		// O do faz a execução acontecer pelo menos uma vez
		do {
			// Excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");

		} while (tocando());

		System.out.println("Alô!");
	}

	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3) == 1;
		System.out.println("Atendeu? " + atendeu);
		
		// Se = 1 (atendeu), encerra o método para continuar tocando
		return ! atendeu;
	}
}