package JavaLacosDecisao;

import java.util.Scanner;

public class QualoMaiorDeles {

	public static void main(String[] args) {
		
		int numero1, numero2, numero3;
		
			Scanner ler = new Scanner(System.in);
		
			System.out.println("Escreva o primeiro numero: ");
			numero1 = ler.nextInt();
			System.out.println("Escreva o segundo numero: ");
			numero2 = ler.nextInt();		
			System.out.println("Escreva o terceiro numero: ");
			numero3 = ler.nextInt();
						
			if(numero1 > numero2 && numero1 > numero3)
			{
				System.out.println("O maior numero é: " + numero1);
			}
			else if(numero2 > numero1 && numero2 > numero3)
			{
				System.out.println("O maior numero é: " + numero2);
			}
			else
			{
				System.out.println("O maior numero é: " + numero3);
			}
			
	}

}
