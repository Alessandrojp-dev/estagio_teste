package testeVersionamento2;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
			
		int nota1 = 0, nota2 = 0;
		
		do  {System.out.print("Digite a nota da prova 1: ");
		nota1 = sc.nextInt();
		}while (nota1 < 0 || nota1 > 10);
		
		do  {System.out.print("Digite a nota da prova 2: ");
		nota2 = sc.nextInt();
		}while (nota2 < 0 || nota2 > 10);
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println();
		System.out.println("Sua média é: " + media);
		
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}
		else if (media > 5 && media <= 6 ){
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Reprovado");
		}
		
		
		sc.close();

	}

}
