
public class ExemploBreakContinue {
	public static void main(String[] args) {

		// Contador de 1 a 5
		for (int numero = 1; numero <= 5; numero++) {
			if (numero == 3)
				// Caso o número que retorne seja 3, a aplicação irá parar
				break;
			// O continue irá verificar a condição e caso seja verdadeira a aplicação continua rodando
			// continue;
			System.out.println(numero);

		}

	}
}