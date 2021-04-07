package JavaAulaUm;

/*Faça um sistema que leia a idade de uma pessoa expressa 
  em dias e mostre-a expressa em anos, meses e dias.*/

import java.util.Scanner;

public class DiaMesAno {

	public static void main(String[] args) {

	
	int anos, meses, dias, totalDias;
	
	Scanner ler = new Scanner(System.in);
	
		System.out.println("Entre com os anos: ");
		anos = ler.nextInt();
		System.out.println("Entre com os dias: ");
		dias = ler.nextInt();
		System.out.println("Entre com os meses: ");
		meses = ler.nextInt();
		
		totalDias = anos*365 + meses*30 + dias;
		
				
	System.out.printf("\nSua idade é: %d anos, %d meses, %d dias. ", anos, meses, dias);
	
	}
}
