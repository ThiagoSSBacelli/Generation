package JavaAulaUm;

import java.util.Scanner;

/*Construa um programa em c que, tendo como dados 
  de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
  escreva a distância entre eles. A fórmula que efetua tal cálculo é:*/

public class PlanoXY1e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double x, xp, yp, y, x1, x2, y1, y2, distancia;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Estre com o primeiro valor: ");	
		x1 = ler.nextDouble();
		System.out.println("Estre com o segundo valor: ");	
		y1 = ler.nextDouble();
		System.out.println("Estre com o terceiro valor: ");	
		x2 = ler.nextDouble();
		System.out.println("Estre com o quarto valor: ");	
		y2 = ler.nextDouble();
		
		x = Math.pow(x2 - x1, 2);
		y = Math.pow(y2 - y1, 2);
		/*x = x2 - x1;
		xp = Math.pow(x, 2);
		y = y2 - y1;
		yp = Math.pow(y, 2);
		
		distancia = xp + yp;*/
		
		distancia = x + y;
		
		System.out.println("A sua distancia é: " + distancia);
	}

}
