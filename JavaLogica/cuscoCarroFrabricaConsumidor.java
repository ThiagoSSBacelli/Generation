package JavaAulaUm;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo é a soma do custo de fábrica
  com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
  Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
  escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.*/

public class cuscoCarroFrabricaConsumidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Double fabrica, consumidor; 
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Qual o custo de fabrica?");
		fabrica = ler.nextDouble();
				
		consumidor = fabrica + (fabrica * 0.73);
		
		System.out.println("O custo de fabrica é R$" + fabrica);
		System.out.println("O custo ao consumidor é R$" + consumidor);
	}

}
