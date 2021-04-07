package LacosDeRepeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros, soma = 0, contador = 0;
		
		Scanner ler = new Scanner (System.in);
		
		do
		{
			System.out.println("Escreva os numeros: ");
			numeros = ler.nextInt();
			
			soma = soma + numeros;
			contador++;
		}
		while (numeros != 0);
		{
			System.out.println("A soma dos numeros é: " + soma);
		}
		
	}

}
