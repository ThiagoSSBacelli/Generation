package ExerciciosFeriado;

import java.util.Scanner;

public class ImprimindoSucessores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, ant, suc;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva um numero qualquer: " );
		numero = ler.nextInt();
		
		ant = numero - 1;
		suc = numero + 1;
		
		System.out.printf("\nSeu numero é: %d Seu sucessor é: %d seu antecessor é: %d ", numero, suc, ant); 	
	}

}