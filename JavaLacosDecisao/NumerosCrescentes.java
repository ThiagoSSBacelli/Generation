package JavaLacosDecisao;

import java.util.Scanner;

public class NumerosCrescentes {
	
	public static void main(String[] args) {
		
		int numero1, numero2, numero3, maior1, maior2, maior3;
		
		Scanner ler = new Scanner(System.in);
	
		System.out.println("Escreva o primeiro numero: ");
		numero1 = ler.nextInt();
		System.out.println("Escreva o segundo numero: ");
		numero2 = ler.nextInt();		
		System.out.println("Escreva o terceiro numero: ");
		numero3 = ler.nextInt();
		
		if(numero1 < numero2 && numero2 < numero3)
		{
			System.out.println("A sequencia é: "+ numero1 + "," + numero2 + "," + numero3);
		}
		else if(numero1 < numero3 && numero3 < numero2)
		{
			System.out.println("A sequencia é: "+ numero1 + "," + numero3 + "," + numero2);
		}
		else if(numero2 < numero1 && numero1 < numero3)
		{
			System.out.println("A sequencia é: "+ numero2 + "," + numero1 + "," + numero3);
		}
		else if(numero2 < numero3 && numero3 < numero1)
		{
			System.out.println("A sequencia é: "+ numero2 + "," + numero3 + "," + numero1);
		}
		else if(numero3 < numero2 && numero2 < numero1)
		{
			System.out.println("A sequencia é: "+ numero3 + "," + numero2 + "," + numero1);
		}
		else 
		{
			System.out.println("A sequencia é: " + numero3 + "," + numero1 + "," + numero2);
		}
		
	}

}
