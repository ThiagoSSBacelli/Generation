package ExerciciosFeriado;

import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valorR, valor, reajuste = 10, valorTotal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual valor devera ser reajustado? ");
		valor = ler.nextDouble();
		
		valorR = (valor * reajuste) / 100;
		
		valorTotal = valor + valorR;
		
		System.out.println("O valor com reajuste é: " + valorR + "%");
		System.out.println("Valor Total: " + valorTotal);
	}

}
