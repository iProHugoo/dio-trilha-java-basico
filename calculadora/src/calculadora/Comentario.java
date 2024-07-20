package calculadora;

public class Comentario {

	public static void main(String[] args) {
		// Comentário em única linha
		
		/* 
		 * Comentário em bloco
		 * de texto mais detalhado
		 * */
		
		/**
		 * Comentário com dois *
		 * é para permitir identificar
		 * quando é comentário
		 * relacionado a nível de documentação
		 */

	}
	
	public int somaMultiplica (int n, int x, String m){
	    int r = 0; // O r é o resultado
	    if (m == "M"){ // M = Multiplicação
	        r = n * x;
	    }else{
	        // Se não, soma mesmo
	        r = n + x;
	    }
	    return r;
	}

}
