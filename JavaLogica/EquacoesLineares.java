package JavaAulaUm;

import java.util.Scanner;

/*Um sistema de equações lineares do tipo: 
  pode ser resolvido segundo mostrado abaixo : 
  Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.*/ 

public class EquacoesLineares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double a, b, c, d, e ,f, x, y, resultadoX, resultadoY;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva o numero A: ");
		a = ler.nextDouble();
		System.out.println("Escreva o numero B: ");
		b = ler.nextDouble();
		System.out.println("Escreva o numero C: ");
		c = ler.nextDouble();
		System.out.println("Escreva o numero D: ");
		d = ler.nextDouble();
		System.out.println("Escreva o numero E: ");
		e = ler.nextDouble();
		System.out.println("Escreva o numero F: ");
		f = ler.nextDouble();
		
		resultadoX = (c * e) - (b * f) / (a * e) - (b * d);
		resultadoY = (a * f) - (c * b) / (a * e) - (b * d);
		
		System.out.println("O resultado de X é: " + resultadoX);
		System.out.println("O resultado de Y é: " + resultadoY);
	}

}
