package projetoModulo1;

import java.util.Scanner;

public class Diretoria extends Pessoa {

	private String feedbackProfessor;

	public Diretoria()// Construtor vazio
	{

	}

	public Diretoria(int id, String nome, String tipo, String turma, int idade, int senha) {
		super(id, nome, tipo, turma, idade, senha);

	}

	public Alunos adicionarAluno() {

		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com o Id do Aluno:");
		int id = ler.nextInt();

		System.out.println("Entre com o nome do aluno:");
		String nome = ler.next();

		String tipo = "aluno";

		System.out.println("Entre com a turma do aluno:");
		String turma = ler.next();

		System.out.println("Entre com a idade do Aluno:");
		int idade = ler.nextInt();

		System.out.println("Entre com a senha do Aluno:");
		int senha = ler.nextInt();

		return new Alunos(id, nome, tipo, turma, idade, senha);
	}

}
