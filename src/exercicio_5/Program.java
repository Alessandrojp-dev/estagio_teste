package exercicio_5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String palavraInvertida = "";
		
		System.out.println("Digite uma palavra");
		String palavra = sc.next();
		int tamanhoPalavra = palavra.length();

		for(int i = tamanhoPalavra-1; i >= 0 ; i--) {
			char letra = palavra.charAt(i);
			palavraInvertida = palavraInvertida + letra;
		}
		System.out.println(palavraInvertida);
		sc.close();
	}
}
