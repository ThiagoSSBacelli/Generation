package LacosDeRepeticao;

import java.util.Scanner;

public class ForParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float numero, par = 0, impar = 0;
				
		Scanner ler = new Scanner(System.in);
		
		for( int x = 1 ; x <= 10 ; x++)
		{
			System.out.println("Entre com o numero " + x + " : ");
			numero = ler.nextFloat();
			
			if(numero % 2 == 0)
			{
				par++;
			}
			
			else if (numero % 2 == 1)
			{
				impar++;
			}
			
		}
		System.out.println(par + "Pares");
		System.out.println(impar + "impares");
	}	

}
