
public class FormatadorCepExemplo {

	public static void main(String[] args) {
		try {
			String cepFormatado = formatarCep("38402022");
			System.out.println(cepFormatado);

		} catch (CepInvalidoException e) {
			System.out.println("O CEP não corresponde com as regras de negócio");
		}
	}

	static String formatarCep(String cep) throws CepInvalidoException {
		if (cep.length() != 8)
			throw new CepInvalidoException();

		// Simulando um cep formatado
		return "38.402-022";
	}

}
