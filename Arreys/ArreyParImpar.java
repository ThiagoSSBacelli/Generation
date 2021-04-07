package Arreys;

import java.util.Scanner;

public class ArreyParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int/* numero,*/ numeroP = 0, numeroI = 0, numeroPS = 0, numeroIS = 0;
		int[] vet = new int[6];
		
		Scanner ler = new Scanner(System.in);
		
		for(int n = 0; n < 6; n++)
		{
			System.out.println("Entre com o " + (n+1) + " nota " );
			vet[n] = ler.nextInt();
	
		if(vet[n] % 2 == 0 ){
			numeroP++;
			numeroPS = numeroPS + vet[n];
			/*System.out.println("\nA soma dos numeros pares são " + numeroPS);*/
		}
		if (vet[n] % 2 == 1 ){
			numeroI++;
			numeroIS = numeroIS + vet[n];
			/*System.out.println("\nA soma dos numero impares são " + numeroIS);*/
		}
		/*numeroPS = numeroP + vet[n];
		numeroIS = numeroI + vet[n];*/
				
	}
		
		System.out.println("\nOs numero impares são " + numeroI);
		System.out.println("\nOs numero pares são " + numeroP);
		System.out.println("\nA soma dos numero impares são " + numeroIS);
		System.out.println("\nA soma dos numeros pares são " + numeroPS);


	} 

}
