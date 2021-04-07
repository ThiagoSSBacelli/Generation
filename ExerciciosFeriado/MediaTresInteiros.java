package ExerciciosFeriado;

import java.util.Scanner;

public class MediaTresInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1, numero2, numero3, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero: ");
		numero1 = ler.nextInt();
		System.out.println("Escreva o segundo numero: ");
		numero2 = ler.nextInt();
		System.out.println("Escreva o terceiro numero: ");
		numero3 = ler.nextInt();
		
		media = (numero1 + numero2 + numero3) / 3;
		
		System.out.println("Sua media é de: " + media);

	}

}
