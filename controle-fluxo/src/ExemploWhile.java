
// Simula valores aleatórios
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
	public static void main(String[] args) {
		double mesada = 50.0;

		// Enquanto o valor da mesada for maior que 0
		while (mesada > 0) {

			// Irá pegar um doce com valor aleatório
			Double valorDoce = valorAleatorio();

			// Se o valor do doce for maior que a mesada, irá mudar o valor do doce pra
			// mesada pra não retornar valor negativo no valor final da mesada
			if (valorDoce > mesada)
				valorDoce = mesada;

			// Enquanto a mesada for maior que zero, irá continuar pegando doces, quando
			// o valor do doce for maior que a mesada, a aplicação encerra
			System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
			mesada = mesada - valorDoce;
		}
		System.out.println("Mesada:" + mesada);
		System.out.println("Joãozinho gastou toda a sua mesada em doces");

	}

	// Esse método é para gerar um valor aleatório entre 2 e 8
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 8);
	}
}