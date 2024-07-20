
public class Operadores {

	public static void main(String[] args) {
		String nomeCompleto = "Linguagem" + " " + "Java"; // Concatenação básica
		System.out.println(nomeCompleto);

		String concatenacao = "?"; // Imprime ?
		concatenacao = 1 + 1 + 1 + "1"; // Imprime 31, ele realiza a operação matemátima depois a concatenação
		concatenacao = 1 + "1" + 1 + 1; // Imprime 1111, após a String ele não realiza mais operações matemáticas
		concatenacao = 1 + "1" + 1 + "1"; // Imprime 1111, apenas concatenações
		concatenacao = "1" + 1 + 1 + 1; // Imprime 1111, após a primeira ocorrência de String ele realiza apenas
										// concatenações
		concatenacao = "1" + (1 + 1 + 1); // Imprime 13, ele primeiro realiza a soma das evidências e realiza a
											// concatenação
		System.out.println(concatenacao);

		int numero = -5;
		numero = numero * -1; // No caso o número * -1 é a iteração para deixar o número positivo novamente

		numero++; // Pega o valor e adiciona +1
		numero--; // Pega o valor e diminiui -1, é a mesma regra acima

		System.out.println(numero);

		boolean variavel = true;

		System.out.println(!variavel); // O ! inverte o valor da variável apenas na impressão do resultado neste caso,
										// na memória o valor permanece o mesmo definido

		int a, b;

		a = 5;
		b = 6;

		String resultado = a == b ? "verdadeiro" : "falso"; // Operador condicional ternário, sempre segue a ordem de
															// true e false
		// String resultado = "";

		/*
		 * if(a==b) resultado = "verdadeiro"; else resultado = "falso";
		 */

		System.out.println(resultado);
		
		boolean condicao1 = true;
		boolean condicao2 = true;
		
		if (condicao1 && condicao2) { // && = E
			System.out.println("As duas condições são verdadeiras");
		}
		
		if (condicao1 || condicao2) { // || = OU
			System.out.println("Uma das condições é verdadeira");
		}
		
		System.out.println("Fim");
	}

}
