
public class CaixaEletronico {
	public static void main(String[] args) {

		double saldo = 25.0;
		double valorSolicitado = 27.0;

		if (valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println("Saque efetuado, novo saldo: " + saldo + "$");

		} else
			System.out.println("Saldo insuficiente, saldo permanece em: " + saldo + "$");

	}
}