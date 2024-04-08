package exercicio_2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite um número");
		int numero = sc.nextInt();
		int numero1 = 0;
		int numero2 = 1;
		int soma = 0;
		boolean pertence = false;
		
		if (numero == 0) {
			pertence = true;
			System.out.println("O número digitado pertence a sequência fibonacci");
		}
		
		while (soma <= numero) {
			soma = numero1 + numero2;
			numero1 = numero2;
			numero2 = soma;
			
			if (numero == soma) {
				pertence = true;
				System.out.println("O número digitado pertence a sequência fibonacci");
			}
					
		}
		
		if(pertence == false) {
			System.out.println("O número digitado não pertence a sequência fibonacci");
		}
		
		sc.close();
	}
}
