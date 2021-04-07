package LacosDeRepeticao;

import java.util.Scanner;

public class PrddosdMrnoresQue21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, idade50 = 0, idade21 = 0;
		
		Scanner ler = new Scanner(System.in);
		
		/*System.out.println("Quantas pessoas temos na plateia? ");
		parar = ler.nextInt();*/
		
		System.out.println("Qual a idade da pessoas ? ");
		idade = ler.nextInt();
		
		while(idade != -99)
		{			
			if (idade < 21)
			{
				idade21++;
			}
			if (idade > 50)
			{
				idade50++;
			}
			System.out.println("Qual a idade da pessoas ? ");
			idade = ler.nextInt();
		}
		System.out.println("A quantyidade de pessoas com menos de 21 anos é: " + idade21);
		System.out.println("A quantyidade de pessoas com mais de 50 anos é: " + idade50);

		
	}

}
