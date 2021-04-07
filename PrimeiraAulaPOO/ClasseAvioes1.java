package PrimeiraAulaPOO;

import java.util.Scanner;
public class ClasseAvioes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String linha, modelo;
		int passageiro;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o modelo do avião? ");
		modelo = ler.next();
		System.out.println("Qual o companhia aéria? ");
		linha = ler.next();
		System.out.println("Qual a capacidade de passageiros? ");
		passageiro = ler.nextInt();
		
		ClasseAvioes ultrafinoSlin = new ClasseAvioes(modelo, linha, passageiro);//crinado um objeto
		
		ultrafinoSlin.voar();
		ultrafinoSlin.pousar();
		ultrafinoSlin.ler();
	}

}
