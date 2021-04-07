package ExerciciosFeriado;

import java.util.Scanner;

public class precoProduto {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				double valorR, precoProduto, reajuste = 9, precoFinal;
				
				Scanner ler = new Scanner(System.in);
				
				System.out.println("Qual valor devera ser reajustado? ");
				precoProduto = ler.nextDouble();
				
				valorR = (precoProduto * reajuste) / 100;
				
				precoFinal = precoProduto - valorR;
				
				System.out.println("O valor com reajuste é: " + valorR+"R$");
				System.out.println("Valor Total: " + precoFinal+"R$");
		}

	}
