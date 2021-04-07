package ExerciciosFeriado;

import java.util.Scanner;

public class reajuste1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			double valorR, saldo, reajuste = 1, saldoTotal;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Qual valor devera ser reajustado? ");
			saldo = ler.nextDouble();
			
			valorR = (saldo * reajuste) / 100;
			
			saldoTotal = saldo + valorR;
			
			System.out.println("O valor com reajuste é: " + valorR + "%");
			System.out.println("Valor Total: " + saldoTotal + " R$");
	}

}
