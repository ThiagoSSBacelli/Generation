package PrimeiraAulaPOO;

import java.util.Scanner;

public class ClasseEletronicos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//String celular, fone, carregador;
		String celular;
		String fone;
		String carregador;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o modelo do seu celular? ");
		celular = ler.next();
		System.out.println("Qual o modelo do seu fone? ");
		fone = ler.next();
		System.out.println("Qual o tipo do seu carregador? ");
		carregador = ler.next();
		
		ClasseEletronicos MeuCelular = new ClasseEletronicos(celular, fone, carregador);
		
		MeuCelular.celular();
		MeuCelular.fone();
		MeuCelular.ler();
	}

}
