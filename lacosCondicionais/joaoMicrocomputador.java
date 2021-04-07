package lacosCondicionais;

import java.util.Scanner;

public class joaoMicrocomputador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		float tomates, multa, exesso, permitido = 50;
		
		System.out.println("quantos Kg de Tomate voce trouxe: ");
		tomates = ler.nextFloat();
		
		exesso = tomates - permitido;
		multa = 4 * exesso;
		
		if (tomates <= permitido)
		{
			System.out.println("Sua multa é 0");
		}
		else 
		{
			System.out.println("Sua multa é de: R$ " + multa);
		}

	}

}
