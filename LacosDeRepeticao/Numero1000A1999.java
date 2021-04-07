package LacosDeRepeticao;

import java.util.Scanner;

public class Numero1000A1999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroInicial = 1000, numeroFinal = 1999, x;
				
		Scanner ler = new Scanner(System.in);
				
		for(x=1000 ; x<=1999 ; x++)
		{
			 			
			if(x % 11 == 5)
							
			System.out.println(x);
		}
		
	}

}
