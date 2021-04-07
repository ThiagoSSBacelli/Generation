package lacosCondicionais;

import java.util.Scanner;

public class SomaQaudrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Double numero1, numero2, numero3, numero4, quadrado1, quadrado2, quadrado3, quadrado4;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Escreva o primeiro numero");
			numero1 = ler.nextDouble();
			System.out.println("Escreva o segundo numero");
			numero2 = ler.nextDouble();
			System.out.println("Escreva o terceiro numero");
			numero3 = ler.nextDouble();
			System.out.println("Escreva o quarto numero");
			numero4 = ler.nextDouble();
			
			quadrado1 = Math.pow(numero1, 2);
			quadrado2 = Math.pow(numero2, 2);
			quadrado3 = Math.pow(numero3, 2);
			quadrado4 = Math.pow(numero4, 2);
			
		if(quadrado3 >= 1000)
		{
			System.out.println("O valor do terceiro numero é: " + quadrado3);
		}
		else
		{
			System.out.println("Os valores são: " + numero1 + numero2 +  numero3 + numero4);
			System.out.println("Os resultados são: " + quadrado1 + quadrado2 + quadrado3 + quadrado4);
		}
	}

}
