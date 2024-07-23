
public class ExemploForArray {

	public static void main(String[] args) {

		// Em arrays o índice sempre inicia em 0
		String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
		/*
		 * // Índice (obrigatoriamente 0 pois sempre se inicia em 0 
		 * // Enquanto x for menor que o número de alunos, ele continua a execução 
		 * // Bloco de incrementação 
		 * 
		 * for (int x = 0; x < alunos.length; x++) { 
		 * 
		 * // Vai buscar e exibir qual o aluno a partir do índice do mesmo
		 * System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
		 * }
		 */
		
		// De forma abreviada, é criada uma variável aluno, obtendo um elemento do vetor a cada ocorrência
		for (String aluno : alunos) {
			System.out.println("Nome do aluno é: " + aluno);
		}
	}

}
