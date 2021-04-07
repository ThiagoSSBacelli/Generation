package JavaAulaUm; 

/*Faça um sistema que leia a idade de uma pessoa expressa em anos, 
   meses e dias e mostre-a expressa apenas em dias.*/

import java.util.Scanner;

public class idadeExpressaEmAnos {

	public static void main(String[] args)
	{
		int anos, meses, dias, totalDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com os anos: ");
		anos = ler.nextInt();
		System.out.println("Entre com os dias: ");
		dias = ler.nextInt();
		System.out.println("Entre com os meses: ");
		meses = ler.nextInt();
		
		totalDias = anos*365 + meses*30 + dias;
		
		System.out.printf("\nSua idade em dias é: %d", totalDias);
		
	} 
}
