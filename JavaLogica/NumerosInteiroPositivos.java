package JavaAulaUm;

import java.util.Scanner;

/*Escreva  um sistema que leia três números 
 inteiros e positivos (A, B, C) e calcule a seguinte expressão:
  D = R + S dividido 2 onde R = A + B Elevado 2 e S = B + C Elevado 2 */

public class NumerosInteiroPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c, r, s, d; 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva o numero A: ");
		a = ler.nextDouble();
		System.out.println("Escreva o numero B: ");
		b = ler.nextDouble();
		System.out.println("Escreva o numero C: ");
		c = ler.nextDouble();
		
		r = Math.pow(a + b, 2);
		s = Math.pow(b + c, 2);	
		d = (r + s) / 2;
		
		System.out.println("O Resultado é: " + d);
	
	}

}
