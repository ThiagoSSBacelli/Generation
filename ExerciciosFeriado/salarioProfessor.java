package ExerciciosFeriado;

import java.util.Scanner;

public class salarioProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double horaAula, horasAulasDadas, inss = 11, valorBruto, valorLiquido, valorComDesconto;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantas horas de aula voce deu esse mês: ");
		horaAula = ler.nextDouble(); 
		System.out.println("Qual valor da hora por aula: ");
		horasAulasDadas = ler.nextDouble(); 
		
		valorBruto = horaAula * horasAulasDadas;
		
		valorComDesconto = (valorBruto * inss) / 100;
		
		valorLiquido = 	valorBruto - valorComDesconto;
		
		System.out.println("O valor que voce recebera por H/a é de: " + valorLiquido + "R$");
	}

}
