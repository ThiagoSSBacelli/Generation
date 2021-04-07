package Arreys;

import java.util.Scanner;

public class Arrey3x3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] numeros = new int [3][3]; 
		int valorMaisDez = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int l = 0 ; l < 3 ; l++) {
			
			for(int c = 0 ; c < 3 ; c++) {
				
				System.out.println("Entre com a idade: " );
				 numeros[l][c] = ler.nextInt();
				
				 if(numeros[l][c] > 10) {
					 valorMaisDez++;
					}
				
			} 
			
		}
		System.out.println("Os numeros maior que 10 são: " + valorMaisDez);
	}

}
