package JavaAulaUm;

import java.util.Scanner;

/*Faça um sistema que leia as 3 notas de um aluno e
  calcule a média final deste aluno. Considerar que
  a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente*/

public class MediaDoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1, nota2, nota3, notaFinal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva a primeira nota: ");
		nota1 = ler.nextDouble(); 
		System.out.println("Escreva a segunda nota: ");
		nota2 = ler.nextDouble(); 
		System.out.println("Escreva a terceira nota: ");
		nota3 = ler.nextDouble();
		
		nota1 = nota1 * 2;
		nota2 = nota2 * 3;
		nota3 = nota3 * 5;
		
		notaFinal = (nota1 + nota2 + nota3) / 10;
		
		System.out.println("Sua nota final é: " + notaFinal);
	
	}

}
