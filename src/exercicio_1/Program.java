package exercicio_1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int INDICE = 13;
		int SOMA = 0;
		int K = 0;
		
		while (K < INDICE) {
			K = K + 1;
			SOMA = SOMA + K;
		}
		
		System.out.println(SOMA);
		
		sc.close();
		
		//Valor da variavel SOMA é 91
	}
}
