package Arreys;

import java.util.Scanner;

public class ArreysDeterminadoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] VetA = new int[6];
		int soma = 0;
				
		Scanner ler = new Scanner (System.in);
		
		VetA[0] = 1;
		VetA[1] = 0;
		VetA[2] = 5;
		VetA[3] = -2;
		VetA[4] = -5;
		VetA[5] = 7;
	
		System.out.printf("\nOs vetores são %d, %d, %d, %d, %d, %d", VetA[0], VetA[1], VetA[2], VetA[3], VetA[4], VetA[5]);
		
		VetA[4] = 100;
		
		soma = soma + VetA[0] + VetA[1] + VetA[5];
		System.out.println("\nA soma dos vetores A0, A1 e A5 é: " + soma);
		System.out.printf("\nOs vetores são %d, %d, %d, %d, %d, %d", VetA[0], VetA[1], VetA[2], VetA[3], VetA[4], VetA[5]);
		
		}

}
